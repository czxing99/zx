package com.zx.autoCoder.service;


import com.zx.autoCoder.dao.MySqlMapper;
import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.TableName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import java.util.List;

@Service
public class MysqlService {
    @Autowired
    private MySqlMapper mySqlMapper;

    public List<TableName> getAll(){
        //DataSourceTypeManager.set(DataSources.SLAVE);
        return mySqlMapper.getAll();
    }
    public List<ColumnName> getTableColumns(String tableName){
       // DataSourceTypeManager.set(DataSources.SLAVE);
		String a = "";

        return mySqlMapper.getTableColumn(tableName);
    }
}
