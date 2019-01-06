
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
 * @author ax 2018-12-16
 */

@AxTable(name = "SA_SaleOrder")
public class SaleOrder  {

	private static final long serialVersionUID = -2845201812161512993L;

	@AxColumn(name ="code", length = 30)
    private String code;

	@AxColumn(name ="name", length = 200)
    private String name;

	@AxColumn(name ="discountRate", length = 0)
    private double discountRate;

	@AxColumn(name ="discountAmount", length = 0,isNull = "1")
    private double discountAmount;

	@AxColumn(name ="origDiscountAmount", length = 0)
    private double origDiscountAmount;

	@AxColumn(name ="exchangeRate", length = 0)
    private double exchangeRate;

	@AxColumn(name ="address", length = 200)
    private String address;

	@AxColumn(name ="linkMan", length = 50)
    private String linkMan;

	@AxColumn(name ="contractCode", length = 30)
    private String contractCode;

	@AxColumn(name ="origEarnestMoney", length = 0)
    private double origEarnestMoney;

	@AxColumn(name ="earnestMoney", length = 0)
    private double earnestMoney;

	@AxColumn(name ="memo", length = 200)
    private String memo;

	@AxColumn(name ="origAmount", length = 0)
    private double origAmount;

	@AxColumn(name ="amount", length = 0)
    private double amount;

	@AxColumn(name ="origTaxAmount", length = 0)
    private double origTaxAmount;

	@AxColumn(name ="taxAmount", length = 0)
    private double taxAmount;

	@AxColumn(name ="contactPhone", length = 100)
    private String contactPhone;

	@AxColumn(name ="maker", length = 50)
    private String maker;

	@AxColumn(name ="auditor", length = 50)
    private String auditor;

	@AxColumn(name ="reviser", length = 50)
    private String reviser;

	@AxColumn(name ="iscarriedforwardout", length = 0)
    private int iscarriedforwardout;

	@AxColumn(name ="iscarriedforwardin", length = 0)
    private int iscarriedforwardin;

	@AxColumn(name ="ismodifiedcode", length = 0)
    private int ismodifiedcode;

