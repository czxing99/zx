package org.zx.mybatis.po;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.SQL;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Table {
    private String name ;
    private String desc;
    private List<Column> columns = new ArrayList<Column>();
    private Object o ;
    public Table(Object o){
        this.o = o;
        setName("");
        setColumns(null);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {

        boolean hasAnnotation =  o.getClass().isAnnotationPresent(AxTable.class);
        if(hasAnnotation){
            AxTable axTable = o.getClass().getAnnotation(AxTable.class);
            name = axTable.name();
        }
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        ArrayList<Column> newColumns = new ArrayList<>();
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(int i = 0 ;i <fields.length;i++){

            boolean flag = fields[i].isAnnotationPresent(AxId.class);
            flag = flag || fields[i].isAnnotationPresent(AxColumn.class);
            if(!flag) continue;

            Column column = new Column();
            fields[i].setAccessible(true);
            AxId axid =  fields[i].getAnnotation(AxId.class);
            if(axid !=null){
                column.setKey(true);        // 是否主键
                if(axid.type().length()>0){
                  column.setKeyType(axid.type());  //   主键类型
                }
            }
            AxColumn axColumn = fields[i].getAnnotation(AxColumn.class);
            if(axColumn != null){
                column.setDbName(axColumn.name());  // 列名
                column.setBeanName(fields[i].getName());//  beanName
                if("1".equals(axColumn.isNull())){
                    column.setHasNull(true);
                }else
                    column.setHasNull(false);
            }
            newColumns.add(column);
        }
        this.columns = columns == null?newColumns:columns;
    }
    public String getInsertSql(){
        SQL sql = new SQL();

        sql.INSERT_INTO(name);
        for (Column column :columns  ) {
            /*if(column.getKey()){
                if(!"id".equals(column.getKeyType())){
                    sql.VALUES(column.getDbName(), "#{"+column.getBeanName()+"}");
                   // sql.VALUES(column.getDbName(), "#{"+column.getBeanName()+"}");
                }
                continue;
            }else
                sql.VALUES(column.getDbName(), "#{"+column.getBeanName()+"}");*/


                if(!"id".equals(column.getDbName()) && !column.isHasNull()){
                    sql.VALUES(column.getDbName(), "#{"+column.getBeanName()+"}");
                }


        }
        String temp = sql.toString();
        log.info(temp);
        return sql.toString();
    }
    public String getDeleteSql(){
        SQL sql = new SQL();
        sql.DELETE_FROM(name);
        for(Column column:columns){
            if(!column.getKey()) continue;
            sql.WHERE(column.getDbName()+"=#{"+column.getBeanName()+"}");
        }
        return  sql.toString();

    }

    public static void main(String[] args) {
        /*Test t = new Test();
        Table table = new Table(t);
        System.out.println(table.getInsertSql());*/
    }
}
