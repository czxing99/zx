
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

@AxTable(name = "b_customer")
public class Customer  {

	private static final long serialVersionUID = -6639201812160212380L;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="own_dpt_name", length = 64)
    private String own_dpt_name;

	@AxColumn(name ="own_dpt", length = 0)
    private int own_dpt;

	@AxColumn(name ="own_usr_name", length = 64)
    private String own_usr_name;

	@AxColumn(name ="own_usr", length = 0)
    private int own_usr;

	@AxColumn(name ="create_by", length = 50)
    private String create_by;

	@AxColumn(name ="create_time", length = 0)
    private Date create_time;

	@AxColumn(name ="update_by", length = 50)
    private String update_by;

	@AxColumn(name ="update_time", length = 0)
    private Date update_time;

	@AxColumn(name ="code", length = 50)
    private String code;

	@AxColumn(name ="name", length = 100)
    private String name;

	@AxColumn(name ="spellcode", length = 100)
    private String spellcode;

	@AxColumn(name ="source", length = 100)
    private String source;

	@AxColumn(name ="credit_degree_id", length = 50)
    private String credit_degree_id;

	@AxColumn(name ="grade", length = 100)
    private String grade;

	@AxColumn(name ="telephone", length = 100)
    private String telephone;

	@AxColumn(name ="fax", length = 100)
    private String fax;

	@AxColumn(name ="web", length = 255)
    private String web;

	@AxColumn(name ="email", length = 100)
    private String email;

	@AxColumn(name ="region", length = 100)
    private String region;

	@AxColumn(name ="province_name", length = 32)
    private String province_name;

	@AxColumn(name ="province", length = 0)
    private int province;

	@AxColumn(name ="city_name", length = 32)
    private String city_name;

	@AxColumn(name ="city", length = 0)
    private int city;

	@AxColumn(name ="address", length = 255)
    private String address;

	@AxColumn(name ="postcode", length = 100)
    private String postcode;

	@AxColumn(name ="trade", length = 100)
    private String trade;

	@AxColumn(name ="size", length = 100)
    private String size;

	@AxColumn(name ="dealin", length = 100)
    private String dealin;

	@AxColumn(name ="kind", length = 100)
    private String kind;

	@AxColumn(name ="yearly_income", length = 100)
    private String yearly_income;

	@AxColumn(name ="artificial_person", length = 100)
    private String artificial_person;

	@AxColumn(name ="registe_money", length = 100)
    private String registe_money;

	@AxColumn(name ="bank", length = 100)
    private String bank;

	@AxColumn(name ="account", length = 100)
    private String account;

	@AxColumn(name ="tax_number", length = 100)
    private String tax_number;

	@AxColumn(name ="next_contact_date", length = 0)
    private Date next_contact_date;

	@AxColumn(name ="next_service_date", length = 0)
    private Date next_service_date;

	@AxColumn(name ="next_buy_date", length = 0)
    private Date next_buy_date;

	@AxColumn(name ="first_contact_date", length = 0)
    private Date first_contact_date;

	@AxColumn(name ="first_service_date", length = 0)
    private Date first_service_date;

	@AxColumn(name ="first_buy_date", length = 0)
    private Date first_buy_date;

	@AxColumn(name ="last_contact_date", length = 0)
    private Date last_contact_date;

	@AxColumn(name ="last_charge_date", length = 0)
    private Date last_charge_date;

	@AxColumn(name ="last_buy_date", length = 0)
    private Date last_buy_date;

	@AxColumn(name ="last_service_date", length = 0)
    private Date last_service_date;

	@AxColumn(name ="total_order", length = 0)
    private String total_order;

	@AxColumn(name ="total_charge", length = 0)
    private String total_charge;

	@AxColumn(name ="total_send", length = 0)
    private String total_send;

	@AxColumn(name ="total_fee", length = 0)
    private String total_fee;

	@AxColumn(name ="total_service", length = 0)
    private String total_service;

	@AxColumn(name ="total_service_need", length = 0)
    private String total_service_need;

	@AxColumn(name ="total_return", length = 0)
    private String total_return;

	@AxColumn(name ="total_return_need", length = 0)
    private String total_return_need;

	@AxColumn(name ="total_need", length = 0)
    private String total_need;

	@AxColumn(name ="assign_date", length = 0)
    private Date assign_date;

	@AxColumn(name ="phase", length = 100)
    private String phase;

	@AxColumn(name ="status", length = 100)
    private String status;

	@AxColumn(name ="remark", length = 65535)
    private String remark;

	@AxColumn(name ="sina", length = 100)
    private String sina;

	@AxColumn(name ="introduction", length = 100)
    private String introduction;

	@AxColumn(name ="scale", length = 64)
    private String scale;

	@AxColumn(name ="staff", length = 0)
    private int staff;

	@AxColumn(name ="invoice_type", length = 64)
    private String invoice_type;

	@AxColumn(name ="m_type", length = 64)
    private String m_type;

	@AxColumn(name ="nature", length = 64)
    private String nature;

	@AxColumn(name ="service_num", length = 0)
    private int service_num;

	@AxColumn(name ="sale_num", length = 0)
    private int sale_num;

	@AxColumn(name ="invoice_money", length = 0)
    private String invoice_money;

	@AxColumn(name ="last_contact_person", length = 64)
    private String last_contact_person;

	@AxColumn(name ="contact_num", length = 0)
    private int contact_num;

	@AxColumn(name ="introduce_id", length = 0)
    private int introduce_id;

	@AxColumn(name ="cus_introduce_id", length = 0)
    private int cus_introduce_id;

	@AxColumn(name ="cus_introduce_name", length = 100)
    private String cus_introduce_name;

	@AxColumn(name ="introduce_info", length = 65535)
    private String introduce_info;

	@AxColumn(name ="receive_people", length = 64)
    private String receive_people;

	@AxColumn(name ="receive_address", length = 500)
    private String receive_address;

	@AxColumn(name ="receive_phone", length = 64)
    private String receive_phone;

	@AxColumn(name ="comment_num", length = 0)
    private int comment_num;

	@AxColumn(name ="demand_num", length = 0)
    private int demand_num;

	@AxColumn(name ="activity_num", length = 0)
    private int activity_num;

	@AxColumn(name ="linkman_num", length = 0)
    private int linkman_num;

	@AxColumn(name ="history_num", length = 0)
    private int history_num;

	@AxColumn(name ="tag", length = 65535)
    private String tag;

	@AxColumn(name ="apply_id", length = 0)
    private int apply_id;

	@AxColumn(name ="apply_name", length = 100)
    private String apply_name;

	@AxColumn(name ="apply_time", length = 0)
    private Date apply_time;

	@AxColumn(name ="audit_msg", length = 500)
    private String audit_msg;

	@AxColumn(name ="bill_type", length = 64)
    private String bill_type;

	@AxColumn(name ="attachment_num", length = 0)
    private int attachment_num;

	@AxColumn(name ="first_touch_date", length = 0)
    private Date first_touch_date;

	@AxColumn(name ="last_touch_date", length = 0)
    private Date last_touch_date;

	@AxColumn(name ="record_time", length = 0)
    private Date record_time;

	@AxColumn(name ="sale_id", length = 0)
    private int sale_id;

	@AxColumn(name ="sale_name", length = 100)
    private String sale_name;

	@AxColumn(name ="c_type", length = 0)
    private int c_type;

	@AxColumn(name ="status_code", length = 0)
    private int status_code;

	@AxColumn(name ="recyle_date", length = 0)
    private String recyle_date;

	@AxColumn(name ="forbbiden_date", length = 0)
    private String forbbiden_date;

	@AxColumn(name ="forbbiden_id", length = 0)
    private int forbbiden_id;

	@AxColumn(name ="longitude", length = 100)
    private String longitude;

	@AxColumn(name ="latitude", length = 100)
    private String latitude;

	@AxColumn(name ="wqd_num", length = 0)
    private int wqd_num;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getOwn_dpt_name(){
        return own_dpt_name;
    }

    public void setOwn_dpt_name(String own_dpt_name){
        this.own_dpt_name = own_dpt_name;
    }
    public int getOwn_dpt(){
        return own_dpt;
    }

    public void setOwn_dpt(int own_dpt){
        this.own_dpt = own_dpt;
    }
    public String getOwn_usr_name(){
        return own_usr_name;
    }

    public void setOwn_usr_name(String own_usr_name){
        this.own_usr_name = own_usr_name;
    }
    public int getOwn_usr(){
        return own_usr;
    }

    public void setOwn_usr(int own_usr){
        this.own_usr = own_usr;
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
    public String getSpellcode(){
        return spellcode;
    }

    public void setSpellcode(String spellcode){
        this.spellcode = spellcode;
    }
    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }
    public String getCredit_degree_id(){
        return credit_degree_id;
    }

    public void setCredit_degree_id(String credit_degree_id){
        this.credit_degree_id = credit_degree_id;
    }
    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getFax(){
        return fax;
    }

    public void setFax(String fax){
        this.fax = fax;
    }
    public String getWeb(){
        return web;
    }

    public void setWeb(String web){
        this.web = web;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getRegion(){
        return region;
    }

    public void setRegion(String region){
        this.region = region;
    }
    public String getProvince_name(){
        return province_name;
    }

    public void setProvince_name(String province_name){
        this.province_name = province_name;
    }
    public int getProvince(){
        return province;
    }

    public void setProvince(int province){
        this.province = province;
    }
    public String getCity_name(){
        return city_name;
    }

    public void setCity_name(String city_name){
        this.city_name = city_name;
    }
    public int getCity(){
        return city;
    }

    public void setCity(int city){
        this.city = city;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getPostcode(){
        return postcode;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
    public String getTrade(){
        return trade;
    }

    public void setTrade(String trade){
        this.trade = trade;
    }
    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getDealin(){
        return dealin;
    }

    public void setDealin(String dealin){
        this.dealin = dealin;
    }
    public String getKind(){
        return kind;
    }

    public void setKind(String kind){
        this.kind = kind;
    }
    public String getYearly_income(){
        return yearly_income;
    }

    public void setYearly_income(String yearly_income){
        this.yearly_income = yearly_income;
    }
    public String getArtificial_person(){
        return artificial_person;
    }

    public void setArtificial_person(String artificial_person){
        this.artificial_person = artificial_person;
    }
    public String getRegiste_money(){
        return registe_money;
    }

    public void setRegiste_money(String registe_money){
        this.registe_money = registe_money;
    }
    public String getBank(){
        return bank;
    }

    public void setBank(String bank){
        this.bank = bank;
    }
    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }
    public String getTax_number(){
        return tax_number;
    }

    public void setTax_number(String tax_number){
        this.tax_number = tax_number;
    }
    public Date getNext_contact_date(){
        return next_contact_date;
    }

    public void setNext_contact_date(Date next_contact_date){
        this.next_contact_date = next_contact_date;
    }
    public Date getNext_service_date(){
        return next_service_date;
    }

    public void setNext_service_date(Date next_service_date){
        this.next_service_date = next_service_date;
    }
    public Date getNext_buy_date(){
        return next_buy_date;
    }

    public void setNext_buy_date(Date next_buy_date){
        this.next_buy_date = next_buy_date;
    }
    public Date getFirst_contact_date(){
        return first_contact_date;
    }

    public void setFirst_contact_date(Date first_contact_date){
        this.first_contact_date = first_contact_date;
    }
    public Date getFirst_service_date(){
        return first_service_date;
    }

    public void setFirst_service_date(Date first_service_date){
        this.first_service_date = first_service_date;
    }
    public Date getFirst_buy_date(){
        return first_buy_date;
    }

    public void setFirst_buy_date(Date first_buy_date){
        this.first_buy_date = first_buy_date;
    }
    public Date getLast_contact_date(){
        return last_contact_date;
    }

    public void setLast_contact_date(Date last_contact_date){
        this.last_contact_date = last_contact_date;
    }
    public Date getLast_charge_date(){
        return last_charge_date;
    }

    public void setLast_charge_date(Date last_charge_date){
        this.last_charge_date = last_charge_date;
    }
    public Date getLast_buy_date(){
        return last_buy_date;
    }

    public void setLast_buy_date(Date last_buy_date){
        this.last_buy_date = last_buy_date;
    }
    public Date getLast_service_date(){
        return last_service_date;
    }

    public void setLast_service_date(Date last_service_date){
        this.last_service_date = last_service_date;
    }
    public String getTotal_order(){
        return total_order;
    }

    public void setTotal_order(String total_order){
        this.total_order = total_order;
    }
    public String getTotal_charge(){
        return total_charge;
    }

    public void setTotal_charge(String total_charge){
        this.total_charge = total_charge;
    }
    public String getTotal_send(){
        return total_send;
    }

    public void setTotal_send(String total_send){
        this.total_send = total_send;
    }
    public String getTotal_fee(){
        return total_fee;
    }

    public void setTotal_fee(String total_fee){
        this.total_fee = total_fee;
    }
    public String getTotal_service(){
        return total_service;
    }

    public void setTotal_service(String total_service){
        this.total_service = total_service;
    }
    public String getTotal_service_need(){
        return total_service_need;
    }

    public void setTotal_service_need(String total_service_need){
        this.total_service_need = total_service_need;
    }
    public String getTotal_return(){
        return total_return;
    }

    public void setTotal_return(String total_return){
        this.total_return = total_return;
    }
    public String getTotal_return_need(){
        return total_return_need;
    }

    public void setTotal_return_need(String total_return_need){
        this.total_return_need = total_return_need;
    }
    public String getTotal_need(){
        return total_need;
    }

    public void setTotal_need(String total_need){
        this.total_need = total_need;
    }
    public Date getAssign_date(){
        return assign_date;
    }

    public void setAssign_date(Date assign_date){
        this.assign_date = assign_date;
    }
    public String getPhase(){
        return phase;
    }

    public void setPhase(String phase){
        this.phase = phase;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
    public String getSina(){
        return sina;
    }

    public void setSina(String sina){
        this.sina = sina;
    }
    public String getIntroduction(){
        return introduction;
    }

    public void setIntroduction(String introduction){
        this.introduction = introduction;
    }
    public String getScale(){
        return scale;
    }

    public void setScale(String scale){
        this.scale = scale;
    }
    public int getStaff(){
        return staff;
    }

    public void setStaff(int staff){
        this.staff = staff;
    }
    public String getInvoice_type(){
        return invoice_type;
    }

    public void setInvoice_type(String invoice_type){
        this.invoice_type = invoice_type;
    }
    public String getM_type(){
        return m_type;
    }

    public void setM_type(String m_type){
        this.m_type = m_type;
    }
    public String getNature(){
        return nature;
    }

    public void setNature(String nature){
        this.nature = nature;
    }
    public int getService_num(){
        return service_num;
    }

    public void setService_num(int service_num){
        this.service_num = service_num;
    }
    public int getSale_num(){
        return sale_num;
    }

    public void setSale_num(int sale_num){
        this.sale_num = sale_num;
    }
    public String getInvoice_money(){
        return invoice_money;
    }

    public void setInvoice_money(String invoice_money){
        this.invoice_money = invoice_money;
    }
    public String getLast_contact_person(){
        return last_contact_person;
    }

    public void setLast_contact_person(String last_contact_person){
        this.last_contact_person = last_contact_person;
    }
    public int getContact_num(){
        return contact_num;
    }

    public void setContact_num(int contact_num){
        this.contact_num = contact_num;
    }
    public int getIntroduce_id(){
        return introduce_id;
    }

    public void setIntroduce_id(int introduce_id){
        this.introduce_id = introduce_id;
    }
    public int getCus_introduce_id(){
        return cus_introduce_id;
    }

    public void setCus_introduce_id(int cus_introduce_id){
        this.cus_introduce_id = cus_introduce_id;
    }
    public String getCus_introduce_name(){
        return cus_introduce_name;
    }

    public void setCus_introduce_name(String cus_introduce_name){
        this.cus_introduce_name = cus_introduce_name;
    }
    public String getIntroduce_info(){
        return introduce_info;
    }

    public void setIntroduce_info(String introduce_info){
        this.introduce_info = introduce_info;
    }
    public String getReceive_people(){
        return receive_people;
    }

    public void setReceive_people(String receive_people){
        this.receive_people = receive_people;
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
    public int getComment_num(){
        return comment_num;
    }

    public void setComment_num(int comment_num){
        this.comment_num = comment_num;
    }
    public int getDemand_num(){
        return demand_num;
    }

    public void setDemand_num(int demand_num){
        this.demand_num = demand_num;
    }
    public int getActivity_num(){
        return activity_num;
    }

    public void setActivity_num(int activity_num){
        this.activity_num = activity_num;
    }
    public int getLinkman_num(){
        return linkman_num;
    }

    public void setLinkman_num(int linkman_num){
        this.linkman_num = linkman_num;
    }
    public int getHistory_num(){
        return history_num;
    }

    public void setHistory_num(int history_num){
        this.history_num = history_num;
    }
    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }
    public int getApply_id(){
        return apply_id;
    }

    public void setApply_id(int apply_id){
        this.apply_id = apply_id;
    }
    public String getApply_name(){
        return apply_name;
    }

    public void setApply_name(String apply_name){
        this.apply_name = apply_name;
    }
    public Date getApply_time(){
        return apply_time;
    }

    public void setApply_time(Date apply_time){
        this.apply_time = apply_time;
    }
    public String getAudit_msg(){
        return audit_msg;
    }

    public void setAudit_msg(String audit_msg){
        this.audit_msg = audit_msg;
    }
    public String getBill_type(){
        return bill_type;
    }

    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }
    public int getAttachment_num(){
        return attachment_num;
    }

    public void setAttachment_num(int attachment_num){
        this.attachment_num = attachment_num;
    }
    public Date getFirst_touch_date(){
        return first_touch_date;
    }

    public void setFirst_touch_date(Date first_touch_date){
        this.first_touch_date = first_touch_date;
    }
    public Date getLast_touch_date(){
        return last_touch_date;
    }

    public void setLast_touch_date(Date last_touch_date){
        this.last_touch_date = last_touch_date;
    }
    public Date getRecord_time(){
        return record_time;
    }

    public void setRecord_time(Date record_time){
        this.record_time = record_time;
    }
    public int getSale_id(){
        return sale_id;
    }

    public void setSale_id(int sale_id){
        this.sale_id = sale_id;
    }
    public String getSale_name(){
        return sale_name;
    }

    public void setSale_name(String sale_name){
        this.sale_name = sale_name;
    }
    public int getC_type(){
        return c_type;
    }

    public void setC_type(int c_type){
        this.c_type = c_type;
    }
    public int getStatus_code(){
        return status_code;
    }

    public void setStatus_code(int status_code){
        this.status_code = status_code;
    }
    public String getRecyle_date(){
        return recyle_date;
    }

    public void setRecyle_date(String recyle_date){
        this.recyle_date = recyle_date;
    }
    public String getForbbiden_date(){
        return forbbiden_date;
    }

    public void setForbbiden_date(String forbbiden_date){
        this.forbbiden_date = forbbiden_date;
    }
    public int getForbbiden_id(){
        return forbbiden_id;
    }

    public void setForbbiden_id(int forbbiden_id){
        this.forbbiden_id = forbbiden_id;
    }
    public String getLongitude(){
        return longitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    public String getLatitude(){
        return latitude;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public int getWqd_num(){
        return wqd_num;
    }

    public void setWqd_num(int wqd_num){
        this.wqd_num = wqd_num;
    }
}
