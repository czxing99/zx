package org.zx.tools.autoCoder;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.zx.tools.servlet.WebUtil;

import java.io.*;
import java.util.Map;

@Slf4j
public class FreemarkUtil {
    public static Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
    static {
        cfg.setDefaultEncoding("UTF-8");
        //单例
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        try {
            //File path1 = new File(WebUtil.getRootPath()+"WEB-INF/classes/template/");
            File path1 = new File("D:\\axing_idea\\zx\\target\\zx\\"+"WEB-INF/classes/template/");
            cfg.setDirectoryForTemplateLoading(path1);
            cfg.setObjectWrapper(new DefaultObjectWrapper());
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
    }

    /**
     * 切换目录
     * @param model
     * @throws Exception
     */
    public static void setRoot(String model) throws Exception{

        File path = new File(WebUtil.getRootPath()+"WEB-INF/classes/template/"+model+"/");

        cfg.setDirectoryForTemplateLoading(path);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
    }

    /**
     * 根据模板和值返回字符串
     * @param root
     * @param model
     * @return
     * @throws Exception
     */
    public static String getString(Map root, String model) throws Exception{
        Template temp = FreemarkUtil.cfg.getTemplate(model);
        Writer writer = new StringWriter();
        temp.process(root, writer);
        return ((StringWriter) writer).getBuffer().toString();
    }

    /**
     * 根据模板写入文件
     * @param root
     * @param model
     * @param fileUrl
     * @throws Exception
     */
    public static void  getFile(Map root,String model,String fileUrl) throws Exception{
        Template temp = cfg.getTemplate(model);
        fileUrl ="D:/axing_idea/zx/freemarker/"+fileUrl;
        String[] fileDirs = fileUrl.split("/");
        String fileDir ="";
        for(int i = 0 ;i <fileDirs.length;i++){
            if(i !=fileDirs.length -1){
                fileDir += fileDirs[i] +"/";
            }
        }

        File outDir =new File(fileDir);
        outDir.mkdirs();
        Writer writer = new OutputStreamWriter(new FileOutputStream(fileUrl), "UTF-8");
        temp.process(root, writer);
        writer.flush();
        writer.close();
    }


}
