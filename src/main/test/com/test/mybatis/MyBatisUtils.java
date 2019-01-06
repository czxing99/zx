package com.test.mybatis;



import org.apache.ibatis.jdbc.SqlBuilder;

public class MyBatisUtils  {

    public String selectUserSql() {
        SqlBuilder.BEGIN();
        SqlBuilder.SELECT("*");
        SqlBuilder.FROM("UserDto");
        return SqlBuilder.SQL();
    }

    public String deleteUserSql() {
        SqlBuilder.BEGIN();
        SqlBuilder.DELETE_FROM("UserDto");
        SqlBuilder.WHERE("username = #{username}");
        return SqlBuilder.SQL();
    }

    public String insertUserSql() {
        SqlBuilder.BEGIN();
        SqlBuilder.INSERT_INTO("UserDto");
        SqlBuilder.VALUES("username", "#{username}");
        SqlBuilder. VALUES("password", "#{password}");
        SqlBuilder.VALUES("address", "#{address}");
        SqlBuilder.VALUES("age", "#{age}");
        SqlBuilder.VALUES("sex", "#{sex}");
        return SqlBuilder.SQL();
    }

    public String updateUserSql() {
        SqlBuilder.BEGIN();
        SqlBuilder.UPDATE("UserDto");
        SqlBuilder. SET("password = #{password}");
        SqlBuilder.WHERE("username = #{username}");
        return SqlBuilder.SQL();
    }

    public static void main(String[] args) {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        System.out.println("查询 = " + myBatisUtils.selectUserSql());
        System.out.println("删除 = " + myBatisUtils.deleteUserSql());
        System.out.println("插入 = " + myBatisUtils.insertUserSql());
        System.out.println("更新 = " + myBatisUtils.updateUserSql());
    }
}
