package com.zx.autoCoder.web;

import com.zx.autoCoder.po.ColumnName;
import com.zx.autoCoder.po.Head;
import com.zx.autoCoder.po.TableName;
import com.zx.autoCoder.service.MysqlService;
import com.zx.autoCoder.service.SqlServerService;
import com.zx.autoCoder.tools.AutoCoderUtil;
import com.zx.tools.common.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.zx.tools.autoCoder.FreemarkUtil;
import org.zx.tools.common.JsonMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/autoCoderMysql")

public class MysqlController {

    @Resource
    private MysqlService mysqlService;
    @RequestMapping("/index")
    public ModelAndView  index(){
        List<TableName> tableList = mysqlService.getAll();

        ModelAndView m = new ModelAndView();
        m.addObject("root","zx");
        m.addObject("page",tableList);
        m.setViewName("/autoCoder/mysqlindex");
        return m ;
    }
    @RequestMapping("/getColumnName")
    @ResponseBody
    public List<ColumnName> getColumnName(@Param("tableName") String tableName){
    	log.info("aaa");
    	String a = tableName;
        List<ColumnName> lists = mysqlService.getTableColumns(tableName);
        List<ColumnName> newLists = new ArrayList<ColumnName>();
        for (ColumnName temp:lists) {
            String[] beanNames = temp.getName().split("_");
            String beanName = "";
            String beanNameAll = "";
            for (int i = 0; i < beanNames.length; i++) {
                if (i > 0) {
                    beanName = StringUtil.toUpperCaseFirstOne(beanNames[i]);
                } else {
                    beanName = beanNames[i];
                }
                beanNameAll += beanName;
            }
            temp.setBeanName(beanNameAll);
            newLists.add(temp);
        }
        return newLists;
    }
    @RequestMapping("/auto")
    @ResponseBody
    public Map auto(HttpServletRequest request, HttpServletResponse response){
        String data = request.getParameter("data");
        String model = request.getParameter("model");
        String clazzName = request.getParameter("clazzName");
        String memo  = request.getParameter("memo");
        String tableName = request.getParameter("tableName");
        String simpleName = request.getParameter("simpleName");
        log.info(data);
       Map  map = new HashMap<String,String>();
        List<ColumnName> list = new ArrayList<ColumnName>();
        list = JsonMapper.string2Obj(data,new org.codehaus.jackson.type.TypeReference<ArrayList<ColumnName>>() {
        });
        try {
            Head head = Head.builder().baseUrl("com.zx").
                    serUID(StringUtil.getOrderNo())
                    .author("ax")
                    .tableName(tableName)
                    .clazzName(clazzName)
                    .model("mysql")
                    .type("id")
                    .memo("autocoding")
                            .build();
            FreemarkUtil.setRoot("mysql");
            AutoCoderUtil.getAutoCode(data, head, "po");

        }catch (Exception e) {
                      log.info(e.getMessage());
        }
        map.put("success", "ok");
        return map;
    }
}
