package org.zx.mybatis.dao;

import com.zx.po.Test;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.SqlBuilder;
@Slf4j
public class BaseTestMapper{
    public String findTest(int id ) {
        return "SELECT id, name from test where id =" + id;
    }
    public String insert (Test t){
        return "insert into test values('"+t.getName()+"')";
    }
    public String insertbuilder(Test t ){
       return insertUserSql(t);
    }
    public String insertUserSql(Test test) {
      /*  BEGIN();
        INSERT_INTO("test");
        *//*VALUES("name", "#{name}");
        VALUES("test_Id", "#{testId}");*//*
        VALUES("name,test_Id", "#{name},#{testId}");

        String sql = SQL().toString();
        log.info(sql);
        return sql;*/
        return "";
    }
}
