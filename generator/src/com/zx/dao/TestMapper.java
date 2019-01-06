package com.zx.dao;

import com.zx.po.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}