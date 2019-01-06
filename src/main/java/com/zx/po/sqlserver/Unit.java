
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

@AxTable(name = "AA_Unit")
public class Unit  {

	private static final long serialVersionUID = -6993201812160012765L;

	@AxColumn(name ="code", length = 50)
    private String code;

	@AxColumn(name ="name", length = 200)
    private String name;

	@AxColumn(name ="isMainUnit", length = 0)
    private int isMainUnit;

	@AxColumn(name ="changeRate", length = 0)
    private String changeRate;

	@AxColumn(name ="isSingleUnit", length = 0)
    private int isSingleUnit;

	@AxColumn(name ="disabled", length = 0)
    private int disabled;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="rateDescription", length = 200)
    private String rateDescription;

	@AxColumn(name ="isGroup", length = 0)
    private int isGroup;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idunitgroup", length = 0)
    private int idunitgroup;

	@AxColumn(name ="changeType", length = 0)
    private int changeType;

	@AxColumn(name ="changeType1", length = 0)
    private int changeType1;

	@AxColumn(name ="madeDate", length = 0)
    private Date madeDate;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="createdTime", length = 0)
    private Date createdTime;


    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getIsMainUnit(){
        return isMainUnit;
    }

    public void setIsMainUnit(int isMainUnit){
        this.isMainUnit = isMainUnit;
    }
    public String getChangeRate(){
        return changeRate;
    }

    public void setChangeRate(String changeRate){
        this.changeRate = changeRate;
    }
    public int getIsSingleUnit(){
        return isSingleUnit;
    }

    public void setIsSingleUnit(int isSingleUnit){
        this.isSingleUnit = isSingleUnit;
    }
    public int getDisabled(){
        return disabled;
    }

    public void setDisabled(int disabled){
        this.disabled = disabled;
    }
    public String getUpdatedBy(){
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    public String getRateDescription(){
        return rateDescription;
    }

    public void setRateDescription(String rateDescription){
        this.rateDescription = rateDescription;
    }
    public int getIsGroup(){
        return isGroup;
    }

    public void setIsGroup(int isGroup){
        this.isGroup = isGroup;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdunitgroup(){
        return idunitgroup;
    }

    public void setIdunitgroup(int idunitgroup){
        this.idunitgroup = idunitgroup;
    }
    public int getChangeType(){
        return changeType;
    }

    public void setChangeType(int changeType){
        this.changeType = changeType;
    }
    public int getChangeType1(){
        return changeType1;
    }

    public void setChangeType1(int changeType1){
        this.changeType1 = changeType1;
    }
    public Date getMadeDate(){
        return madeDate;
    }

    public void setMadeDate(Date madeDate){
        this.madeDate = madeDate;
    }
    public Date getUpdated(){
        return updated;
    }

    public void setUpdated(Date updated){
        this.updated = updated;
    }
    public Date getCreatedTime(){
        return createdTime;
    }

    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
}
