package com.zx.autoCoder.tools;

import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.Head;
import lombok.extern.slf4j.Slf4j;
import org.zx.myenum.DateType;
import org.zx.tools.autoCoder.FreemarkUtil;
import org.zx.tools.common.JsonMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class AutoCoderUtil {
    public static void getAutoCode(String columnJson, Head hr, String type) throws Exception{
        log.info( "开始生成"+type+"。。。。。。");
        Map<String, Object> root = new HashMap<String, Object>();

        // csarg 引入
        List<ColumnName> list = new ArrayList<ColumnName>();
        List<ColumnName> newList = new ArrayList<ColumnName>();
        list = JsonMapper.string2Obj(columnJson,new org.codehaus.jackson.type.TypeReference<ArrayList<ColumnName>>() {});
        for (ColumnName temp: list) {
            temp.setType(DateType.converSqlserver(temp.getType()));
            newList.add(temp);
        }
        root.put("csarg",newList);
        // hrarg 引入
        root.put("hrarg",hr);
        //atype 引入
        root.put("atype",type);
        String mid = "";
        String fileName = "";
        switch (type){
            case "po":
                mid = "po";
                fileName = hr.getClazzName()+".java";
                break;

            default:
                mid = "";
        }
        String fileUrlR = "src/"+hr.getBaseUrl().replace(".","/")+"/"+
                mid +"/"+
                hr.getModel()+"/" +fileName;
        if (type.indexOf("web")> -1 ) {
            fileUrlR = "WebContent/WEB-INF/pages/"+ hr.getModel()+"/" +fileName;
        }else if (type.indexOf("init")> -1){
            fileUrlR = "init/" +fileName;
        }
        FreemarkUtil.getFile(root,"index.ftl",fileUrlR);
        log.info(  "已经生成"+type+"。。。。。。");
    }



}
