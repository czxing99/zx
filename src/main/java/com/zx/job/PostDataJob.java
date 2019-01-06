package com.zx.job;

import com.zx.po.sqlserver.InventoryClass;
import com.zx.service.InventoryClassService;
import com.zx.service.RInventoryClassService;
import com.zx.service.TestService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
public class PostDataJob {

    @Resource
    private TestService testService;

    @Resource
    private InventoryClassService inventoryClassService;
    @Resource
    private RInventoryClassService rinventoryClassService;

    public void execute(){
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");

        List<InventoryClass> lists =  inventoryClassService.updateQuerylast();
        if(lists.size()==0) return;
        try{
            rinventoryClassService.updateReceiveInventory(lists);
        }catch(Exception e){
            log.info(e.getMessage());
        }
        log.info("Today="+d.format(new Date()));
    }
}
