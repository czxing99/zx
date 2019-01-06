package com.zx.autoCoder.service;

import com.zx.autoCoder.dao.SqlServerMapper;
import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.TableName;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;
import java.util.List;

@Service
public  class SqlServerService {
    @Resource
    private SqlServerMapper sqlServerMapper;

    public List<TableName> getAll(){

        DataSourceTypeManager.set(DataSources.MASTER);
        return sqlServerMapper.getAll();
    }
    public List<ColumnName> getTableColumn(String tableName){
        DataSourceTypeManager.set(DataSources.MASTER);
        return sqlServerMapper.getTableColumn(tableName);
    }
}
