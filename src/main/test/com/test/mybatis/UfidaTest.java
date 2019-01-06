package com.test.mybatis;

import com.zx.dao.TestBMapper;
import com.zx.dao.TestMapper;
import com.zx.po.TestB;
import com.zx.service.InventoryClassService;
import com.zx.service.RInventoryClassService;
import com.zx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.zx.mybatis.PoCheck;

import java.util.List;

@ContextConfiguration("classpath*:/spring/*.xml")
public class UfidaTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    public TestService testService;
    @Autowired
    public TestBMapper testBMapper;
    @Autowired
    public TestMapper testMapper;
    @Autowired
    public InventoryClassService inventoryClassService;
    @Autowired
    public RInventoryClassService rinventoryClassService;



    @Test
    @Rollback(false)
    public void inventoryClass()throws Exception{
        //List list = inventoryClassService.querylast();
       // rinventoryClassService.updateReceiveInventory();

    }
}
