package com.zx.autoCoder.service;


import com.zx.autoCoder.dao.Db2Mapper;
import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.TableName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Db2Service {
    @Autowired
    private Db2Mapper db2Mapper;

    public List<TableName> getAll(){
        return db2Mapper.getAllAsPostgres();
    }

    public List<ColumnName> getTableColumns(String tableName){
        return db2Mapper.getTableColumn(tableName);
    }
    public List<ColumnName> getVoucherColumn(Map map){
        return db2Mapper.getVoucherColumn(map);
    }

}
