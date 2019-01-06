package com.zx.dao;

import com.zx.po.Test;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.zx.mybatis.dao.BaseMapper;
import org.zx.mybatis.dao.BaseTestMapper;

public interface TestMapper extends BaseMapper<Test> {
    int inserta(Test record);

    int insertSelective(Test record);

    /*@SelectProvider(type=BaseTestMapper.class, method="findTest")
    Test find(int id );

    @InsertProvider(type=BaseTestMapper.class,method="insert")
    *//*@Options(useGeneratedKeys = true, keyProperty = "id")*//*
    int inserta(Test test);

    @InsertProvider(type=BaseTestMapper.class,method="insertbuilder")
    int insertbuilder(Test test);*/
}