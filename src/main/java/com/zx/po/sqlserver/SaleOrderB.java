
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

@AxTable(name = "SA_SaleOrder_b")
public class SaleOrderB  {

	private static final long serialVersionUID = -2458201812161512891L;

	@AxColumn(name ="code", length = 30)
    private String code;

	@AxColumn(name ="quantity", length = 0)
    private double quantity;

	@AxColumn(name ="quantity2", length = 0,isNull = "1")
    private double quantity2;

	@AxColumn(name ="baseQuantity", length = 0)
    private double baseQuantity;

	@AxColumn(name ="subQuantity", length = 0,isNull = "1")
    private double subQuantity;

	@AxColumn(name ="compositionQuantity", length = 100)
    private String compositionQuantity;

	@AxColumn(name ="origPrice", length = 0,isNull = "1")
    private double origPrice;

	@AxColumn(name ="price", length = 0,isNull = "1")
    private double price;

	@AxColumn(name ="basePrice", length = 0,isNull = "1")
    private double basePrice;

	@AxColumn(name ="discountRate", length = 0)
    private double discountRate;

	@AxColumn(name ="origDiscountPrice", length = 0)
    private double origDiscountPrice;

	@AxColumn(name ="discountPrice", length = 0)
    private double discountPrice;

	@AxColumn(name ="baseDiscountPrice", length = 0,isNull = "1")
    private double baseDiscountPrice;

	@AxColumn(name ="taxRate", length = 0)
    private double taxRate;

	@AxColumn(name ="origTaxPrice", length = 0)
    private double origTaxPrice;

	@AxColumn(name ="taxPrice", length = 0)
    private double taxPrice;

	@AxColumn(name ="baseTaxPrice", length = 0,isNull = "1")
    private double baseTaxPrice;

	@AxColumn(name ="origDiscountAmount", length = 0)
    private double origDiscountAmount;

	@AxColumn(name ="discountAmount", length = 0)
    private double discountAmount;

	@AxColumn(name ="origTax", length = 0)
    private double origTax;

	@AxColumn(name ="tax", length = 0)
    private double tax;

	@AxColumn(name ="origTaxAmount", length = 0)
    private double origTaxAmount;

	@AxColumn(name ="taxAmount", length = 0)
    private double taxAmount;

	@AxColumn(name ="isPresent", length = 0)
    private int isPresent;

	@AxColumn(name ="manufactureQuantity", length = 0)
    private double manufactureQuantity;

	@AxColumn(name ="manufactureQuantity2", length = 0,isNull = "1")
    private double manufactureQuantity2;

	@AxColumn(name ="purchaseQuantity", length = 0,isNull = "1" )
    private double purchaseQuantity;

	@AxColumn(name ="purchaseQuantity2", length = 0,isNull = "1")
    private double purchaseQuantity2;

	@AxColumn(name ="deliveryQuantity", length = 0,isNull = "1")
    private double deliveryQuantity;

	@AxColumn(name ="deliveryQuantity2", length = 0,isNull = "1")
    private double deliveryQuantity2;

	@AxColumn(name ="saleOutQuantity", length = 0,isNull = "1")
    private double saleOutQuantity;

	@AxColumn(name ="saleOutQuantity2", length = 0,isNull = "1")
    private double saleOutQuantity2;

	@AxColumn(name ="executedQuantity", length = 0,isNull = "1")
    private double executedQuantity;

	@AxColumn(name ="executedQuantity2", length = 0,isNull = "1")
    private double executedQuantity2;

	@AxColumn(name ="unitExchangeRate", length = 0,isNull = "1")
    private double unitExchangeRate;

	@AxColumn(name ="origDiscount", length = 0,isNull = "1")
    private double origDiscount;

	@AxColumn(name ="discount", length = 0,isNull = "1")
    private double discount;

	@AxColumn(name ="taxFlag", length = 0)
    private int taxFlag;

	@AxColumn(name ="inventoryBarCode", length = 200)
    private String inventoryBarCode;

