package org.zx.mybatis;

import com.zx.dao.TestBMapper;
import com.zx.dao.TestMapper;
import com.zx.po.TestB;
import org.springframework.util.StringUtils;
import org.zx.mybatis.dao.BaseMapper;
import org.zx.mybatis.po.Table;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.context.ApplicationContextHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class PoCheck {
    public static void check(Object o) throws Exception{
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields
             ) {
            boolean flag =  field.isAnnotationPresent(AxColumn.class);
            if (!flag) continue;
            AxColumn axColumn = field.getAnnotation(AxColumn.class);
            if(axColumn !=null){
                if(!"java.lang.Object".equals(axColumn.clazz().getName())){
                    field.setAccessible(true);
                    Object code = new Object();
                    code = field.get(o);
                    Class fkClass = axColumn.clazz();
                    Object fkClassO = fkClass.newInstance();
                    Table t = new Table(fkClassO);
                    String[] value =  axColumn.fk().split(",");
                    String  sql = "select  * from "+t.getName()+" where "+value[1] +"='"+code+"'";
                    Object oMapper = ApplicationContextHelper.popBean(axColumn.clazzMapper());
                    Method[] methods = axColumn.clazzMapper().getDeclaredMethods();
                    List fkClassOs = ((BaseMapper)oMapper).selectSql(sql);
                    if(fkClassOs.size() > 0){
                        fkClassO =((BaseMapper)oMapper).selectSql(sql).get(0);
                        Field[] fkClasOFs = fkClass.getDeclaredFields();
                        for (Field f: fkClasOFs) {
                            if (value[0].equals(f.getName())){
                                f.setAccessible(true);
                                Object id = f.get(fkClassO);
                                System.out.println(id);
                                //  把id 插入原值
                                //Todo  传值为String 接收为id，数据原型如何定义，得思考
                                field.set(o,id.toString());
                            }
                        }
                    }else
                         throw new RuntimeException( code + axColumn.msg());
                }

            }

        }

    }
}
