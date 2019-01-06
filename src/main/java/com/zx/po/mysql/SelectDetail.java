
package com.zx.po.mysql;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.zx.spring.annotation.AxColumn;
import org.zx.spring.annotation.AxId;
import org.zx.spring.annotation.AxTable;

/**
 * autocoding
 * @author ax 2018-12-15
 */

@AxTable(name = "s_select_detail")
public class SelectDetail  {

	private static final long serialVersionUID = -7618201812152012866L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="sort", length = 0)
    private int sort;

	@AxColumn(name ="pid", length = 0)
    private int pid;

	@AxColumn(name ="text", length = 255)
    private String text;

	@AxColumn(name ="def", length = 0)
    private int def;

	@AxColumn(name ="remark")
    private String remark;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getSort(){
        return sort;
    }

    public void setSort(int sort){
        this.sort = sort;
    }
    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }
    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
    public int getDef(){
        return def;
    }

    public void setDef(int def){
        this.def = def;
    }
    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
}
