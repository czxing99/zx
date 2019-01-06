package org.zx.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.jdbc.SqlBuilder;
import org.zx.mybatis.po.Table;

@Slf4j
public class BaseProvider<T> {
    public String insert(Object o ) {
        Table t = new Table (o);
        return t.getInsertSql();
    }
    public String select(T t ){
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("test_b");
        sql.WHERE("code =#{code}");
        return sql.toString();
    }
    public String selectSql (String sql){
        return  sql;
    }
    public String selectSqlMap (String sql){
        return  sql;
    }
    public String delete(Object o ) {
        Table t = new Table (o);
        return t.getDeleteSql();
    }
}
