package com.zx.service;

import com.zx.autoCoder.dao.MySqlMapper;
import com.zx.dao.TestBMapper;
import com.zx.dao.TestMapper;
import com.zx.po.Test;
import com.zx.po.TestB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TestBMapper testBMapper;
    @Autowired
    private MySqlMapper mySqlMapper;

    public int insert(Test test){
        int  a = testMapper.insert(test);
        return a;
    }
    /*public Test find(int id){
        return testMapper.find(id);
    }
    public int inseta(Test test){
        return testMapper.inserta(test);
    }

    public int insetb(Test test){
        return testMapper.insertbuilder(test);
    }*/
    public int insertTestB(TestB testB){
        DataSourceTypeManager.set(DataSources.SLAVE);
        return testBMapper.insert(testB);
    }
    public int insertTestB1(TestB testB){
        DataSourceTypeManager.set(DataSources.MASTER);
        return testBMapper.insert(testB);
    }
  /*  public Map<String,Object> select(TestB b){
       // return testBMapper.select(TestB.class);
    }*/
  public int insertTable(){
      DataSourceTypeManager.set(DataSources.SLAVE);
      String sql ="create table ax_log2(\n" +
              "id int auto_increment primary key,\n" +
              "voucher_type varchar(2),\n" +
              "voucher_code varchar(100),\n" +
              "success varchar(1),\n" +
              "operate_time date ,\n" +
              "cnt int\n" +
              ");";
      mySqlMapper.createDdl(sql);
      return 1;
  }
}
