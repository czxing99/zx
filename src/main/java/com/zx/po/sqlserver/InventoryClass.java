
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

@AxTable(name = "AA_InventoryClass")
public class InventoryClass  {

	private static final long serialVersionUID = -1318201812152012875L;

	@AxColumn(name ="code", length = 32)
    private String code;

	@AxColumn(name ="name", length = 200)
    private String name;

	@AxColumn(name ="isEndNode", length = 0)
    private int isEndNode;

	@AxColumn(name ="depth", length = 0)
    private int depth;

	@AxColumn(name ="disabled", length = 0)
    private int disabled;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="inId", length = 560)
    private String inId;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idMarketingOrgan", length = 0)
    private int idMarketingOrgan;

	@AxColumn(name ="idparent", length = 0)
    private int idparent;

	@AxColumn(name ="madeDate", length = 0)
    private Date madeDate;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="createdTime", length = 0)
    private Date createdTime;

	@AxColumn(name ="AutoGenProject", length = 0)
    private int AutoGenProject;


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
    public int getIsEndNode(){
        return isEndNode;
    }

    public void setIsEndNode(int isEndNode){
        this.isEndNode = isEndNode;
    }
    public int getDepth(){
        return depth;
    }

    public void setDepth(int depth){
        this.depth = depth;
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
    public String getInId(){
        return inId;
    }

    public void setInId(String inId){
        this.inId = inId;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdMarketingOrgan(){
        return idMarketingOrgan;
    }

    public void setIdMarketingOrgan(int idMarketingOrgan){
        this.idMarketingOrgan = idMarketingOrgan;
    }
    public int getIdparent(){
        return idparent;
    }

    public void setIdparent(int idparent){
        this.idparent = idparent;
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
    public int getAutoGenProject(){
        return AutoGenProject;
    }

    public void setAutoGenProject(int AutoGenProject){
        this.AutoGenProject = AutoGenProject;
    }
}
