package com.zx.autoCoder.po;

import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Head {
    /*项目路径*/
    private String baseUrl = "src/com/cx/hr/";
    /*模块*/
    private String model = "base";
    /**类名*/
    private String clazzName="EmployeeCategory";
    /**简称*/
    private String simpleName="empctg";
    /**数据表*/
    private String tableName = "hr_emp_category";
    /**用途*/
    private String memo="员工类型";
    /**作者*/
    private String author="ax";
    /**序列号*/
    private String serUID = "";
    /**菜单code*/
    private String menuCode = "";
    /**菜单父级*/
    private String menuPCode = "";
    /**模板组*/
    private String type="id";
    /** m 主表  d明细*/
    private String voucherType="m";
    /**明细挂上来     */
    private List<ColumnName> detailColumnNames;
}