	@AxColumn(name ="partnerInventoryCode", length = 300)
    private String partnerInventoryCode;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="freeItem0", length = 300)
    private String freeItem0;

	@AxColumn(name ="freeItem1", length = 300)
    private String freeItem1;

	@AxColumn(name ="freeItem2", length = 300)
    private String freeItem2;

	@AxColumn(name ="freeItem3", length = 300)
    private String freeItem3;

	@AxColumn(name ="freeItem4", length = 300)
    private String freeItem4;

	@AxColumn(name ="freeItem5", length = 300)
    private String freeItem5;

	@AxColumn(name ="freeItem6", length = 300)
    private String freeItem6;

	@AxColumn(name ="freeItem7", length = 300)
    private String freeItem7;

	@AxColumn(name ="freeItem8", length = 300)
    private String freeItem8;

	@AxColumn(name ="freeItem9", length = 300)
    private String freeItem9;

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

	@AxColumn(name ="partnerInventoryName", length = 300)
    private String partnerInventoryName;

	@AxColumn(name ="HasPRA", length = 0)
    private int HasPRA;

	@AxColumn(name ="prarequiretimes", length = 0)
    private int prarequiretimes;

	@AxColumn(name ="hasorderbom", length = 0,isNull = "1")
    private int hasorderbom;

	@AxColumn(name ="isnomodify", length = 1000)
    private String isnomodify;

	@AxColumn(name ="SourceVoucherCode", length = 50)
    private String SourceVoucherCode;

	@AxColumn(name ="detailVoucherState", length = 20)
    private String detailVoucherState;

	@AxColumn(name ="Retailprice", length = 0,isNull = "1")
    private double Retailprice;

	@AxColumn(name ="DistributionQuantity", length = 0,isNull = "1")
    private double DistributionQuantity;

	@AxColumn(name ="DistributionQuantity2", length = 0,isNull = "1")
    private double DistributionQuantity2;

	@AxColumn(name ="PriceStrategyTypeName", length = 200)
    private String PriceStrategyTypeName;

	@AxColumn(name ="PriceStrategySchemeIds", length = 1000)
    private String PriceStrategySchemeIds;

	@AxColumn(name ="PriceStrategySchemeNames", length = 400)
    private String PriceStrategySchemeNames;

	@AxColumn(name ="PromotionVoucherCodes", length = 400)
    private String PromotionVoucherCodes;

	@AxColumn(name ="PromotionVoucherIds", length = 400)
    private String PromotionVoucherIds;

	@AxColumn(name ="IsMemberIntegral", length = 0)
    private int IsMemberIntegral;

	@AxColumn(name ="IsPromotionPresent", length = 0)
    private int IsPromotionPresent;

	@AxColumn(name ="PromotionPresentVoucherCode", length = 50)
    private String PromotionPresentVoucherCode;

	@AxColumn(name ="PromotionSingleVoucherCode", length = 50)
    private String PromotionSingleVoucherCode;

	@AxColumn(name ="PromotionPresentGroupID", length = 150)
    private String PromotionPresentGroupID;

	@AxColumn(name ="PromotionSingleGroupID", length = 150)
    private String PromotionSingleGroupID;

	@AxColumn(name ="DetailMemo", length = 200)
    private String DetailMemo;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idbom", length = 0,isNull = "1")
    private int idbom;

	@AxColumn(name ="idinventory", length = 0)
    private int idinventory;

	@AxColumn(name ="idproject", length = 0,isNull = "1")
    private int idproject;

	@AxColumn(name ="idbaseunit", length = 0,isNull = "1")
    private int idbaseunit;

	@AxColumn(name ="idsubunit", length = 0)
    private int idsubunit;

	@AxColumn(name ="idunit", length = 0)
    private int idunit;

	@AxColumn(name ="idunit2", length = 0,isNull = "1")
    private int idunit2;

	@AxColumn(name ="idwarehouse", length = 0,isNull = "1")
    private int idwarehouse;

	@AxColumn(name ="CashbackWay", length = 0,isNull = "1")
    private int CashbackWay;

	@AxColumn(name ="PriceStrategyTypeId", length = 0,isNull = "1")
    private int PriceStrategyTypeId;

	@AxColumn(name ="PromotionPresentTypeID", length = 0,isNull = "1")
    private int PromotionPresentTypeID;

	@AxColumn(name ="PromotionSingleTypeID", length = 0,isNull = "1")
    private int PromotionSingleTypeID;

	@AxColumn(name ="PromotionPresentVoucherID", length = 0,isNull = "1")
    private int PromotionPresentVoucherID;

	@AxColumn(name ="PromotionSingleVoucherID", length = 0,isNull = "1")
    private int PromotionSingleVoucherID;

	@AxColumn(name ="idSaleOrderDTO", length = 0)
    private int idSaleOrderDTO;

	@AxColumn(name ="SourceVoucherId", length = 0,isNull = "1")
    private int SourceVoucherId;

	@AxColumn(name ="SourceVoucherDetailId", length = 0,isNull = "1")
    private int SourceVoucherDetailId;

	@AxColumn(name ="iddestvouchertype", length = 0,isNull = "1")
    private int iddestvouchertype;

	@AxColumn(name ="idsourcevouchertype", length = 0,isNull = "1")
    private int idsourcevouchertype;

	@AxColumn(name ="deliveryDate", length = 0)
    private Date deliveryDate;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="LatestCost", length = 0)
    private double LatestCost;

	@AxColumn(name ="LatestPOrigTaxPrice", length = 0,isNull = "1")
    private double LatestPOrigTaxPrice;

	@AxColumn(name ="LatestSaleOrigTaxPrice", length = 0,isNull = "1")
    private double LatestSaleOrigTaxPrice;

	@AxColumn(name ="LowestSalePrice", length = 0,isNull = "1")
    private double LowestSalePrice;

	@AxColumn(name ="SingleInvGrossProfit", length = 0)
    private double SingleInvGrossProfit;

	@AxColumn(name ="GrossProfit", length = 0)
    private double GrossProfit;

	@AxColumn(name ="GrossProfitRate", length = 0)
    private double GrossProfitRate;

	@AxColumn(name ="DataSource", length = 0)
    private int DataSource;

	@AxColumn(name ="IsClose", length = 0)
    private int IsClose;

	@AxColumn(name ="IsModifiedPrice", length = 0)
    private int IsModifiedPrice;

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
    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public double getQuantity2(){
        return quantity2;
    }

    public void setQuantity2(double quantity2){
        this.quantity2 = quantity2;
    }
    public double getBaseQuantity(){
        return baseQuantity;
    }

    public void setBaseQuantity(double baseQuantity){
        this.baseQuantity = baseQuantity;
    }
    public double getSubQuantity(){
        return subQuantity;
    }

    public void setSubQuantity(double subQuantity){
        this.subQuantity = subQuantity;
    }
    public String getCompositionQuantity(){
        return compositionQuantity;
    }

    public void setCompositionQuantity(String compositionQuantity){
        this.compositionQuantity = compositionQuantity;
    }
    public double getOrigPrice(){
        return origPrice;
    }

    public void setOrigPrice(double origPrice){
        this.origPrice = origPrice;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getBasePrice(){
        return basePrice;
    }

    public void setBasePrice(double basePrice){
        this.basePrice = basePrice;
    }
    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public double getOrigDiscountPrice(){
        return origDiscountPrice;
    }

    public void setOrigDiscountPrice(double origDiscountPrice){
        this.origDiscountPrice = origDiscountPrice;
    }
    public double getDiscountPrice(){
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice){
        this.discountPrice = discountPrice;
    }
    public double getBaseDiscountPrice(){
        return baseDiscountPrice;
    }

    public void setBaseDiscountPrice(double baseDiscountPrice){
        this.baseDiscountPrice = baseDiscountPrice;
    }
    public double getTaxRate(){
        return taxRate;
    }

    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }
    public double getOrigTaxPrice(){
        return origTaxPrice;
    }

    public void setOrigTaxPrice(double origTaxPrice){
        this.origTaxPrice = origTaxPrice;
    }
    public double getTaxPrice(){
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice){
        this.taxPrice = taxPrice;
    }
    public double getBaseTaxPrice(){
        return baseTaxPrice;
    }

    public void setBaseTaxPrice(double baseTaxPrice){
        this.baseTaxPrice = baseTaxPrice;
    }
    public double getOrigDiscountAmount(){
        return origDiscountAmount;
    }

    public void setOrigDiscountAmount(double origDiscountAmount){
        this.origDiscountAmount = origDiscountAmount;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
    }
    public double getOrigTax(){
        return origTax;
    }

    public void setOrigTax(double origTax){
        this.origTax = origTax;
    }
    public double getTax(){
        return tax;
    }

    public void setTax(double tax){
        this.tax = tax;
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
    public int getIsPresent(){
        return isPresent;
    }

    public void setIsPresent(int isPresent){
        this.isPresent = isPresent;
    }
    public double getManufactureQuantity(){
        return manufactureQuantity;
    }

    public void setManufactureQuantity(double manufactureQuantity){
        this.manufactureQuantity = manufactureQuantity;
    }
    public double getManufactureQuantity2(){
        return manufactureQuantity2;
    }

    public void setManufactureQuantity2(double manufactureQuantity2){
        this.manufactureQuantity2 = manufactureQuantity2;
    }
    public double getPurchaseQuantity(){
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(double purchaseQuantity){
        this.purchaseQuantity = purchaseQuantity;
    }
    public double getPurchaseQuantity2(){
        return purchaseQuantity2;
    }

    public void setPurchaseQuantity2(double purchaseQuantity2){
        this.purchaseQuantity2 = purchaseQuantity2;
    }
    public double getDeliveryQuantity(){
        return deliveryQuantity;
    }

    public void setDeliveryQuantity(double deliveryQuantity){
        this.deliveryQuantity = deliveryQuantity;
    }
    public double getDeliveryQuantity2(){
        return deliveryQuantity2;
    }

    public void setDeliveryQuantity2(double deliveryQuantity2){
        this.deliveryQuantity2 = deliveryQuantity2;
    }
    public double getSaleOutQuantity(){
        return saleOutQuantity;
    }

    public void setSaleOutQuantity(double saleOutQuantity){
        this.saleOutQuantity = saleOutQuantity;
    }
    public double getSaleOutQuantity2(){
        return saleOutQuantity2;
    }

    public void setSaleOutQuantity2(double saleOutQuantity2){
        this.saleOutQuantity2 = saleOutQuantity2;
    }
    public double getExecutedQuantity(){
        return executedQuantity;
    }

    public void setExecutedQuantity(double executedQuantity){
        this.executedQuantity = executedQuantity;
    }
    public double getExecutedQuantity2(){
        return executedQuantity2;
    }

    public void setExecutedQuantity2(double executedQuantity2){
        this.executedQuantity2 = executedQuantity2;
    }
    public double getUnitExchangeRate(){
        return unitExchangeRate;
    }

    public void setUnitExchangeRate(double unitExchangeRate){
        this.unitExchangeRate = unitExchangeRate;
    }
    public double getOrigDiscount(){
        return origDiscount;
    }

    public void setOrigDiscount(double origDiscount){
        this.origDiscount = origDiscount;
    }
    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
    public int getTaxFlag(){
        return taxFlag;
    }

    public void setTaxFlag(int taxFlag){
        this.taxFlag = taxFlag;
    }
    public String getInventoryBarCode(){
        return inventoryBarCode;
    }

    public void setInventoryBarCode(String inventoryBarCode){
        this.inventoryBarCode = inventoryBarCode;
    }
    public String getPartnerInventoryCode(){
        return partnerInventoryCode;
    }

    public void setPartnerInventoryCode(String partnerInventoryCode){
        this.partnerInventoryCode = partnerInventoryCode;
    }
    public String getUpdatedBy(){
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    public String getFreeItem0(){
        return freeItem0;
    }

    public void setFreeItem0(String freeItem0){
        this.freeItem0 = freeItem0;
    }
    public String getFreeItem1(){
        return freeItem1;
    }

    public void setFreeItem1(String freeItem1){
        this.freeItem1 = freeItem1;
    }
    public String getFreeItem2(){
        return freeItem2;
    }

    public void setFreeItem2(String freeItem2){
        this.freeItem2 = freeItem2;
    }
    public String getFreeItem3(){
        return freeItem3;
    }

    public void setFreeItem3(String freeItem3){
        this.freeItem3 = freeItem3;
    }
    public String getFreeItem4(){
        return freeItem4;
    }

    public void setFreeItem4(String freeItem4){
        this.freeItem4 = freeItem4;
    }
    public String getFreeItem5(){
        return freeItem5;
    }

    public void setFreeItem5(String freeItem5){
        this.freeItem5 = freeItem5;
    }
    public String getFreeItem6(){
        return freeItem6;
    }

    public void setFreeItem6(String freeItem6){
        this.freeItem6 = freeItem6;
    }
    public String getFreeItem7(){
        return freeItem7;
    }

    public void setFreeItem7(String freeItem7){
        this.freeItem7 = freeItem7;
    }
    public String getFreeItem8(){
        return freeItem8;
    }

    public void setFreeItem8(String freeItem8){
        this.freeItem8 = freeItem8;
    }
    public String getFreeItem9(){
        return freeItem9;
    }

    public void setFreeItem9(String freeItem9){
        this.freeItem9 = freeItem9;
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
    public String getPartnerInventoryName(){
        return partnerInventoryName;
    }

    public void setPartnerInventoryName(String partnerInventoryName){
        this.partnerInventoryName = partnerInventoryName;
    }
    public int getHasPRA(){
        return HasPRA;
    }

    public void setHasPRA(int HasPRA){
        this.HasPRA = HasPRA;
    }
    public int getPrarequiretimes(){
        return prarequiretimes;
    }

    public void setPrarequiretimes(int prarequiretimes){
        this.prarequiretimes = prarequiretimes;
    }
    public int getHasorderbom(){
        return hasorderbom;
    }

    public void setHasorderbom(int hasorderbom){
        this.hasorderbom = hasorderbom;
    }
    public String getIsnomodify(){
        return isnomodify;
    }

    public void setIsnomodify(String isnomodify){
        this.isnomodify = isnomodify;
    }
    public String getSourceVoucherCode(){
        return SourceVoucherCode;
    }

    public void setSourceVoucherCode(String SourceVoucherCode){
        this.SourceVoucherCode = SourceVoucherCode;
    }
    public String getDetailVoucherState(){
        return detailVoucherState;
    }

    public void setDetailVoucherState(String detailVoucherState){
        this.detailVoucherState = detailVoucherState;
    }
    public double getRetailprice(){
        return Retailprice;
    }

    public void setRetailprice(double Retailprice){
        this.Retailprice = Retailprice;
    }
    public double getDistributionQuantity(){
        return DistributionQuantity;
    }

    public void setDistributionQuantity(double DistributionQuantity){
        this.DistributionQuantity = DistributionQuantity;
    }
    public double getDistributionQuantity2(){
        return DistributionQuantity2;
    }

    public void setDistributionQuantity2(double DistributionQuantity2){
        this.DistributionQuantity2 = DistributionQuantity2;
    }
    public String getPriceStrategyTypeName(){
        return PriceStrategyTypeName;
    }

    public void setPriceStrategyTypeName(String PriceStrategyTypeName){
        this.PriceStrategyTypeName = PriceStrategyTypeName;
    }
    public String getPriceStrategySchemeIds(){
        return PriceStrategySchemeIds;
    }

    public void setPriceStrategySchemeIds(String PriceStrategySchemeIds){
        this.PriceStrategySchemeIds = PriceStrategySchemeIds;
    }
    public String getPriceStrategySchemeNames(){
        return PriceStrategySchemeNames;
    }

    public void setPriceStrategySchemeNames(String PriceStrategySchemeNames){
        this.PriceStrategySchemeNames = PriceStrategySchemeNames;
    }
    public String getPromotionVoucherCodes(){
        return PromotionVoucherCodes;
    }

    public void setPromotionVoucherCodes(String PromotionVoucherCodes){
        this.PromotionVoucherCodes = PromotionVoucherCodes;
    }
    public String getPromotionVoucherIds(){
        return PromotionVoucherIds;
    }

    public void setPromotionVoucherIds(String PromotionVoucherIds){
        this.PromotionVoucherIds = PromotionVoucherIds;
    }
    public int getIsMemberIntegral(){
        return IsMemberIntegral;
    }

    public void setIsMemberIntegral(int IsMemberIntegral){
        this.IsMemberIntegral = IsMemberIntegral;
    }
    public int getIsPromotionPresent(){
        return IsPromotionPresent;
    }

    public void setIsPromotionPresent(int IsPromotionPresent){
        this.IsPromotionPresent = IsPromotionPresent;
    }
    public String getPromotionPresentVoucherCode(){
        return PromotionPresentVoucherCode;
    }

    public void setPromotionPresentVoucherCode(String PromotionPresentVoucherCode){
        this.PromotionPresentVoucherCode = PromotionPresentVoucherCode;
    }
    public String getPromotionSingleVoucherCode(){
        return PromotionSingleVoucherCode;
    }

    public void setPromotionSingleVoucherCode(String PromotionSingleVoucherCode){
        this.PromotionSingleVoucherCode = PromotionSingleVoucherCode;
    }
    public String getPromotionPresentGroupID(){
        return PromotionPresentGroupID;
    }

    public void setPromotionPresentGroupID(String PromotionPresentGroupID){
        this.PromotionPresentGroupID = PromotionPresentGroupID;
    }
    public String getPromotionSingleGroupID(){
        return PromotionSingleGroupID;
    }

    public void setPromotionSingleGroupID(String PromotionSingleGroupID){
        this.PromotionSingleGroupID = PromotionSingleGroupID;
    }
    public String getDetailMemo(){
        return DetailMemo;
    }

    public void setDetailMemo(String DetailMemo){
        this.DetailMemo = DetailMemo;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdbom(){
        return idbom;
    }

    public void setIdbom(int idbom){
        this.idbom = idbom;
    }
    public int getIdinventory(){
        return idinventory;
    }

    public void setIdinventory(int idinventory){
        this.idinventory = idinventory;
    }
    public int getIdproject(){
        return idproject;
    }

    public void setIdproject(int idproject){
        this.idproject = idproject;
    }
    public int getIdbaseunit(){
        return idbaseunit;
    }

    public void setIdbaseunit(int idbaseunit){
        this.idbaseunit = idbaseunit;
    }
    public int getIdsubunit(){
        return idsubunit;
    }

    public void setIdsubunit(int idsubunit){
        this.idsubunit = idsubunit;
    }
    public int getIdunit(){
        return idunit;
    }

    public void setIdunit(int idunit){
        this.idunit = idunit;
    }
    public int getIdunit2(){
        return idunit2;
    }

    public void setIdunit2(int idunit2){
        this.idunit2 = idunit2;
    }
    public int getIdwarehouse(){
        return idwarehouse;
    }

    public void setIdwarehouse(int idwarehouse){
        this.idwarehouse = idwarehouse;
    }
    public int getCashbackWay(){
        return CashbackWay;
    }

    public void setCashbackWay(int CashbackWay){
        this.CashbackWay = CashbackWay;
    }
    public int getPriceStrategyTypeId(){
        return PriceStrategyTypeId;
    }

    public void setPriceStrategyTypeId(int PriceStrategyTypeId){
        this.PriceStrategyTypeId = PriceStrategyTypeId;
    }
    public int getPromotionPresentTypeID(){
        return PromotionPresentTypeID;
    }

    public void setPromotionPresentTypeID(int PromotionPresentTypeID){
        this.PromotionPresentTypeID = PromotionPresentTypeID;
    }
    public int getPromotionSingleTypeID(){
        return PromotionSingleTypeID;
    }

    public void setPromotionSingleTypeID(int PromotionSingleTypeID){
        this.PromotionSingleTypeID = PromotionSingleTypeID;
    }
    public int getPromotionPresentVoucherID(){
        return PromotionPresentVoucherID;
    }

    public void setPromotionPresentVoucherID(int PromotionPresentVoucherID){
        this.PromotionPresentVoucherID = PromotionPresentVoucherID;
    }
    public int getPromotionSingleVoucherID(){
        return PromotionSingleVoucherID;
    }

    public void setPromotionSingleVoucherID(int PromotionSingleVoucherID){
        this.PromotionSingleVoucherID = PromotionSingleVoucherID;
    }
    public int getIdSaleOrderDTO(){
        return idSaleOrderDTO;
    }

    public void setIdSaleOrderDTO(int idSaleOrderDTO){
        this.idSaleOrderDTO = idSaleOrderDTO;
    }
    public int getSourceVoucherId(){
        return SourceVoucherId;
    }

    public void setSourceVoucherId(int SourceVoucherId){
        this.SourceVoucherId = SourceVoucherId;
    }
    public int getSourceVoucherDetailId(){
        return SourceVoucherDetailId;
    }

    public void setSourceVoucherDetailId(int SourceVoucherDetailId){
        this.SourceVoucherDetailId = SourceVoucherDetailId;
    }
    public int getIddestvouchertype(){
        return iddestvouchertype;
    }

    public void setIddestvouchertype(int iddestvouchertype){
        this.iddestvouchertype = iddestvouchertype;
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
    public Date getUpdated(){
        return updated;
    }

    public void setUpdated(Date updated){
        this.updated = updated;
    }
    public double getLatestCost(){
        return LatestCost;
    }

    public void setLatestCost(double LatestCost){
        this.LatestCost = LatestCost;
    }
    public double getLatestPOrigTaxPrice(){
        return LatestPOrigTaxPrice;
    }

    public void setLatestPOrigTaxPrice(double LatestPOrigTaxPrice){
        this.LatestPOrigTaxPrice = LatestPOrigTaxPrice;
    }
    public double getLatestSaleOrigTaxPrice(){
        return LatestSaleOrigTaxPrice;
    }

    public void setLatestSaleOrigTaxPrice(double LatestSaleOrigTaxPrice){
        this.LatestSaleOrigTaxPrice = LatestSaleOrigTaxPrice;
    }
    public double getLowestSalePrice(){
        return LowestSalePrice;
    }

    public void setLowestSalePrice(double LowestSalePrice){
        this.LowestSalePrice = LowestSalePrice;
    }
    public double getSingleInvGrossProfit(){
        return SingleInvGrossProfit;
    }

    public void setSingleInvGrossProfit(double SingleInvGrossProfit){
        this.SingleInvGrossProfit = SingleInvGrossProfit;
    }
    public double getGrossProfit(){
        return GrossProfit;
    }

    public void setGrossProfit(double GrossProfit){
        this.GrossProfit = GrossProfit;
    }
    public double getGrossProfitRate(){
        return GrossProfitRate;
    }

    public void setGrossProfitRate(double GrossProfitRate){
        this.GrossProfitRate = GrossProfitRate;
    }
    public int getDataSource(){
        return DataSource;
    }

    public void setDataSource(int DataSource){
        this.DataSource = DataSource;
    }
    public int getIsClose(){
        return IsClose;
    }

    public void setIsClose(int IsClose){
        this.IsClose = IsClose;
    }
    public int getIsModifiedPrice(){
        return IsModifiedPrice;
    }

    public void setIsModifiedPrice(int IsModifiedPrice){
        this.IsModifiedPrice = IsModifiedPrice;
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
