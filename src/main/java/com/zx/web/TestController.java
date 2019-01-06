package com.zx.web;

import com.zx.po.TestB;
import com.zx.po.sqlserver.InventoryClass;
import com.zx.service.InventoryClassService;
import com.zx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/common")
public class TestController {
    @Resource
    private TestService testService;

    @Resource
    private InventoryClassService inventoryClassService;

    @RequestMapping("/hello")
    public String hello(){
        return "/common/hello";
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(TestB testB){
        return  testService.insertTestB(testB);
    }

     /*   @RequestMapping("/query")
    @ResponseBody
    public List<InventoryClass> query()
    {
        return  inventoryClassService.querylast();
    }*/
     @RequestMapping("/create")
     @ResponseBody
     public int create(){
        testService.insertTable();
         return 1 ;


     }
}
