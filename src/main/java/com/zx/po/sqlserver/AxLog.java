
package com.zx.po.sqlserver;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;

import java.util.Date;

/**
 * autocoding
 * @author ax 2018-12-15
 */

@AxTable(name = "ax_log")
public class AxLog  {

	private static final long serialVersionUID = -3734201812152012685L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="voucher_type", length = 2)
    private String voucherType;

	@AxColumn(name ="voucher_code", length = 100)
    private String voucherCode;

	@AxColumn(name ="success", length = 1)
    private String success;

	@AxColumn(name ="operate_time", length = 0)
    private Date operateTime;

	@AxColumn(name ="cnt", length = 0)
    private int cnt;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getVoucherType(){
        return voucherType;
    }

    public void setVoucherType(String voucherType){
        this.voucherType = voucherType;
    }
    public String getVoucherCode(){
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode){
        this.voucherCode = voucherCode;
    }
    public String getSuccess(){
        return success;
    }

    public void setSuccess(String success){
        this.success = success;
    }
    public Date getOperateTime(){
        return operateTime;
    }

    public void setOperateTime(Date operateTime){
        this.operateTime = operateTime;
    }
    public int getCnt(){
        return cnt;
    }

    public void setCnt(int cnt){
        this.cnt = cnt;
    }
}
