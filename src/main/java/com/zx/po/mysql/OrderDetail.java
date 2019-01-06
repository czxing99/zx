
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
 * @author ax 2018-12-16
 */

@AxTable(name = "b_order_detail")
public class OrderDetail  {

	private static final long serialVersionUID = -5397201812161512679L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	private String productCode;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @AxColumn(name ="pid", length = 0)
    private int pid;

	@AxColumn(name ="product_id", length = 0)
    private int product_id;

	@AxColumn(name ="product_name", length = 100)
    private String product_name;

	@AxColumn(name ="spec", length = 100)
    private String spec;

	@AxColumn(name ="model", length = 100)
    private String model;

	@AxColumn(name ="unit", length = 32)
    private String unit;

	@AxColumn(name ="quantity", length = 0)
    private double quantity;

	@AxColumn(name ="price", length = 0)
    private double price;

	@AxColumn(name ="discount", length = 0)
    private double discount;

	@AxColumn(name ="total", length = 0)
    private double total;

	@AxColumn(name ="deliver", length = 0)
    private double deliver;

	@AxColumn(name ="undeliver", length = 0)
    private double undeliver;

	@AxColumn(name ="stock_id", length = 0)
    private int stock_id;

	@AxColumn(name ="stock_name", length = 64)
    private String stock_name;

	@AxColumn(name ="remark", length = 300)
    private String remark;

	@AxColumn(name ="pchs_price", length = 0)
    private double pchs_price;

    @AxColumn(name ="kccode", length = 0)
	private String kccode;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }
    public int getProduct_id(){
        return product_id;
    }

    public void setProduct_id(int product_id){
        this.product_id = product_id;
    }
    public String getProduct_name(){
        return product_name;
    }

    public void setProduct_name(String product_name){
        this.product_name = product_name;
    }
    public String getSpec(){
        return spec;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }
    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }
    public double getDeliver(){
        return deliver;
    }

    public void setDeliver(double deliver){
        this.deliver = deliver;
    }
    public double getUndeliver(){
        return undeliver;
    }

    public void setUndeliver(double undeliver){
        this.undeliver = undeliver;
    }
    public int getStock_id(){
        return stock_id;
    }

    public void setStock_id(int stock_id){
        this.stock_id = stock_id;
    }
    public String getStock_name(){
        return stock_name;
    }

    public void setStock_name(String stock_name){
        this.stock_name = stock_name;
    }
    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
    public double getPchs_price(){
        return pchs_price;
    }

    public void setPchs_price(double pchs_price){
        this.pchs_price = pchs_price;
    }

    public String getKccode() {
        return kccode;
    }

    public void setKccode(String kccode) {
        this.kccode = kccode;
    }
}
