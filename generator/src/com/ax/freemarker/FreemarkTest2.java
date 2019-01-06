package com.ax.freemarker;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreemarkTest2 {
    public static void main(String[] args) {
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("user", "Big Joe1");

        Map<String, Object> latest = new HashMap<>();
        root.put("latestProduct", latest);
        latest.put("url", "products/greenmouse.html");
        latest.put("name", "green mouse");
        latest.put("price",10);
        latest.put("price1",20);
        //测试对象
        Product p = new Product();
        p.setName("abc");
        p.setUrl("www.baidu.com");
        Product p1 = new Product();
        p1.setName("abc1");
        p1.setUrl("www.baidu.com1");
        root.put("object",p);
        List products = new ArrayList<Product>();
        products.add(p);
        products.add(p1);
        root.put("products",products);



        try {
            Configuration cfg = new Configuration();
            File path1 = new File(System.getProperty("user.dir") + "/src/main/java/com/ax/freemarker");
            cfg.setDirectoryForTemplateLoading(path1);
            cfg.setObjectWrapper(new DefaultObjectWrapper());
            Template temp = cfg.getTemplate("test.ftl");
            Writer writer1 = new StringWriter();
            temp.process(root, writer1);
            System.out.println("");
            System.out.println("==================");
            System.out.println(((StringWriter) writer1).getBuffer().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
