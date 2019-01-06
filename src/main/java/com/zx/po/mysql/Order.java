
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

@AxTable(name = "b_order")
public class Order  {

	private static final long serialVersionUID = -4562201812161312889L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="own_dpt", length = 0)
    private int own_dpt;

	@AxColumn(name ="own_dpt_name", length = 32)
    private String own_dpt_name;

	@AxColumn(name ="own_usr", length = 0)
    private int own_usr;

	@AxColumn(name ="own_usr_name", length = 32)
    private String own_usr_name;

	@AxColumn(name ="create_by", length = 32)
    private String create_by;

	@AxColumn(name ="create_time", length = 0)
    private Date create_time;

	@AxColumn(name ="update_by", length = 32)
    private String update_by;

	@AxColumn(name ="update_time", length = 0)
    private Date update_time;

	@AxColumn(name ="title", length = 100)
    private String title;

	@AxColumn(name ="code", length = 64)
    private String code;

	@AxColumn(name ="status", length = 32)
    private String status;

	@AxColumn(name ="sale_time", length = 0)
    private Date sale_time;

	@AxColumn(name ="sale_id", length = 0)
    private int sale_id;

	@AxColumn(name ="cus_id", length = 0)
    private int cus_id;

	@AxColumn(name ="cus_name", length = 100)
    private String cus_name;

	@AxColumn(name ="cus_type", length = 64)
    private String cus_type;

	@AxColumn(name ="total", length = 0)
    private String total;

	@AxColumn(name ="discount", length = 0)
    private String discount;

	@AxColumn(name ="fact_money", length = 0)
    private String fact_money;

	@AxColumn(name ="over_money", length = 0)
    private String over_money;

	@AxColumn(name ="receive_id", length = 0)
    private int receive_id;

	@AxColumn(name ="receive_name", length = 64)
    private String receive_name;

	@AxColumn(name ="receive_address", length = 200)
    private String receive_address;

	@AxColumn(name ="receive_phone", length = 64)
    private String receive_phone;

	@AxColumn(name ="receive_status", length = 32)
    private String receive_status;

	@AxColumn(name ="bill_title", length = 200)
    private String bill_title;

	@AxColumn(name ="bill_type", length = 64)
    private String bill_type;

	@AxColumn(name ="bill_total", length = 0)
    private String bill_total;

	@AxColumn(name ="bill_uncollected", length = 0)
    private String bill_uncollected;

	@AxColumn(name ="bill_collected", length = 0)
    private String bill_collected;

	@AxColumn(name ="bill_status", length = 32)
    private String bill_status;

	@AxColumn(name ="check_monoey", length = 0)
    private String check_monoey;

	@AxColumn(name ="check_status", length = 32)
    private String check_status;

	@AxColumn(name ="remark", length = 300)
    private String remark;

	@AxColumn(name ="audit_id", length = 0)
    private int audit_id;

	@AxColumn(name ="audit_people", length = 64)
    private String audit_people;

	@AxColumn(name ="audit_msg", length = 500)
    private String audit_msg;

	@AxColumn(name ="audit_time", length = 0)
    private Date audit_time;

	@AxColumn(name ="close_bill", length = 32)
    private String close_bill;

	@AxColumn(name ="close_charge", length = 32)
    private String close_charge;

	@AxColumn(name ="close_send", length = 32)
    private String close_send;

	@AxColumn(name ="comment_num", length = 0)
    private int comment_num;

	@AxColumn(name ="attachment_num", length = 0)
    private int attachment_num;

	@AxColumn(name ="history_num", length = 0)
    private int history_num;

	@AxColumn(name ="chance_id", length = 0)
    private int chance_id;

	@AxColumn(name ="chance_name", length = 64)
    private String chance_name;

	@AxColumn(name ="profit", length = 0)
    private String profit;

	@AxColumn(name ="sale_name", length = 100)
    private String sale_name;

	@AxColumn(name ="need_contact_date", length = 0)
    private Date need_contact_date;

	@AxColumn(name ="need_contact_remark", length = 300)
    private String need_contact_remark;

	@AxColumn(name ="linkman", length = 100)
    private String linkman;

	@AxColumn(name ="linkman_id", length = 0)
    private int linkman_id;

	@AxColumn(name ="tel", length = 100)
    private String tel;

	@AxColumn(name ="order_type", length = 100)
    private String order_type;

	@AxColumn(name ="end_date", length = 0)
    private String end_date;

	@AxColumn(name ="need_audit_name", length = 200)
    private String need_audit_name;

	@AxColumn(name ="need_audit_id", length = 200)
    private String need_audit_id;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getOwn_dpt(){
        return own_dpt;
    }

    public void setOwn_dpt(int own_dpt){
        this.own_dpt = own_dpt;
    }
    public String getOwn_dpt_name(){
        return own_dpt_name;
    }

    public void setOwn_dpt_name(String own_dpt_name){
        this.own_dpt_name = own_dpt_name;
    }
    public int getOwn_usr(){
        return own_usr;
    }

    public void setOwn_usr(int own_usr){
        this.own_usr = own_usr;
    }
    public String getOwn_usr_name(){
        return own_usr_name;
    }

    public void setOwn_usr_name(String own_usr_name){
        this.own_usr_name = own_usr_name;
    }
    public String getCreate_by(){
        return create_by;
    }

    public void setCreate_by(String create_by){
        this.create_by = create_by;
    }
    public Date getCreate_time(){
        return create_time;
    }

    public void setCreate_time(Date create_time){
        this.create_time = create_time;
    }
    public String getUpdate_by(){
        return update_by;
    }

    public void setUpdate_by(String update_by){
        this.update_by = update_by;
    }
    public Date getUpdate_time(){
        return update_time;
    }

    public void setUpdate_time(Date update_time){
        this.update_time = update_time;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public Date getSale_time(){
        return sale_time;
    }

    public void setSale_time(Date sale_time){
        this.sale_time = sale_time;
    }
    public int getSale_id(){
        return sale_id;
    }

    public void setSale_id(int sale_id){
        this.sale_id = sale_id;
    }
    public int getCus_id(){
        return cus_id;
    }

    public void setCus_id(int cus_id){
        this.cus_id = cus_id;
    }
    public String getCus_name(){
        return cus_name;
    }

    public void setCus_name(String cus_name){
        this.cus_name = cus_name;
    }
    public String getCus_type(){
        return cus_type;
    }

    public void setCus_type(String cus_type){
        this.cus_type = cus_type;
    }
    public String getTotal(){
        return total;
    }

    public void setTotal(String total){
        this.total = total;
    }
    public String getDiscount(){
        return discount;
    }

    public void setDiscount(String discount){
        this.discount = discount;
    }
    public String getFact_money(){
        return fact_money;
    }

    public void setFact_money(String fact_money){
        this.fact_money = fact_money;
    }
    public String getOver_money(){
        return over_money;
    }

    public void setOver_money(String over_money){
        this.over_money = over_money;
    }
    public int getReceive_id(){
        return receive_id;
    }

    public void setReceive_id(int receive_id){
        this.receive_id = receive_id;
    }
    public String getReceive_name(){
        return receive_name;
    }

    public void setReceive_name(String receive_name){
        this.receive_name = receive_name;
    }
    public String getReceive_address(){
        return receive_address;
    }

    public void setReceive_address(String receive_address){
        this.receive_address = receive_address;
    }
    public String getReceive_phone(){
        return receive_phone;
    }

    public void setReceive_phone(String receive_phone){
        this.receive_phone = receive_phone;
    }
    public String getReceive_status(){
        return receive_status;
    }

    public void setReceive_status(String receive_status){
        this.receive_status = receive_status;
    }
    public String getBill_title(){
        return bill_title;
    }

    public void setBill_title(String bill_title){
        this.bill_title = bill_title;
    }
    public String getBill_type(){
        return bill_type;
    }

    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }
    public String getBill_total(){
        return bill_total;
    }

    public void setBill_total(String bill_total){
        this.bill_total = bill_total;
    }
    public String getBill_uncollected(){
        return bill_uncollected;
    }

    public void setBill_uncollected(String bill_uncollected){
        this.bill_uncollected = bill_uncollected;
    }
    public String getBill_collected(){
        return bill_collected;
    }

    public void setBill_collected(String bill_collected){
        this.bill_collected = bill_collected;
    }
    public String getBill_status(){
        return bill_status;
    }

    public void setBill_status(String bill_status){
        this.bill_status = bill_status;
    }
    public String getCheck_monoey(){
        return check_monoey;
    }

    public void setCheck_monoey(String check_monoey){
        this.check_monoey = check_monoey;
    }
    public String getCheck_status(){
        return check_status;
    }

    public void setCheck_status(String check_status){
        this.check_status = check_status;
    }
    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
    public int getAudit_id(){
        return audit_id;
    }

    public void setAudit_id(int audit_id){
        this.audit_id = audit_id;
    }
    public String getAudit_people(){
        return audit_people;
    }

    public void setAudit_people(String audit_people){
        this.audit_people = audit_people;
    }
    public String getAudit_msg(){
        return audit_msg;
    }

    public void setAudit_msg(String audit_msg){
        this.audit_msg = audit_msg;
    }
    public Date getAudit_time(){
        return audit_time;
    }

    public void setAudit_time(Date audit_time){
        this.audit_time = audit_time;
    }
    public String getClose_bill(){
        return close_bill;
    }

    public void setClose_bill(String close_bill){
        this.close_bill = close_bill;
    }
    public String getClose_charge(){
        return close_charge;
    }

    public void setClose_charge(String close_charge){
        this.close_charge = close_charge;
    }
    public String getClose_send(){
        return close_send;
    }

    public void setClose_send(String close_send){
        this.close_send = close_send;
    }
    public int getComment_num(){
        return comment_num;
    }

    public void setComment_num(int comment_num){
        this.comment_num = comment_num;
    }
    public int getAttachment_num(){
        return attachment_num;
    }

    public void setAttachment_num(int attachment_num){
        this.attachment_num = attachment_num;
    }
    public int getHistory_num(){
        return history_num;
    }

    public void setHistory_num(int history_num){
        this.history_num = history_num;
    }
    public int getChance_id(){
        return chance_id;
    }

    public void setChance_id(int chance_id){
        this.chance_id = chance_id;
    }
    public String getChance_name(){
        return chance_name;
    }

    public void setChance_name(String chance_name){
        this.chance_name = chance_name;
    }
    public String getProfit(){
        return profit;
    }

    public void setProfit(String profit){
        this.profit = profit;
    }
    public String getSale_name(){
        return sale_name;
    }

    public void setSale_name(String sale_name){
        this.sale_name = sale_name;
    }
    public Date getNeed_contact_date(){
        return need_contact_date;
    }

    public void setNeed_contact_date(Date need_contact_date){
        this.need_contact_date = need_contact_date;
    }
    public String getNeed_contact_remark(){
        return need_contact_remark;
    }

    public void setNeed_contact_remark(String need_contact_remark){
        this.need_contact_remark = need_contact_remark;
    }
    public String getLinkman(){
        return linkman;
    }

    public void setLinkman(String linkman){
        this.linkman = linkman;
    }
    public int getLinkman_id(){
        return linkman_id;
    }

    public void setLinkman_id(int linkman_id){
        this.linkman_id = linkman_id;
    }
    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }
    public String getOrder_type(){
        return order_type;
    }

    public void setOrder_type(String order_type){
        this.order_type = order_type;
    }
    public String getEnd_date(){
        return end_date;
    }

    public void setEnd_date(String end_date){
        this.end_date = end_date;
    }
    public String getNeed_audit_name(){
        return need_audit_name;
    }

    public void setNeed_audit_name(String need_audit_name){
        this.need_audit_name = need_audit_name;
    }
    public String getNeed_audit_id(){
        return need_audit_id;
    }

    public void setNeed_audit_id(String need_audit_id){
        this.need_audit_id = need_audit_id;
    }
}
