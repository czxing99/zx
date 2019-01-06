package com.zx.job;


import com.zx.po.mysql.Customer;
import com.zx.po.sqlserver.Inventory;
import com.zx.service.InventoryService;
import com.zx.service.PartnerSercive;
import com.zx.service.RInventoryClassService;
import com.zx.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
public class PostCustomerJob {

    @Resource
    private TestService testService;

    @Resource
    private InventoryService inventoryService;
    @Resource
    private RInventoryClassService rinventoryClassService;
    @Resource
    private PartnerSercive partnerSercive;

    public void execute(){
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");

        List<Customer> lists =  partnerSercive.updateCustomer();
        if(lists.size()==0) return;
        try{
            partnerSercive.updatePartner(lists);
        }catch(Exception e){
            log.info(e.getMessage());
        }
        log.info("Today="+d.format(new Date()));

    }
}
