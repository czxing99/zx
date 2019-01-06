package org.zx.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;
import org.zx.mybatis.BaseProvider;

public interface BaseMapper<T> {

    @InsertProvider(type=BaseProvider.class,method="insert")
    int insert(T t );

    @SelectProvider(type=BaseProvider.class,method="select")
    List<T> select(T t );

    @SelectProvider(type=BaseProvider.class,method="selectSql")
    List<T> selectSql(String sql  );
    @SelectProvider(type=BaseProvider.class,method="selectSqlMap")
    List<Map<String ,Object>> selectSqlMap(String sql  );

    @DeleteProvider(type=BaseProvider.class,method="delete")
    int delete(T t);

}
