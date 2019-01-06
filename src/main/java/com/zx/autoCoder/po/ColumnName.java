package com.zx.autoCoder.po;



public class ColumnName {
    /*序号*/
    private int id ;
    /*列名*/
    private String name;
    /*类型*/
    private String type;
    /*长度*/
    private int length;
    /*是否主键*/
    private boolean isKey;
    /*备注*/
    private String comment;
    /*po名称*/
    private String  beanName;
    /*是否是数据列*/
    private boolean isDataColumn;
    /**表名*/
    private String tableName;
    private ColumnName  detailColumnName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean getIsKey() {
        return isKey;
    }

    public void setIsKey(boolean key) {
        isKey = key;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public boolean isDataColumn() {
        return isDataColumn;
    }

    public void setDataColumn(boolean dataColumn) {
        isDataColumn = dataColumn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ColumnName getDetailColumnName() {
        return detailColumnName;
    }

    public void setDetailColumnName(ColumnName detailColumnName) {
        this.detailColumnName = detailColumnName;
    }
}
