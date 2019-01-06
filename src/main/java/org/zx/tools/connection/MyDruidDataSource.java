package org.zx.tools.connection;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.zx.tools.xml.XmlUtil;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.util.Properties;

@Slf4j
public class MyDruidDataSource extends DruidDataSource {

    public MyDruidDataSource(){
        //抓db.server 11
        String dbServer = "";
        Resource dbResource = new ClassPathResource("config/common.properties");
        try {
            Properties  properties = PropertiesLoaderUtils.loadProperties(dbResource);
            dbServer =  properties.getProperty("db.server");
            Resource dbXmlResource = new ClassPathResource("config/db.xml") ;
            SAXReader saxReader = new SAXReader();
            File file  = dbXmlResource.getFile();
            Document document = saxReader.read(file);

            String root = ".//xml//database[@id='"+dbServer+"']/";
            setDriverClassName(XmlUtil.getNodeValue(document,root,"driverClassName"));
            setUrl(XmlUtil.getNodeValue(document,root,"url"));
            setUsername(XmlUtil.getNodeValue(document,root,"username"));
            setPassword(XmlUtil.getNodeValue(document,root,"password"));
            setInitialSize(Integer.parseInt(XmlUtil.getNodeValue(document,root,"initialSize")));
            setMinIdle(Integer.parseInt(XmlUtil.getNodeValue(document,root,"minIdle")));
            setMaxActive(Integer.parseInt(XmlUtil.getNodeValue(document,root,"maxActive")));
            setMaxWait(Long.parseLong(XmlUtil.getNodeValue(document,root,"maxWait")));
            setFilters(XmlUtil.getNodeValue(document,root,"filters"));
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }


}