	@AxColumn(name ="docid", length = 36)
    private String docid;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="priuserdefnvc1", length = 500)
    private String priuserdefnvc1;

	@AxColumn(name ="priuserdefdecm1", length = 0,isNull = "1")
    private double priuserdefdecm1;

	@AxColumn(name ="priuserdefnvc2", length = 500)
    private String priuserdefnvc2;

	@AxColumn(name ="priuserdefdecm2", length = 0,isNull = "1")
    private double priuserdefdecm2;

	@AxColumn(name ="priuserdefnvc3", length = 500)
    private String priuserdefnvc3;

	@AxColumn(name ="priuserdefdecm3", length = 0,isNull = "1")
    private double priuserdefdecm3;

	@AxColumn(name ="priuserdefnvc4", length = 500)
    private String priuserdefnvc4;

	@AxColumn(name ="priuserdefdecm4", length = 0,isNull = "1")
    private double priuserdefdecm4;

	@AxColumn(name ="priuserdefnvc5", length = 500)
    private String priuserdefnvc5;

	@AxColumn(name ="priuserdefdecm5", length = 0,isNull = "1")
    private double priuserdefdecm5;

	@AxColumn(name ="priuserdefnvc6", length = 500)
    private String priuserdefnvc6;

	@AxColumn(name ="priuserdefdecm6", length = 0,isNull = "1")
    private double priuserdefdecm6;

	@AxColumn(name ="pubuserdefnvc1", length = 500)
    private String pubuserdefnvc1;

	@AxColumn(name ="pubuserdefdecm1", length = 0,isNull = "1")
    private double pubuserdefdecm1;

	@AxColumn(name ="pubuserdefnvc2", length = 500)
    private String pubuserdefnvc2;

	@AxColumn(name ="pubuserdefdecm2", length = 0,isNull = "1")
    private double pubuserdefdecm2;

	@AxColumn(name ="pubuserdefnvc3", length = 500)
    private String pubuserdefnvc3;

	@AxColumn(name ="pubuserdefdecm3", length = 0,isNull = "1")
    private double pubuserdefdecm3;

	@AxColumn(name ="pubuserdefnvc4", length = 500)
    private String pubuserdefnvc4;

	@AxColumn(name ="pubuserdefdecm4", length = 0,isNull = "1")
    private double pubuserdefdecm4;

	@AxColumn(name ="pubuserdefnvc5", length = 500)
    private String pubuserdefnvc5;

	@AxColumn(name ="pubuserdefdecm5", length = 0,isNull = "1")
    private double pubuserdefdecm5;

	@AxColumn(name ="pubuserdefnvc6", length = 500)
    private String pubuserdefnvc6;

	@AxColumn(name ="pubuserdefdecm6", length = 0,isNull = "1")
    private double pubuserdefdecm6;

	@AxColumn(name ="IsAutoGenerateSaleOrderBOM", length = 0)
    private int IsAutoGenerateSaleOrderBOM;

	@AxColumn(name ="IsAutoGenerateRouting", length = 0)
    private int IsAutoGenerateRouting;

	@AxColumn(name ="SourceVoucherCode", length = 50)
    private String SourceVoucherCode;

	@AxColumn(name ="isnomodify", length = 1000)
    private String isnomodify;

	@AxColumn(name ="changer", length = 50)
    private String changer;

	@AxColumn(name ="Mobilephone", length = 50)
    private String Mobilephone;

	@AxColumn(name ="MemberAddress", length = 50)
    private String MemberAddress;

	@AxColumn(name ="PrintCount", length = 0)
    private int PrintCount;

	@AxColumn(name ="IsSeparateByWareHouse", length = 0)
    private int IsSeparateByWareHouse;

	@AxColumn(name ="OrigReceiveAmount", length = 0)
    private double OrigReceiveAmount;

	@AxColumn(name ="ReceiveAmount", length = 0)
    private double ReceiveAmount;

	@AxColumn(name ="collaborateVoucherCode", length = 30)
    private String collaborateVoucherCode;

	@AxColumn(name ="ExternalCode", length = 50)
    private String ExternalCode;

	@AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idbusinesstype", length = 0)
    private int idbusinesstype;

	@AxColumn(name ="idcurrency", length = 0)
    private int idcurrency;

	@AxColumn(name ="iddepartment", length = 0)
    private int iddepartment;

	@AxColumn(name ="IdMember", length = 0,isNull = "1")
    private int IdMember;

	@AxColumn(name ="idmarketingOrgan", length = 0)
    private int idmarketingOrgan;

	@AxColumn(name ="idcustomer", length = 0)
    private int idcustomer;

	@AxColumn(name ="idsettlecustomer", length = 0)
    private int idsettlecustomer;

	@AxColumn(name ="idclerk", length = 0)
    private int idclerk;

	@AxColumn(name ="idproject", length = 0,isNull = "1")
    private int idproject;

	@AxColumn(name ="idwarehouse", length = 0)
    private int idwarehouse;

	@AxColumn(name ="idCollaborateUpVoucherType", length = 0,isNull = "1")
    private int idCollaborateUpVoucherType;

	@AxColumn(name ="idCollaborateUpVoucher", length = 0,isNull = "1")
    private int idCollaborateUpVoucher;

	@AxColumn(name ="DataSource", length = 0)
    private int DataSource;

	@AxColumn(name ="deliveryMode", length = 0,isNull = "1")
    private int deliveryMode;

	@AxColumn(name ="isCancel", length = 0,isNull = "1")
    private int isCancel;

	@AxColumn(name ="isSaleDelivery", length = 0,isNull = "1")
    private int isSaleDelivery;

	@AxColumn(name ="isSaleOut", length = 0,isNull = "1")
    private int isSaleOut;

	@AxColumn(name ="reciveType", length = 0)
    private int reciveType;

	@AxColumn(name ="voucherState", length = 0)
    private int voucherState;

	@AxColumn(name ="auditorid", length = 0)
    private int auditorid;

	@AxColumn(name ="makerid", length = 0)
    private int makerid;

	@AxColumn(name ="changerid", length = 0,isNull = "1")
    private int changerid;

	@AxColumn(name ="idCollaborateDownVoucherType", length = 0,isNull = "1")
    private int idCollaborateDownVoucherType;

	@AxColumn(name ="CollaborateState", length = 0,isNull = "1")
    private int CollaborateState;

	@AxColumn(name ="idCollaborateDownDraftVoucher", length = 0,isNull = "1")
    private int idCollaborateDownDraftVoucher;

	@AxColumn(name ="SourceVoucherID", length = 0,isNull = "1")
    private int SourceVoucherID;

	@AxColumn(name ="idsourcevouchertype", length = 0,isNull = "1")
    private int idsourcevouchertype;

	@AxColumn(name ="deliveryDate", length = 0)
    private Date deliveryDate;

	@AxColumn(name ="voucherdate", length = 0)
    private Date voucherdate;

	@AxColumn(name ="madedate", length = 0)
    private Date madedate;

	@AxColumn(name ="auditeddate", length = 0)
    private Date auditeddate;

	@AxColumn(name ="createdtime", length = 0)
    private Date createdtime;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="changedate", length = 0)
    private Date changedate;

	@AxColumn(name ="ExternalVoucherCode", length = 50)
    private String ExternalVoucherCode;

	@AxColumn(name ="CustomerPhone", length = 100)
    private String CustomerPhone;

	@AxColumn(name ="HasRecordCredit", length = 0)
    private String HasRecordCredit;

	@AxColumn(name ="IsAutoWarehouse", length = 0)
    private String IsAutoWarehouse;

	@AxColumn(name ="InputDataSource", length = 0,isNull = "1")
    private int InputDataSource;

	@AxColumn(name ="Closer", length = 50)
    private String Closer;

	@AxColumn(name ="CloseDate", length = 0)
    private Date CloseDate;


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
    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
    }
    public double getOrigDiscountAmount(){
        return origDiscountAmount;
    }

    public void setOrigDiscountAmount(double origDiscountAmount){
        this.origDiscountAmount = origDiscountAmount;
    }
    public double getExchangeRate(){
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate){
        this.exchangeRate = exchangeRate;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getLinkMan(){
        return linkMan;
    }

    public void setLinkMan(String linkMan){
        this.linkMan = linkMan;
    }
    public String getContractCode(){
        return contractCode;
    }

    public void setContractCode(String contractCode){
        this.contractCode = contractCode;
    }
    public double getOrigEarnestMoney(){
        return origEarnestMoney;
    }

    public void setOrigEarnestMoney(double origEarnestMoney){
        this.origEarnestMoney = origEarnestMoney;
    }
    public double getEarnestMoney(){
        return earnestMoney;
    }

    public void setEarnestMoney(double earnestMoney){
        this.earnestMoney = earnestMoney;
    }
    public String getMemo(){
        return memo;
    }

    public void setMemo(String memo){
        this.memo = memo;
    }
    public double getOrigAmount(){
        return origAmount;
    }

    public void setOrigAmount(double origAmount){
        this.origAmount = origAmount;
    }
    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getOrigTaxAmount(){
        return origTaxAmount;
    }

    public void setOrigTaxAmount(double origTaxAmount){
        this.origTaxAmount = origTaxAmount;
    }
    public double getTaxAmount(){
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount){
        this.taxAmount = taxAmount;
    }
    public String getContactPhone(){
        return contactPhone;
    }

    public void setContactPhone(String contactPhone){
        this.contactPhone = contactPhone;
    }
    public String getMaker(){
        return maker;
    }

    public void setMaker(String maker){
        this.maker = maker;
    }
    public String getAuditor(){
        return auditor;
    }

    public void setAuditor(String auditor){
        this.auditor = auditor;
    }
    public String getReviser(){
        return reviser;
    }

    public void setReviser(String reviser){
        this.reviser = reviser;
    }
    public int getIscarriedforwardout(){
        return iscarriedforwardout;
    }

    public void setIscarriedforwardout(int iscarriedforwardout){
        this.iscarriedforwardout = iscarriedforwardout;
    }
    public int getIscarriedforwardin(){
        return iscarriedforwardin;
    }

    public void setIscarriedforwardin(int iscarriedforwardin){
        this.iscarriedforwardin = iscarriedforwardin;
    }
    public int getIsmodifiedcode(){
        return ismodifiedcode;
    }

    public void setIsmodifiedcode(int ismodifiedcode){
        this.ismodifiedcode = ismodifiedcode;
    }
    public String getDocid(){
        return docid;
    }

    public void setDocid(String docid){
        this.docid = docid;
    }
    public String getUpdatedBy(){
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    public String getPriuserdefnvc1(){
        return priuserdefnvc1;
    }

    public void setPriuserdefnvc1(String priuserdefnvc1){
        this.priuserdefnvc1 = priuserdefnvc1;
    }
    public double getPriuserdefdecm1(){
        return priuserdefdecm1;
    }

    public void setPriuserdefdecm1(double priuserdefdecm1){
        this.priuserdefdecm1 = priuserdefdecm1;
    }
    public String getPriuserdefnvc2(){
        return priuserdefnvc2;
    }

    public void setPriuserdefnvc2(String priuserdefnvc2){
        this.priuserdefnvc2 = priuserdefnvc2;
    }
    public double getPriuserdefdecm2(){
        return priuserdefdecm2;
    }

    public void setPriuserdefdecm2(double priuserdefdecm2){
        this.priuserdefdecm2 = priuserdefdecm2;
    }
    public String getPriuserdefnvc3(){
        return priuserdefnvc3;
    }

    public void setPriuserdefnvc3(String priuserdefnvc3){
        this.priuserdefnvc3 = priuserdefnvc3;
    }
    public double getPriuserdefdecm3(){
        return priuserdefdecm3;
    }

    public void setPriuserdefdecm3(double priuserdefdecm3){
        this.priuserdefdecm3 = priuserdefdecm3;
    }
    public String getPriuserdefnvc4(){
        return priuserdefnvc4;
    }

    public void setPriuserdefnvc4(String priuserdefnvc4){
        this.priuserdefnvc4 = priuserdefnvc4;
    }
    public double getPriuserdefdecm4(){
        return priuserdefdecm4;
    }

    public void setPriuserdefdecm4(double priuserdefdecm4){
        this.priuserdefdecm4 = priuserdefdecm4;
    }
    public String getPriuserdefnvc5(){
        return priuserdefnvc5;
    }

    public void setPriuserdefnvc5(String priuserdefnvc5){
        this.priuserdefnvc5 = priuserdefnvc5;
    }
    public double getPriuserdefdecm5(){
        return priuserdefdecm5;
    }

    public void setPriuserdefdecm5(double priuserdefdecm5){
        this.priuserdefdecm5 = priuserdefdecm5;
    }
    public String getPriuserdefnvc6(){
        return priuserdefnvc6;
    }

    public void setPriuserdefnvc6(String priuserdefnvc6){
        this.priuserdefnvc6 = priuserdefnvc6;
    }
    public double getPriuserdefdecm6(){
        return priuserdefdecm6;
    }

    public void setPriuserdefdecm6(double priuserdefdecm6){
        this.priuserdefdecm6 = priuserdefdecm6;
    }
    public String getPubuserdefnvc1(){
        return pubuserdefnvc1;
    }

    public void setPubuserdefnvc1(String pubuserdefnvc1){
        this.pubuserdefnvc1 = pubuserdefnvc1;
    }
    public double getPubuserdefdecm1(){
        return pubuserdefdecm1;
    }

    public void setPubuserdefdecm1(double pubuserdefdecm1){
        this.pubuserdefdecm1 = pubuserdefdecm1;
    }
    public String getPubuserdefnvc2(){
        return pubuserdefnvc2;
    }

    public void setPubuserdefnvc2(String pubuserdefnvc2){
        this.pubuserdefnvc2 = pubuserdefnvc2;
    }
    public double getPubuserdefdecm2(){
        return pubuserdefdecm2;
    }

    public void setPubuserdefdecm2(double pubuserdefdecm2){
        this.pubuserdefdecm2 = pubuserdefdecm2;
    }
    public String getPubuserdefnvc3(){
        return pubuserdefnvc3;
    }

    public void setPubuserdefnvc3(String pubuserdefnvc3){
        this.pubuserdefnvc3 = pubuserdefnvc3;
    }
    public double getPubuserdefdecm3(){
        return pubuserdefdecm3;
    }

    public void setPubuserdefdecm3(double pubuserdefdecm3){
        this.pubuserdefdecm3 = pubuserdefdecm3;
    }
    public String getPubuserdefnvc4(){
        return pubuserdefnvc4;
    }

    public void setPubuserdefnvc4(String pubuserdefnvc4){
        this.pubuserdefnvc4 = pubuserdefnvc4;
    }
    public double getPubuserdefdecm4(){
        return pubuserdefdecm4;
    }

    public void setPubuserdefdecm4(double pubuserdefdecm4){
        this.pubuserdefdecm4 = pubuserdefdecm4;
    }
    public String getPubuserdefnvc5(){
        return pubuserdefnvc5;
    }

    public void setPubuserdefnvc5(String pubuserdefnvc5){
        this.pubuserdefnvc5 = pubuserdefnvc5;
    }
    public double getPubuserdefdecm5(){
        return pubuserdefdecm5;
    }

    public void setPubuserdefdecm5(double pubuserdefdecm5){
        this.pubuserdefdecm5 = pubuserdefdecm5;
    }
    public String getPubuserdefnvc6(){
        return pubuserdefnvc6;
    }

    public void setPubuserdefnvc6(String pubuserdefnvc6){
        this.pubuserdefnvc6 = pubuserdefnvc6;
    }
    public double getPubuserdefdecm6(){
        return pubuserdefdecm6;
    }

    public void setPubuserdefdecm6(double pubuserdefdecm6){
        this.pubuserdefdecm6 = pubuserdefdecm6;
    }
    public int getIsAutoGenerateSaleOrderBOM(){
        return IsAutoGenerateSaleOrderBOM;
    }

    public void setIsAutoGenerateSaleOrderBOM(int IsAutoGenerateSaleOrderBOM){
        this.IsAutoGenerateSaleOrderBOM = IsAutoGenerateSaleOrderBOM;
    }
    public int getIsAutoGenerateRouting(){
        return IsAutoGenerateRouting;
    }

    public void setIsAutoGenerateRouting(int IsAutoGenerateRouting){
        this.IsAutoGenerateRouting = IsAutoGenerateRouting;
    }
    public String getSourceVoucherCode(){
        return SourceVoucherCode;
    }

    public void setSourceVoucherCode(String SourceVoucherCode){
        this.SourceVoucherCode = SourceVoucherCode;
    }
    public String getIsnomodify(){
        return isnomodify;
    }

    public void setIsnomodify(String isnomodify){
        this.isnomodify = isnomodify;
    }
    public String getChanger(){
        return changer;
    }

    public void setChanger(String changer){
        this.changer = changer;
    }
    public String getMobilephone(){
        return Mobilephone;
    }

    public void setMobilephone(String Mobilephone){
        this.Mobilephone = Mobilephone;
    }
    public String getMemberAddress(){
        return MemberAddress;
    }

    public void setMemberAddress(String MemberAddress){
        this.MemberAddress = MemberAddress;
    }
    public int getPrintCount(){
        return PrintCount;
    }

    public void setPrintCount(int PrintCount){
        this.PrintCount = PrintCount;
    }
    public int getIsSeparateByWareHouse(){
        return IsSeparateByWareHouse;
    }

    public void setIsSeparateByWareHouse(int IsSeparateByWareHouse){
        this.IsSeparateByWareHouse = IsSeparateByWareHouse;
    }
    public double getOrigReceiveAmount(){
        return OrigReceiveAmount;
    }

    public void setOrigReceiveAmount(double OrigReceiveAmount){
        this.OrigReceiveAmount = OrigReceiveAmount;
    }
    public double getReceiveAmount(){
        return ReceiveAmount;
    }

    public void setReceiveAmount(double ReceiveAmount){
        this.ReceiveAmount = ReceiveAmount;
    }
    public String getCollaborateVoucherCode(){
        return collaborateVoucherCode;
    }

    public void setCollaborateVoucherCode(String collaborateVoucherCode){
        this.collaborateVoucherCode = collaborateVoucherCode;
    }
    public String getExternalCode(){
        return ExternalCode;
    }

    public void setExternalCode(String ExternalCode){
        this.ExternalCode = ExternalCode;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdbusinesstype(){
        return idbusinesstype;
    }

    public void setIdbusinesstype(int idbusinesstype){
        this.idbusinesstype = idbusinesstype;
    }
    public int getIdcurrency(){
        return idcurrency;
    }

    public void setIdcurrency(int idcurrency){
        this.idcurrency = idcurrency;
    }
    public int getIddepartment(){
        return iddepartment;
    }

    public void setIddepartment(int iddepartment){
        this.iddepartment = iddepartment;
    }
    public int getIdMember(){
        return IdMember;
    }

    public void setIdMember(int IdMember){
        this.IdMember = IdMember;
    }
    public int getIdmarketingOrgan(){
        return idmarketingOrgan;
    }

    public void setIdmarketingOrgan(int idmarketingOrgan){
        this.idmarketingOrgan = idmarketingOrgan;
    }
    public int getIdcustomer(){
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer){
        this.idcustomer = idcustomer;
    }
    public int getIdsettlecustomer(){
        return idsettlecustomer;
    }

    public void setIdsettlecustomer(int idsettlecustomer){
        this.idsettlecustomer = idsettlecustomer;
    }
    public int getIdclerk(){
        return idclerk;
    }

    public void setIdclerk(int idclerk){
        this.idclerk = idclerk;
    }
    public int getIdproject(){
        return idproject;
    }

    public void setIdproject(int idproject){
        this.idproject = idproject;
    }
    public int getIdwarehouse(){
        return idwarehouse;
    }

    public void setIdwarehouse(int idwarehouse){
        this.idwarehouse = idwarehouse;
    }
    public int getIdCollaborateUpVoucherType(){
        return idCollaborateUpVoucherType;
    }

    public void setIdCollaborateUpVoucherType(int idCollaborateUpVoucherType){
        this.idCollaborateUpVoucherType = idCollaborateUpVoucherType;
    }
    public int getIdCollaborateUpVoucher(){
        return idCollaborateUpVoucher;
    }

    public void setIdCollaborateUpVoucher(int idCollaborateUpVoucher){
        this.idCollaborateUpVoucher = idCollaborateUpVoucher;
    }
    public int getDataSource(){
        return DataSource;
    }

    public void setDataSource(int DataSource){
        this.DataSource = DataSource;
    }
    public int getDeliveryMode(){
        return deliveryMode;
    }

    public void setDeliveryMode(int deliveryMode){
        this.deliveryMode = deliveryMode;
    }
    public int getIsCancel(){
        return isCancel;
    }

    public void setIsCancel(int isCancel){
        this.isCancel = isCancel;
    }
    public int getIsSaleDelivery(){
        return isSaleDelivery;
    }

    public void setIsSaleDelivery(int isSaleDelivery){
        this.isSaleDelivery = isSaleDelivery;
    }
    public int getIsSaleOut(){
        return isSaleOut;
    }

    public void setIsSaleOut(int isSaleOut){
        this.isSaleOut = isSaleOut;
    }
    public int getReciveType(){
        return reciveType;
    }

    public void setReciveType(int reciveType){
        this.reciveType = reciveType;
    }
    public int getVoucherState(){
        return voucherState;
    }

    public void setVoucherState(int voucherState){
        this.voucherState = voucherState;
    }
    public int getAuditorid(){
        return auditorid;
    }

    public void setAuditorid(int auditorid){
        this.auditorid = auditorid;
    }
    public int getMakerid(){
        return makerid;
    }

    public void setMakerid(int makerid){
        this.makerid = makerid;
    }
    public int getChangerid(){
        return changerid;
    }

    public void setChangerid(int changerid){
        this.changerid = changerid;
    }
    public int getIdCollaborateDownVoucherType(){
        return idCollaborateDownVoucherType;
    }

    public void setIdCollaborateDownVoucherType(int idCollaborateDownVoucherType){
        this.idCollaborateDownVoucherType = idCollaborateDownVoucherType;
    }
    public int getCollaborateState(){
        return CollaborateState;
    }

    public void setCollaborateState(int CollaborateState){
        this.CollaborateState = CollaborateState;
    }
    public int getIdCollaborateDownDraftVoucher(){
        return idCollaborateDownDraftVoucher;
    }

    public void setIdCollaborateDownDraftVoucher(int idCollaborateDownDraftVoucher){
        this.idCollaborateDownDraftVoucher = idCollaborateDownDraftVoucher;
    }
    public int getSourceVoucherID(){
        return SourceVoucherID;
    }

    public void setSourceVoucherID(int SourceVoucherID){
        this.SourceVoucherID = SourceVoucherID;
    }
    public int getIdsourcevouchertype(){
        return idsourcevouchertype;
    }

    public void setIdsourcevouchertype(int idsourcevouchertype){
        this.idsourcevouchertype = idsourcevouchertype;
    }
    public Date getDeliveryDate(){
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate){
        this.deliveryDate = deliveryDate;
    }
    public Date getVoucherdate(){
        return voucherdate;
    }

    public void setVoucherdate(Date voucherdate){
        this.voucherdate = voucherdate;
    }
    public Date getMadedate(){
        return madedate;
    }

    public void setMadedate(Date madedate){
        this.madedate = madedate;
    }
    public Date getAuditeddate(){
        return auditeddate;
    }

    public void setAuditeddate(Date auditeddate){
        this.auditeddate = auditeddate;
    }
    public Date getCreatedtime(){
        return createdtime;
    }

    public void setCreatedtime(Date createdtime){
        this.createdtime = createdtime;
    }
    public Date getUpdated(){
        return updated;
    }

    public void setUpdated(Date updated){
        this.updated = updated;
    }
    public Date getChangedate(){
        return changedate;
    }

    public void setChangedate(Date changedate){
        this.changedate = changedate;
    }
    public String getExternalVoucherCode(){
        return ExternalVoucherCode;
    }

    public void setExternalVoucherCode(String ExternalVoucherCode){
        this.ExternalVoucherCode = ExternalVoucherCode;
    }
    public String getCustomerPhone(){
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone){
        this.CustomerPhone = CustomerPhone;
    }
    public String getHasRecordCredit(){
        return HasRecordCredit;
    }

    public void setHasRecordCredit(String HasRecordCredit){
        this.HasRecordCredit = HasRecordCredit;
    }
    public String getIsAutoWarehouse(){
        return IsAutoWarehouse;
    }

    public void setIsAutoWarehouse(String IsAutoWarehouse){
        this.IsAutoWarehouse = IsAutoWarehouse;
    }
    public int getInputDataSource(){
        return InputDataSource;
    }

    public void setInputDataSource(int InputDataSource){
        this.InputDataSource = InputDataSource;
    }
    public String getCloser(){
        return Closer;
    }

    public void setCloser(String Closer){
        this.Closer = Closer;
    }
    public Date getCloseDate(){
        return CloseDate;
    }

    public void setCloseDate(Date CloseDate){
        this.CloseDate = CloseDate;
    }
}
