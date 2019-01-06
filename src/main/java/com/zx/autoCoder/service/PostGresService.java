package com.zx.autoCoder.service;


import com.zx.autoCoder.dao.PostGresMapper;
import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.TableName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PostGresService {
    @Autowired
    private PostGresMapper postGresMapper;

    public List<TableName> getAll(){
        return postGresMapper.getAllAsPostgres();
    }


    public List<ColumnName> getTableColumns(String tableName){
        return postGresMapper.getTableColumn(tableName);
    }
    public List<ColumnName> getVoucherColumn(Map map){
        return postGresMapper.getVoucherColumn(map);
    }

}
