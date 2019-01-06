package org.zx.myenum;

public enum DateType {
    STRING, INT;

    public final static String  convert( String type ){
        if("aaa".equals(type)){
            return "1";
        }
        return "";
    }
    public final static String converPostGres(String type ){
        String msg = "";
        switch (type) {
            case "character varying":
                msg ="String";
                break;
            case "timestamp without time zone":
                msg = "Date";
                break;
            case "integer":
                msg = "int";
                break;
            default:
                msg = "String";

        }
        return msg;
    }
    public final static String converDb2(String type ){
        String msg = "";
        switch (type) {
            case "CHAR":
                msg ="String";
                break;
            case "TIMESTMP":
                msg = "Date";
                break;
            case "integer":
                msg = "int";
                break;
            case "VARCHAR":
                msg="String";
                break;
            case "SMALLINT":
                msg = "int";
                break;
            default:
                msg = "String";

        }
        return msg;
    }
    public final static String converSqlserver(String type ){
        String msg = "";
        switch (type) {
            case "nvarchar":
                msg ="String";
                break;
            case "datetime":
                msg = "Date";
                break;
            case "int":
                msg = "int";
                break;
            case "tinyint":
                msg = "int";
                break;
            case "decimal":
                msg = "double";
                break;
            case "double":
                msg = "double";
                break;
            default:
                msg = "String";

        }
        return msg;
    }
}
