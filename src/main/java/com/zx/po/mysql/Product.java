
package com.zx.po.mysql;

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

@AxTable(name = "b_product")
public class Product  {

	private static final long serialVersionUID = -8164201812160212419L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="name", length = 100)
    private String name;

	@AxColumn(name ="catalog", length = 64)
    private String catalog;

	@AxColumn(name ="code", length = 64)
    private String code;

	@AxColumn(name ="spec", length = 64)
    private String spec;

	@AxColumn(name ="unit", length = 64)
    private String unit;

	@AxColumn(name ="size", length = 64)
    private String size;

	@AxColumn(name ="model", length = 64)
    private String model;

	@AxColumn(name ="price", length = 0)
    private String price;

	@AxColumn(name ="price_min", length = 0)
    private String price_min;

	@AxColumn(name ="pchs_price", length = 0)
    private String pchs_price;

	@AxColumn(name ="pchs_price_max", length = 0)
    private String pchs_price_max;

	@AxColumn(name ="provide", length = 64)
    private String provide;

	@AxColumn(name ="img_url", length = 1000)
    private String img_url;

	@AxColumn(name ="img_size", length = 32)
    private String img_size;

	@AxColumn(name ="remark", length = 300)
    private String remark;

	@AxColumn(name ="create_time", length = 0)
    private Date create_time;

	@AxColumn(name ="create_by", length = 32)
    private String create_by;

	@AxColumn(name ="stock_num", length = 0)
    private String stock_num;

	@AxColumn(name ="UPPER", length = 0)
    private String UPPER;

	@AxColumn(name ="LOWER", length = 0)
    private String LOWER;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getCatalog(){
        return catalog;
    }

    public void setCatalog(String catalog){
        this.catalog = catalog;
    }
    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getSpec(){
        return spec;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }
    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice_min(){
        return price_min;
    }

    public void setPrice_min(String price_min){
        this.price_min = price_min;
    }
    public String getPchs_price(){
        return pchs_price;
    }

    public void setPchs_price(String pchs_price){
        this.pchs_price = pchs_price;
    }
    public String getPchs_price_max(){
        return pchs_price_max;
    }

    public void setPchs_price_max(String pchs_price_max){
        this.pchs_price_max = pchs_price_max;
    }
    public String getProvide(){
        return provide;
    }

    public void setProvide(String provide){
        this.provide = provide;
    }
    public String getImg_url(){
        return img_url;
    }

    public void setImg_url(String img_url){
        this.img_url = img_url;
    }
    public String getImg_size(){
        return img_size;
    }

    public void setImg_size(String img_size){
        this.img_size = img_size;
    }
    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
    public Date getCreate_time(){
        return create_time;
    }

    public void setCreate_time(Date create_time){
        this.create_time = create_time;
    }
    public String getCreate_by(){
        return create_by;
    }

    public void setCreate_by(String create_by){
        this.create_by = create_by;
    }
    public String getStock_num(){
        return stock_num;
    }

    public void setStock_num(String stock_num){
        this.stock_num = stock_num;
    }
    public String getUPPER(){
        return UPPER;
    }

    public void setUPPER(String UPPER){
        this.UPPER = UPPER;
    }
    public String getLOWER(){
        return LOWER;
    }

    public void setLOWER(String LOWER){
        this.LOWER = LOWER;
    }
}
