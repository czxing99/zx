package org.zx.mybatis.po;

public class Column {
    /**数据库列*/
    private String dbName ;
    /** beanName*/
    private String BeanName;
    /**数据类型*/
    private String dateType ;
    /**字符长度*/
    private long length ;
    /**是否主键*/
    private Boolean key=false;
    /**主键类型 */
    private String  keyType = "";
    private boolean hasNull ;

    public boolean isHasNull() {
        return hasNull;
    }

    public void setHasNull(boolean hasNull) {
        this.hasNull = hasNull;
    }

    @Override
    public String toString() {
        return "Column{" +
                "dbName='" + dbName + '\'' +
                ", BeanName='" + BeanName + '\'' +
                ", dateType='" + dateType + '\'' +
                ", length=" + length +
                ", key=" + key +
                ", keyType='" + keyType + '\'' +
                '}';
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getBeanName() {
        return BeanName;
    }

    public void setBeanName(String beanName) {
        BeanName = beanName;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
}
