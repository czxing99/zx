
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

@AxTable(name = "AA_Partner")
public class Partner   {

	private static final long serialVersionUID = -4105201812160112172L;

	@AxColumn(name ="code", length = 32)
    private String code;

	@AxColumn(name ="name", length = 200)
    private String name;

	@AxColumn(name ="partnerAbbName", length = 100)
    private String partnerAbbName;

	@AxColumn(name ="shortHand", length = 100)
    private String shortHand;

	@AxColumn(name ="representative", length = 50)
    private String representative;

	@AxColumn(name ="bankAccount", length = 50)
    private String bankAccount;

	@AxColumn(name ="taxRegcode", length = 50)
    private String taxRegcode;

	@AxColumn(name ="saleCreditLine", length = 0)
    private String saleCreditLine;

	@AxColumn(name ="saleCreditDays", length = 0)
    private String saleCreditDays;

	@AxColumn(name ="purchaseCreditDays", length = 0)
    private String purchaseCreditDays;

	@AxColumn(name ="saleSpaceMonth", length = 0)
    private int saleSpaceMonth;

	@AxColumn(name ="saleCheckMonth", length = 0)
    private int saleCheckMonth;

	@AxColumn(name ="saleCheckDate", length = 0)
    private int saleCheckDate;

	@AxColumn(name ="purchaseSpaceMonth", length = 0)
    private int purchaseSpaceMonth;

	@AxColumn(name ="purchaseCheckMonth", length = 0)
    private int purchaseCheckMonth;

	@AxColumn(name ="purchaseCheckDate", length = 0)
    private int purchaseCheckDate;

	@AxColumn(name ="customeraddressphone", length = 250)
    private String customeraddressphone;

	@AxColumn(name ="ARBalance_Abandon", length = 0)
    private String ARBalanceAbandon;

	@AxColumn(name ="APBalance_Abandon", length = 0)
    private String APBalanceAbandon;

