package com.zx.po;

import com.zx.dao.TestBMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;

@Setter
@Getter
@ToString
@AxTable(name = "test")
public class Test {

    @AxId(type="id")
    @AxColumn(name ="id")
    private Integer id;

    @AxColumn(name="name")
    private String name;

    @AxColumn(name="test_id")
    private int  testId;

    @AxColumn(name="bId",clazz=TestB.class,clazzMapper = TestBMapper.class, fk="id,code",msg="存货编码不存在！")
    private String bId;

}