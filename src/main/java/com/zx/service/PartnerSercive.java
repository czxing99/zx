package com.zx.service;

import com.zx.dao.AxLogMapper;
import com.zx.dao.CustomerMapper;
import com.zx.dao.PartnerMapper;
import com.zx.po.mysql.Customer;
import com.zx.po.sqlserver.AxLog;
import com.zx.po.sqlserver.InventoryClass;
import com.zx.po.sqlserver.Partner;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PartnerSercive {
    @Resource
    private CustomerMapper customerMapper;
    @Resource
    private PartnerMapper partnerMapper;
    @Resource
    private AxLogMapper axLogMapper;

    public List<Customer> updateCustomer(){
        DataSourceTypeManager.set(DataSources.SLAVE);
        String sql ="  select a.* from b_customer a where  a.code <> '0'and not exists(\n" +
                "    select 1  from ax_log b where voucher_type = '03'  and ( success = '1' or (success ='0' and cnt <  3))\n" +
                "    and b.voucher_code = a.code  \n" +
                "    )";
        List<Customer> lists =  customerMapper.selectSql(sql);
        for(Customer customer:lists){
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("03");
            axLog.setVoucherCode(customer.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
        }
        return lists;
    }
    public boolean updatePartner(List<Customer> list){
        System.out.println("===========================3");
        DataSourceTypeManager.set(DataSources.MASTER);
        for(Customer customer:list){
            Partner partner  = new Partner();
            //四类客户转对应分类 0123， 0104-3 0103-4 0102-5 0101-6(code-id)
            int classId = 0;
            int a= customer.getC_type();
            switch (a){
                case 0:
                    classId = 3;
                    break;
                case 1:
                    classId = 4;
                    break;
                case 2:
                    classId = 5;
                    break;
                case 3:
                    classId = 6;
                    break;
                    default:
                        break;

            }
            System.out.println(classId+"========================");
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("03");
            axLog.setVoucherCode(customer.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
            //  名称相同，不导入
            String name = customer.getName();
            String sql = "select * from aa_partner where name = '"+name+"'";
            List<Partner> list1 = partnerMapper.selectSql(sql);
            if(list1.size()>0) continue;
            partner.setName(name);
            partner.setCode(customer.getCode());
            partner.setIdpartnerclass(classId);
            partnerMapper.insert(partner);



        }
        return true;
    }
}