	@AxColumn(name ="disabled", length = 0)
    private int disabled;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="priuserdefnvc1", length = 500)
    private String priuserdefnvc1;

	@AxColumn(name ="priuserdefdecm1", length = 0)
    private String priuserdefdecm1;

	@AxColumn(name ="priuserdefnvc2", length = 500)
    private String priuserdefnvc2;

	@AxColumn(name ="priuserdefdecm2", length = 0)
    private String priuserdefdecm2;

	@AxColumn(name ="priuserdefnvc3", length = 500)
    private String priuserdefnvc3;

	@AxColumn(name ="priuserdefdecm3", length = 0)
    private String priuserdefdecm3;

	@AxColumn(name ="priuserdefnvc4", length = 500)
    private String priuserdefnvc4;

	@AxColumn(name ="priuserdefdecm4", length = 0)
    private String priuserdefdecm4;

	@AxColumn(name ="priuserdefnvc5", length = 500)
    private String priuserdefnvc5;

	@AxColumn(name ="priuserdefdecm5", length = 0)
    private String priuserdefdecm5;

	@AxColumn(name ="isContainTaxOnPurchase", length = 0)
    private int isContainTaxOnPurchase;

	@AxColumn(name ="HasEverChanged", length = 32)
    private String HasEverChanged;

	@AxColumn(name ="codeSettlementPartner", length = 32)
    private String codeSettlementPartner;

	@AxColumn(name ="AdvRBalance_Abandon", length = 0)
    private String AdvRBalanceAbandon;

	@AxColumn(name ="AdvPBalance_Abandon", length = 0)
    private String AdvPBalanceAbandon;

	@AxColumn(name ="addressJC", length = 200)
    private String addressJC;

	@AxColumn(name ="ShipmentAddress", length = 200)
    private String ShipmentAddress;

	@AxColumn(name ="Contact", length = 50)
    private String Contact;

	@AxColumn(name ="MobilePhone", length = 30)
    private String MobilePhone;

	@AxColumn(name ="TelephoneNo", length = 100)
    private String TelephoneNo;

	@AxColumn(name ="Fax", length = 20)
    private String Fax;

	@AxColumn(name ="EmailAddr", length = 100)
    private String EmailAddr;

	@AxColumn(name ="QqNo", length = 50)
    private String QqNo;

	@AxColumn(name ="MsnAddress", length = 50)
    private String MsnAddress;

	@AxColumn(name ="UuNo", length = 50)
    private String UuNo;

	@AxColumn(name ="creditBalance", length = 0)
    private String creditBalance;

	@AxColumn(name ="extendedAccounts", length = 0)
    private String extendedAccounts;

	@AxColumn(name ="SellCustomer", length = 0)
    private int SellCustomer;

	@AxColumn(name ="MadeRecordDate", length = 0)
    private Date MadeRecordDate;

	@AxColumn(name ="Position", length = 50)
    private String Position;

	@AxColumn(name ="RunShop", length = 0)
    private int RunShop;

	@AxColumn(name ="CheckAddress", length = 200)
    private String CheckAddress;

	@AxColumn(name ="CustomerAddress", length = 200)
    private String CustomerAddress;

	@AxColumn(name ="Birthday", length = 0)
    private Date Birthday;

	@AxColumn(name ="AutoCreateMember", length = 0)
    private int AutoCreateMember;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idsaledepartment", length = 0)
    private int idsaledepartment;

	@AxColumn(name ="iddistrict", length = 0)
    private int iddistrict;

	@AxColumn(name ="idMarketingOrgan", length = 0)
    private int idMarketingOrgan;

	@AxColumn(name ="idPmarketingOrgan", length = 0)
    private int idPmarketingOrgan;

	@AxColumn(name ="idsettlementPartner", length = 0)
    private int idsettlementPartner;

	@AxColumn(name ="idpartnerclass", length = 0)
    private int idpartnerclass;

	@AxColumn(name ="idsaleman", length = 0)
    private int idsaleman;

	@AxColumn(name ="idMemberType", length = 0)
    private int idMemberType;

	@AxColumn(name ="accbank", length = 0)
    private int accbank;

	@AxColumn(name ="customerType", length = 0)
    private int customerType;

	@AxColumn(name ="partnerType", length = 0)
    private int partnerType;

	@AxColumn(name ="priceGrade", length = 0)
    private int priceGrade;

	@AxColumn(name ="purchaseSettleStyle", length = 0)
    private int purchaseSettleStyle;

	@AxColumn(name ="saleSettleStyle", length = 0)
    private int saleSettleStyle;

	@AxColumn(name ="taxRate", length = 0)
    private int taxRate;

	@AxColumn(name ="saleStartDate", length = 0)
    private Date saleStartDate;

	@AxColumn(name ="purchaseStartDate", length = 0)
    private Date purchaseStartDate;

	@AxColumn(name ="madeDate", length = 0)
    private Date madeDate;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="createdTime", length = 0)
    private Date createdTime;

	@AxColumn(name ="eAccount", length = 200)
    private String eAccount;

	@AxColumn(name ="IsModifiedCode", length = 0)
    private int IsModifiedCode;

	@AxColumn(name ="ElectronicInvoiceReceiveMode", length = 0)
    private int ElectronicInvoiceReceiveMode;

	@AxColumn(name ="ElectronicInvoiceReceiveEMail", length = 100)
    private String ElectronicInvoiceReceiveEMail;

	@AxColumn(name ="ElectronicInvoiceReceiveMobilePhone", length = 50)
    private String ElectronicInvoiceReceiveMobilePhone;

	@AxColumn(name ="DefaultInvoiceTypeOfReceive", length = 0)
    private int DefaultInvoiceTypeOfReceive;

	@AxColumn(name ="iddefaultSettleStyleOfReceive", length = 0)
    private int iddefaultSettleStyleOfReceive;

	@AxColumn(name ="iddefaultBankAccountOfReceive", length = 0)
    private int iddefaultBankAccountOfReceive;

	@AxColumn(name ="DefaultInvoiceTypeOfPayment", length = 0)
    private int DefaultInvoiceTypeOfPayment;

	@AxColumn(name ="iddefaultSettleStyleOfPayment", length = 0)
    private int iddefaultSettleStyleOfPayment;

	@AxColumn(name ="iddefaultBankAccountOfPayment", length = 0)
    private int iddefaultBankAccountOfPayment;

	@AxColumn(name ="isAutoCancel", length = 0)
    private int isAutoCancel;

	@AxColumn(name ="IsSystem", length = 0)
    private int IsSystem;

	@AxColumn(name ="VisitAddress", length = 500)
    private String VisitAddress;

	@AxColumn(name ="Coordinate", length = 200)
    private String Coordinate;

	@AxColumn(name ="Longitude", length = 200)
    private String Longitude;

	@AxColumn(name ="Latitude", length = 200)
    private String Latitude;

	@AxColumn(name ="CheckInScope", length = 0)
    private String CheckInScope;

	@AxColumn(name ="VisitFrequency", length = 0)
    private String VisitFrequency;

	@AxColumn(name ="IsNeedCheckInPhoto", length = 0)
    private int IsNeedCheckInPhoto;

	@AxColumn(name ="IsNeedLyHuoPhoto", length = 0)
    private int IsNeedLyHuoPhoto;

	@AxColumn(name ="IsNeedPromotionPhoto", length = 0)
    private int IsNeedPromotionPhoto;

	@AxColumn(name ="IsNeedCompetitorPhoto", length = 0)
    private int IsNeedCompetitorPhoto;

	@AxColumn(name ="PrintCount", length = 0)
    private int PrintCount;

	@AxColumn(name ="Creater", length = 200)
    private String Creater;

	@AxColumn(name ="Changer", length = 200)
    private String Changer;

	@AxColumn(name ="Changedate", length = 0)
    private Date Changedate;

	@AxColumn(name ="Route", length = 500)
    private String Route;

	@AxColumn(name ="SavedRoutes", length = 500)
    private String SavedRoutes;


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
    public String getPartnerAbbName(){
        return partnerAbbName;
    }

    public void setPartnerAbbName(String partnerAbbName){
        this.partnerAbbName = partnerAbbName;
    }
    public String getShortHand(){
        return shortHand;
    }

    public void setShortHand(String shortHand){
        this.shortHand = shortHand;
    }
    public String getRepresentative(){
        return representative;
    }

    public void setRepresentative(String representative){
        this.representative = representative;
    }
    public String getBankAccount(){
        return bankAccount;
    }

    public void setBankAccount(String bankAccount){
        this.bankAccount = bankAccount;
    }
    public String getTaxRegcode(){
        return taxRegcode;
    }

    public void setTaxRegcode(String taxRegcode){
        this.taxRegcode = taxRegcode;
    }
    public String getSaleCreditLine(){
        return saleCreditLine;
    }

    public void setSaleCreditLine(String saleCreditLine){
        this.saleCreditLine = saleCreditLine;
    }
    public String getSaleCreditDays(){
        return saleCreditDays;
    }

    public void setSaleCreditDays(String saleCreditDays){
        this.saleCreditDays = saleCreditDays;
    }
    public String getPurchaseCreditDays(){
        return purchaseCreditDays;
    }

    public void setPurchaseCreditDays(String purchaseCreditDays){
        this.purchaseCreditDays = purchaseCreditDays;
    }
    public int getSaleSpaceMonth(){
        return saleSpaceMonth;
    }

    public void setSaleSpaceMonth(int saleSpaceMonth){
        this.saleSpaceMonth = saleSpaceMonth;
    }
    public int getSaleCheckMonth(){
        return saleCheckMonth;
    }

    public void setSaleCheckMonth(int saleCheckMonth){
        this.saleCheckMonth = saleCheckMonth;
    }
    public int getSaleCheckDate(){
        return saleCheckDate;
    }

    public void setSaleCheckDate(int saleCheckDate){
        this.saleCheckDate = saleCheckDate;
    }
    public int getPurchaseSpaceMonth(){
        return purchaseSpaceMonth;
    }

    public void setPurchaseSpaceMonth(int purchaseSpaceMonth){
        this.purchaseSpaceMonth = purchaseSpaceMonth;
    }
    public int getPurchaseCheckMonth(){
        return purchaseCheckMonth;
    }

    public void setPurchaseCheckMonth(int purchaseCheckMonth){
        this.purchaseCheckMonth = purchaseCheckMonth;
    }
    public int getPurchaseCheckDate(){
        return purchaseCheckDate;
    }

    public void setPurchaseCheckDate(int purchaseCheckDate){
        this.purchaseCheckDate = purchaseCheckDate;
    }
    public String getCustomeraddressphone(){
        return customeraddressphone;
    }

    public void setCustomeraddressphone(String customeraddressphone){
        this.customeraddressphone = customeraddressphone;
    }
    public String getARBalanceAbandon(){
        return ARBalanceAbandon;
    }

    public void setARBalanceAbandon(String ARBalanceAbandon){
        this.ARBalanceAbandon = ARBalanceAbandon;
    }
    public String getAPBalanceAbandon(){
        return APBalanceAbandon;
    }

    public void setAPBalanceAbandon(String APBalanceAbandon){
        this.APBalanceAbandon = APBalanceAbandon;
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
    public String getPriuserdefnvc1(){
        return priuserdefnvc1;
    }

    public void setPriuserdefnvc1(String priuserdefnvc1){
        this.priuserdefnvc1 = priuserdefnvc1;
    }
    public String getPriuserdefdecm1(){
        return priuserdefdecm1;
    }

    public void setPriuserdefdecm1(String priuserdefdecm1){
        this.priuserdefdecm1 = priuserdefdecm1;
    }
    public String getPriuserdefnvc2(){
        return priuserdefnvc2;
    }

    public void setPriuserdefnvc2(String priuserdefnvc2){
        this.priuserdefnvc2 = priuserdefnvc2;
    }
    public String getPriuserdefdecm2(){
        return priuserdefdecm2;
    }

    public void setPriuserdefdecm2(String priuserdefdecm2){
        this.priuserdefdecm2 = priuserdefdecm2;
    }
    public String getPriuserdefnvc3(){
        return priuserdefnvc3;
    }

    public void setPriuserdefnvc3(String priuserdefnvc3){
        this.priuserdefnvc3 = priuserdefnvc3;
    }
    public String getPriuserdefdecm3(){
        return priuserdefdecm3;
    }

    public void setPriuserdefdecm3(String priuserdefdecm3){
        this.priuserdefdecm3 = priuserdefdecm3;
    }
    public String getPriuserdefnvc4(){
        return priuserdefnvc4;
    }

    public void setPriuserdefnvc4(String priuserdefnvc4){
        this.priuserdefnvc4 = priuserdefnvc4;
    }
    public String getPriuserdefdecm4(){
        return priuserdefdecm4;
    }

    public void setPriuserdefdecm4(String priuserdefdecm4){
        this.priuserdefdecm4 = priuserdefdecm4;
    }
    public String getPriuserdefnvc5(){
        return priuserdefnvc5;
    }

    public void setPriuserdefnvc5(String priuserdefnvc5){
        this.priuserdefnvc5 = priuserdefnvc5;
    }
    public String getPriuserdefdecm5(){
        return priuserdefdecm5;
    }

    public void setPriuserdefdecm5(String priuserdefdecm5){
        this.priuserdefdecm5 = priuserdefdecm5;
    }
    public int getIsContainTaxOnPurchase(){
        return isContainTaxOnPurchase;
    }

    public void setIsContainTaxOnPurchase(int isContainTaxOnPurchase){
        this.isContainTaxOnPurchase = isContainTaxOnPurchase;
    }
    public String getHasEverChanged(){
        return HasEverChanged;
    }

    public void setHasEverChanged(String HasEverChanged){
        this.HasEverChanged = HasEverChanged;
    }
    public String getCodeSettlementPartner(){
        return codeSettlementPartner;
    }

    public void setCodeSettlementPartner(String codeSettlementPartner){
        this.codeSettlementPartner = codeSettlementPartner;
    }
    public String getAdvRBalanceAbandon(){
        return AdvRBalanceAbandon;
    }

    public void setAdvRBalanceAbandon(String AdvRBalanceAbandon){
        this.AdvRBalanceAbandon = AdvRBalanceAbandon;
    }
    public String getAdvPBalanceAbandon(){
        return AdvPBalanceAbandon;
    }

    public void setAdvPBalanceAbandon(String AdvPBalanceAbandon){
        this.AdvPBalanceAbandon = AdvPBalanceAbandon;
    }
    public String getAddressJC(){
        return addressJC;
    }

    public void setAddressJC(String addressJC){
        this.addressJC = addressJC;
    }
    public String getShipmentAddress(){
        return ShipmentAddress;
    }

    public void setShipmentAddress(String ShipmentAddress){
        this.ShipmentAddress = ShipmentAddress;
    }
    public String getContact(){
        return Contact;
    }

    public void setContact(String Contact){
        this.Contact = Contact;
    }
    public String getMobilePhone(){
        return MobilePhone;
    }

    public void setMobilePhone(String MobilePhone){
        this.MobilePhone = MobilePhone;
    }
    public String getTelephoneNo(){
        return TelephoneNo;
    }

    public void setTelephoneNo(String TelephoneNo){
        this.TelephoneNo = TelephoneNo;
    }
    public String getFax(){
        return Fax;
    }

    public void setFax(String Fax){
        this.Fax = Fax;
    }
    public String getEmailAddr(){
        return EmailAddr;
    }

    public void setEmailAddr(String EmailAddr){
        this.EmailAddr = EmailAddr;
    }
    public String getQqNo(){
        return QqNo;
    }

    public void setQqNo(String QqNo){
        this.QqNo = QqNo;
    }
    public String getMsnAddress(){
        return MsnAddress;
    }

    public void setMsnAddress(String MsnAddress){
        this.MsnAddress = MsnAddress;
    }
    public String getUuNo(){
        return UuNo;
    }

    public void setUuNo(String UuNo){
        this.UuNo = UuNo;
    }
    public String getCreditBalance(){
        return creditBalance;
    }

    public void setCreditBalance(String creditBalance){
        this.creditBalance = creditBalance;
    }
    public String getExtendedAccounts(){
        return extendedAccounts;
    }

    public void setExtendedAccounts(String extendedAccounts){
        this.extendedAccounts = extendedAccounts;
    }
    public int getSellCustomer(){
        return SellCustomer;
    }

    public void setSellCustomer(int SellCustomer){
        this.SellCustomer = SellCustomer;
    }
    public Date getMadeRecordDate(){
        return MadeRecordDate;
    }

    public void setMadeRecordDate(Date MadeRecordDate){
        this.MadeRecordDate = MadeRecordDate;
    }
    public String getPosition(){
        return Position;
    }

    public void setPosition(String Position){
        this.Position = Position;
    }
    public int getRunShop(){
        return RunShop;
    }

    public void setRunShop(int RunShop){
        this.RunShop = RunShop;
    }
    public String getCheckAddress(){
        return CheckAddress;
    }

    public void setCheckAddress(String CheckAddress){
        this.CheckAddress = CheckAddress;
    }
    public String getCustomerAddress(){
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress){
        this.CustomerAddress = CustomerAddress;
    }
    public Date getBirthday(){
        return Birthday;
    }

    public void setBirthday(Date Birthday){
        this.Birthday = Birthday;
    }
    public int getAutoCreateMember(){
        return AutoCreateMember;
    }

    public void setAutoCreateMember(int AutoCreateMember){
        this.AutoCreateMember = AutoCreateMember;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdsaledepartment(){
        return idsaledepartment;
    }

    public void setIdsaledepartment(int idsaledepartment){
        this.idsaledepartment = idsaledepartment;
    }
    public int getIddistrict(){
        return iddistrict;
    }

    public void setIddistrict(int iddistrict){
        this.iddistrict = iddistrict;
    }
    public int getIdMarketingOrgan(){
        return idMarketingOrgan;
    }

    public void setIdMarketingOrgan(int idMarketingOrgan){
        this.idMarketingOrgan = idMarketingOrgan;
    }
    public int getIdPmarketingOrgan(){
        return idPmarketingOrgan;
    }

    public void setIdPmarketingOrgan(int idPmarketingOrgan){
        this.idPmarketingOrgan = idPmarketingOrgan;
    }
    public int getIdsettlementPartner(){
        return idsettlementPartner;
    }

    public void setIdsettlementPartner(int idsettlementPartner){
        this.idsettlementPartner = idsettlementPartner;
    }
    public int getIdpartnerclass(){
        return idpartnerclass;
    }

    public void setIdpartnerclass(int idpartnerclass){
        this.idpartnerclass = idpartnerclass;
    }
    public int getIdsaleman(){
        return idsaleman;
    }

    public void setIdsaleman(int idsaleman){
        this.idsaleman = idsaleman;
    }
    public int getIdMemberType(){
        return idMemberType;
    }

    public void setIdMemberType(int idMemberType){
        this.idMemberType = idMemberType;
    }
    public int getAccbank(){
        return accbank;
    }

    public void setAccbank(int accbank){
        this.accbank = accbank;
    }
    public int getCustomerType(){
        return customerType;
    }

    public void setCustomerType(int customerType){
        this.customerType = customerType;
    }
    public int getPartnerType(){
        return partnerType;
    }

    public void setPartnerType(int partnerType){
        this.partnerType = partnerType;
    }
    public int getPriceGrade(){
        return priceGrade;
    }

    public void setPriceGrade(int priceGrade){
        this.priceGrade = priceGrade;
    }
    public int getPurchaseSettleStyle(){
        return purchaseSettleStyle;
    }

    public void setPurchaseSettleStyle(int purchaseSettleStyle){
        this.purchaseSettleStyle = purchaseSettleStyle;
    }
    public int getSaleSettleStyle(){
        return saleSettleStyle;
    }

    public void setSaleSettleStyle(int saleSettleStyle){
        this.saleSettleStyle = saleSettleStyle;
    }
    public int getTaxRate(){
        return taxRate;
    }

    public void setTaxRate(int taxRate){
        this.taxRate = taxRate;
    }
    public Date getSaleStartDate(){
        return saleStartDate;
    }

    public void setSaleStartDate(Date saleStartDate){
        this.saleStartDate = saleStartDate;
    }
    public Date getPurchaseStartDate(){
        return purchaseStartDate;
    }

    public void setPurchaseStartDate(Date purchaseStartDate){
        this.purchaseStartDate = purchaseStartDate;
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
    public String getEAccount(){
        return eAccount;
    }

    public void setEAccount(String eAccount){
        this.eAccount = eAccount;
    }
    public int getIsModifiedCode(){
        return IsModifiedCode;
    }

    public void setIsModifiedCode(int IsModifiedCode){
        this.IsModifiedCode = IsModifiedCode;
    }
    public int getElectronicInvoiceReceiveMode(){
        return ElectronicInvoiceReceiveMode;
    }

    public void setElectronicInvoiceReceiveMode(int ElectronicInvoiceReceiveMode){
        this.ElectronicInvoiceReceiveMode = ElectronicInvoiceReceiveMode;
    }
    public String getElectronicInvoiceReceiveEMail(){
        return ElectronicInvoiceReceiveEMail;
    }

    public void setElectronicInvoiceReceiveEMail(String ElectronicInvoiceReceiveEMail){
        this.ElectronicInvoiceReceiveEMail = ElectronicInvoiceReceiveEMail;
    }
    public String getElectronicInvoiceReceiveMobilePhone(){
        return ElectronicInvoiceReceiveMobilePhone;
    }

    public void setElectronicInvoiceReceiveMobilePhone(String ElectronicInvoiceReceiveMobilePhone){
        this.ElectronicInvoiceReceiveMobilePhone = ElectronicInvoiceReceiveMobilePhone;
    }
    public int getDefaultInvoiceTypeOfReceive(){
        return DefaultInvoiceTypeOfReceive;
    }

    public void setDefaultInvoiceTypeOfReceive(int DefaultInvoiceTypeOfReceive){
        this.DefaultInvoiceTypeOfReceive = DefaultInvoiceTypeOfReceive;
    }
    public int getIddefaultSettleStyleOfReceive(){
        return iddefaultSettleStyleOfReceive;
    }

    public void setIddefaultSettleStyleOfReceive(int iddefaultSettleStyleOfReceive){
        this.iddefaultSettleStyleOfReceive = iddefaultSettleStyleOfReceive;
    }
    public int getIddefaultBankAccountOfReceive(){
        return iddefaultBankAccountOfReceive;
    }

    public void setIddefaultBankAccountOfReceive(int iddefaultBankAccountOfReceive){
        this.iddefaultBankAccountOfReceive = iddefaultBankAccountOfReceive;
    }
    public int getDefaultInvoiceTypeOfPayment(){
        return DefaultInvoiceTypeOfPayment;
    }

    public void setDefaultInvoiceTypeOfPayment(int DefaultInvoiceTypeOfPayment){
        this.DefaultInvoiceTypeOfPayment = DefaultInvoiceTypeOfPayment;
    }
    public int getIddefaultSettleStyleOfPayment(){
        return iddefaultSettleStyleOfPayment;
    }

    public void setIddefaultSettleStyleOfPayment(int iddefaultSettleStyleOfPayment){
        this.iddefaultSettleStyleOfPayment = iddefaultSettleStyleOfPayment;
    }
    public int getIddefaultBankAccountOfPayment(){
        return iddefaultBankAccountOfPayment;
    }

    public void setIddefaultBankAccountOfPayment(int iddefaultBankAccountOfPayment){
        this.iddefaultBankAccountOfPayment = iddefaultBankAccountOfPayment;
    }
    public int getIsAutoCancel(){
        return isAutoCancel;
    }

    public void setIsAutoCancel(int isAutoCancel){
        this.isAutoCancel = isAutoCancel;
    }
    public int getIsSystem(){
        return IsSystem;
    }

    public void setIsSystem(int IsSystem){
        this.IsSystem = IsSystem;
    }
    public String getVisitAddress(){
        return VisitAddress;
    }

    public void setVisitAddress(String VisitAddress){
        this.VisitAddress = VisitAddress;
    }
    public String getCoordinate(){
        return Coordinate;
    }

    public void setCoordinate(String Coordinate){
        this.Coordinate = Coordinate;
    }
    public String getLongitude(){
        return Longitude;
    }

    public void setLongitude(String Longitude){
        this.Longitude = Longitude;
    }
    public String getLatitude(){
        return Latitude;
    }

    public void setLatitude(String Latitude){
        this.Latitude = Latitude;
    }
    public String getCheckInScope(){
        return CheckInScope;
    }

    public void setCheckInScope(String CheckInScope){
        this.CheckInScope = CheckInScope;
    }
    public String getVisitFrequency(){
        return VisitFrequency;
    }

    public void setVisitFrequency(String VisitFrequency){
        this.VisitFrequency = VisitFrequency;
    }
    public int getIsNeedCheckInPhoto(){
        return IsNeedCheckInPhoto;
    }

    public void setIsNeedCheckInPhoto(int IsNeedCheckInPhoto){
        this.IsNeedCheckInPhoto = IsNeedCheckInPhoto;
    }
    public int getIsNeedLyHuoPhoto(){
        return IsNeedLyHuoPhoto;
    }

    public void setIsNeedLyHuoPhoto(int IsNeedLyHuoPhoto){
        this.IsNeedLyHuoPhoto = IsNeedLyHuoPhoto;
    }
    public int getIsNeedPromotionPhoto(){
        return IsNeedPromotionPhoto;
    }

    public void setIsNeedPromotionPhoto(int IsNeedPromotionPhoto){
        this.IsNeedPromotionPhoto = IsNeedPromotionPhoto;
    }
    public int getIsNeedCompetitorPhoto(){
        return IsNeedCompetitorPhoto;
    }

    public void setIsNeedCompetitorPhoto(int IsNeedCompetitorPhoto){
        this.IsNeedCompetitorPhoto = IsNeedCompetitorPhoto;
    }
    public int getPrintCount(){
        return PrintCount;
    }

    public void setPrintCount(int PrintCount){
        this.PrintCount = PrintCount;
    }
    public String getCreater(){
        return Creater;
    }

    public void setCreater(String Creater){
        this.Creater = Creater;
    }
    public String getChanger(){
        return Changer;
    }

    public void setChanger(String Changer){
        this.Changer = Changer;
    }
    public Date getChangedate(){
        return Changedate;
    }

    public void setChangedate(Date Changedate){
        this.Changedate = Changedate;
    }
    public String getRoute(){
        return Route;
    }

    public void setRoute(String Route){
        this.Route = Route;
    }
    public String getSavedRoutes(){
        return SavedRoutes;
    }

    public void setSavedRoutes(String SavedRoutes){
        this.SavedRoutes = SavedRoutes;
    }
}
