package com.test.mybatis;

import com.zx.dao.TestBMapper;
import com.zx.dao.TestMapper;
import com.zx.po.TestB;
import com.zx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.zx.mybatis.PoCheck;
import org.zx.mybatis.dao.BaseMapper;
import org.zx.spring.context.ApplicationContextHelper;

import javax.sound.midi.SoundbankResource;
import java.util.List;
import java.util.Map;

@ContextConfiguration("classpath*:/spring/*.xml")
public class DdlTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    public TestService testService;
    @Autowired
    public TestBMapper testBMapper;
    @Autowired
    public TestMapper testMapper;

    @Test
    @Rollback(false)
    public void insert(){
        com.zx.po.Test t = new com.zx.po.Test();
        t.setName("111333");
        testService.insert(t);
        System.out.println(t.getId());

    }
    @Test
    public void find(){
        int i = 2;
        //com.zx.po.Test test = testService.find(i);
        //System.out.println(test.toString());
    }
    @Test
    @Rollback(false)
    public void inserta(){
        com.zx.po.Test t = new com.zx.po.Test();
        t.setName("abc");
        //testService.inseta(t);
        System.out.println("================="+t.getId());
    }
    @Test
    @Rollback(false)
    public void insertBuilder(){
        com.zx.po.Test t = new com.zx.po.Test();
        t.setName("aaab");
        t.setTestId(1);
        testService.insert(t);
        System.out.println("================="+t.getId());
    }
    @Test

    public void insertBBuilder(){
        com.zx.po.TestB t = new com.zx.po.TestB();
        t.setName("abc2d");
        t.setCode("0002");
        //  这个时候校验

        int i = testService.insertTestB(t);
       // System.out.println("================="+t.getId());
        System.out.println(i);
    }
    @Test
    @Rollback(false)
    public void selectTestB()throws Exception{
        com.zx.po.TestB t = new com.zx.po.TestB();
        t.setName("abcd");
        t.setCode("0001");
        PoCheck.check(t);
        //  这个时候校验
       // List<TestB> ts =testBMapper.find(t);
        //List<TestB> ts  = testBMapper.selectSql("select * from test_b where id = 1");
        //List<TestB> ts  = testBMapper.selectSql("select * from test_b where id = 1");
        //List<Map<String,Object>> ts  = testBMapper.selectSqlMap("select * from test_b where id = 1");
        //List<Map<String,Object>> ts1 = ApplicationContextHelper.popBean(TestBMapper.class).selectSqlMap("select * from test_b where id = 1");
        //System.out.println(ts.size());
    }
    @Test
    public void checkTeset()throws Exception{
        com.zx.po.Test t = new com.zx.po.Test();
        t.setBId("000");
        t.setName("test");
        try {
            PoCheck.check(t);
            System.out.println(t.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    @Rollback(false)
    public void delete()throws Exception{
        com.zx.po.Test t = new com.zx.po.Test();
        t.setBId("000");
        t.setName("test");
        t.setId(12);
        try {
            testMapper.delete(t);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Rollback(false)
    public void inventoryClass()throws Exception{
        com.zx.po.Test t = new com.zx.po.Test();
        t.setBId("000");
        t.setName("test");
        t.setId(12);
        try {
            testMapper.delete(t);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
