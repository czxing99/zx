
package com.zx.domain.mysql;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;
import java.util.Date;

/**
 * autocoding
 * @author ax 2019-01-04
 */

@AxTable(name = "sys_role_acl")
public class SysRoleAcl  {

	private static final long serialVersionUID = -538320190104140177L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="role_id", length = 0)
    private int role_id;

	@AxColumn(name ="acl_id", length = 0)
    private int acl_id;

	@AxColumn(name ="operator", length = 20)
    private String operator;

	@AxColumn(name ="operate_time", length = 0)
    private Date operate_time;

	@AxColumn(name ="operate_ip", length = 200)
    private String operate_ip;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="role_id", length = 0)
    private int role_id;

	@AxColumn(name ="acl_id", length = 0)
    private int acl_id;

	@AxColumn(name ="operator", length = 20)
    private String operator;

	@AxColumn(name ="operate_time", length = 0)
    private Date operate_time;

	@AxColumn(name ="operate_ip", length = 200)
    private String operate_ip;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getRole_id(){
        return role_id;
    }

    public void setRole_id(int role_id){
        this.role_id = role_id;
    }
    public int getAcl_id(){
        return acl_id;
    }

    public void setAcl_id(int acl_id){
        this.acl_id = acl_id;
    }
    public String getOperator(){
        return operator;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }
    public Date getOperate_time(){
        return operate_time;
    }

    public void setOperate_time(Date operate_time){
        this.operate_time = operate_time;
    }
    public String getOperate_ip(){
        return operate_ip;
    }

    public void setOperate_ip(String operate_ip){
        this.operate_ip = operate_ip;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getRole_id(){
        return role_id;
    }

    public void setRole_id(int role_id){
        this.role_id = role_id;
    }
    public int getAcl_id(){
        return acl_id;
    }

    public void setAcl_id(int acl_id){
        this.acl_id = acl_id;
    }
    public String getOperator(){
        return operator;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }
    public Date getOperate_time(){
        return operate_time;
    }

    public void setOperate_time(Date operate_time){
        this.operate_time = operate_time;
    }
    public String getOperate_ip(){
        return operate_ip;
    }

    public void setOperate_ip(String operate_ip){
        this.operate_ip = operate_ip;
    }
}
