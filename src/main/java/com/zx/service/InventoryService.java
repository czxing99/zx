package com.zx.service;

import com.zx.dao.*;
import com.zx.po.mysql.Product;
import com.zx.po.sqlserver.AxLog;
import com.zx.po.sqlserver.Inventory;
import com.zx.po.sqlserver.InventoryClass;
import com.zx.po.sqlserver.Unit;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InventoryService {
    @Resource
    private AxLogMapper axLogMapper;
    @Resource
    private InventoryMapper inventoryMapper;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private InventoryClassMapper inventoryClassMapper;
    @Resource
    private UnitMapper unitMapper;

    public  List<Inventory> updateInventory(){
        DataSourceTypeManager.set(DataSources.MASTER);
        String sql ="  select a.* from aa_inventory a where not exists(\n" +
                "    select 1  from ax_log b where voucher_type = '02'  and ( success = '1' or (success ='0' and cnt <  3))\n" +
                "    and b.voucher_code = a.code\n" +
                "    )";
        List<Inventory> lists =  inventoryMapper.selectSql(sql);
        List<Inventory> newlists = new ArrayList<Inventory>();
        for(Inventory inventory:lists){
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("02");
            axLog.setVoucherCode(inventory.getCode());
            axLog.setOperateTime(new Date());
            String sql1 = "select * from aa_inventoryclass where id ="+ inventory.getIdinventoryclass()+"";
            List<InventoryClass> inventoryClasss =  inventoryClassMapper.selectSql(sql1);
            //分类名称
            inventory.setClassName(inventoryClasss.get(0).getName());
            sql1 ="select * from aa_unit where id = "+inventory.getIdunit();
            List<Unit> units = unitMapper.selectSql(sql1);
            inventory.setUnitName(units.get(0).getName());
            axLogMapper.insert(axLog);
            newlists.add(inventory);
        }
        return newlists;
    }
    public boolean updateProduct(List<Inventory> list) throws Exception{
        System.out.println("===========================");
        DataSourceTypeManager.set(DataSources.SLAVE);
        for(Inventory inventory :list){
            Product p = new Product();
            p.setName(inventory.getName());
            p.setCode(inventory.getCode());
          //  p.setSpec(inventory.getSpecification());
            p.setModel(inventory.getSpecification());
            String sql = "select * from aa_inventoryclass where id ="+ inventory.getIdinventoryclass()+"";
           // List<InventoryClass> inventoryClasss =  inventoryClassMapper.selectSql(sql);
            p.setCatalog(inventory.getClassName());
            p.setUnit(inventory.getUnitName());

            productMapper.insert(p);
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("02");
            axLog.setVoucherCode(inventory.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
        }
        return true;

    }

}
