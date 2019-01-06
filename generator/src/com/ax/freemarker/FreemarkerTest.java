package com.ax.freemarker;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import org.ax.tools.template.FreemarkerUtils;

import javax.sound.midi.SoundbankResource;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreemarkerTest {


    public static void main(String[] args) {
        // Create the root hash
        Map<String, Object> root = new HashMap<String, Object>();

// Put string ``user'' into the root
        root.put("user", "Big Joe1");
        // Create the hash for ``latestProduct''
        Map<String, Object> latest = new HashMap<>();
// and put it into the root
        root.put("latestProduct", latest);
// put ``url'' and ``name'' into latest
        latest.put("url", "products/greenmouse.html");
        latest.put("name", "green mouse");


        try {
            /*
            Configuration cfg = new Configuration();

            TemplateLoader templateLoader=null;
            String path="";

            templateLoader=new ClassTemplateLoader(FreemarkerTest.class,"");
            path="test.ftl";

            cfg.setTemplateLoader(templateLoader);
            Template t=cfg.getTemplate(path,"UTF-8");
            Writer out = new OutputStreamWriter(System.out);
            t.process(root, out);*/

            Configuration cfg = new Configuration();

            cfg.setDirectoryForTemplateLoading(

                    new File(""));

            cfg.setObjectWrapper(new DefaultObjectWrapper());

            /* 在整个应用的生命周期中，这个工作你可以执行多次 */

            /* 获取或创建模板*/

            // Template temp = cfg.getTemplate("test.ftl");
            //Template temp = cfg.getTemplate("D:/axing_idea/axApp/src/main/java/com/ax/freemarker/test.ftl");
            File path1 = new File(System.getProperty("user.dir") + "/src/main/java/com/ax/freemarker");
            System.out.println(System.getProperty("user.dir"));

            cfg.setDirectoryForTemplateLoading(path1);
            cfg.setObjectWrapper(new DefaultObjectWrapper());
            //获得模板
            Template temp = cfg.getTemplate("test.ftl");
           /* Writer out = new OutputStreamWriter(System.out);
            temp.process(root, out);*/

            Writer writer = new OutputStreamWriter(new FileOutputStream("src/main/java/com/ax/freemarker/success.html"), "UTF-8");
//            temp.process(root, writer);
//            temp.process(root,new FileWriter("E:\\bb.html"));
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
