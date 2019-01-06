package com.zx.service;

import com.zx.dao.AxLogMapper;
import com.zx.dao.InventoryClassMapper;
import com.zx.dao.SelectDetailMapper;
import com.zx.po.sqlserver.AxLog;
import com.zx.po.sqlserver.InventoryClass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;


import java.util.Date;
import java.util.List;


@Service
public class InventoryClassService {
    @Resource
    private InventoryClassMapper inventoryClassMapper;

    @Resource
    private AxLogMapper axLogMapper;

    @Resource
    private SelectDetailMapper selectDetailMapper;



    public List<InventoryClass> updateQuerylast(){
        DataSourceTypeManager.set(DataSources.MASTER);
        String sql ="  select a.* from aa_inventoryclass a where not exists(\n" +
                "    select 1  from ax_log b where voucher_type = '01'  and ( success = '1' or (success ='0' and cnt <  3))\n" +
                "    and b.voucher_code = a.code\n" +
                "    )";
        List<InventoryClass> lists =  inventoryClassMapper.selectSql(sql);

        for(InventoryClass inventoryClass:lists){
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("01");
            axLog.setVoucherCode(inventoryClass.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
        }
        return lists;
    }



    public boolean updateReceiveInventory(List<InventoryClass> lists){
        System.out.println("===========================");
        DataSourceTypeManager.set(DataSources.SLAVE);
        for(InventoryClass inventoryClass:lists){
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("01");
            axLog.setVoucherCode(inventoryClass.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
        }
        return true;
    }

}
