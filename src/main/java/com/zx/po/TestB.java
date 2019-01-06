package com.zx.po;

import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;

@AxTable(name = "test_b")
public class TestB {

    @AxId(type = "id")
    @AxColumn(name ="id")
    private int id;

    @AxColumn(name ="name")
    private String name;

    @AxColumn(name ="code",isNull = "1")
    private String code;

    @Override
    public String toString() {
        return "TestB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
