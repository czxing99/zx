package com.zx.job;

import com.zx.po.mysql.Customer;
import com.zx.service.*;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
public class PostOrderJob {

    @Resource
    private TestService testService;

    @Resource
    private InventoryService inventoryService;
    @Resource
    private RInventoryClassService rinventoryClassService;
    @Resource
    private PartnerSercive partnerSercive;

    @Resource
    private OrderService orderService;

    public void execute(){
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");

        List<Map<String,Object>>  lists =  orderService.updateOrder();
        if(lists.size()==0) return;
        try{
            orderService.updateSaleOrder(lists);
        }catch(Exception e){
            log.info(e.getMessage());
        }
        log.info("Today="+d.format(new Date()));
    }
}
