
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

@AxTable(name = "AA_Inventory")
public class Inventory {

	private static final long serialVersionUID = -3934201812152312711L;

	private String className;
	private String unitName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @AxColumn(name ="code", length = 32)
    private String code;

	@AxColumn(name ="name", length = 200)
    private String name;

	@AxColumn(name ="shorthand", length = 200)
    private String shorthand;

	@AxColumn(name ="specification", length = 200)
    private String specification;

	@AxColumn(name ="procureBatch", length = 0)
    private String procureBatch;

	@AxColumn(name ="invSCost", length = 0)
    private String invSCost;

	@AxColumn(name ="latestCost_Abandon", length = 0)
    private String latestCostAbandon;

	@AxColumn(name ="avagCost_Abandon", length = 0)
    private String avagCostAbandon;

	@AxColumn(name ="isLimitedWithdraw", length = 0)
    private int isLimitedWithdraw;

	@AxColumn(name ="isBatch", length = 0)
    private int isBatch;

	@AxColumn(name ="isQualityPeriod", length = 0)
    private int isQualityPeriod;

	@AxColumn(name ="isSale", length = 0)
    private int isSale;

	@AxColumn(name ="isMadeSelf", length = 0)
    private int isMadeSelf;

	@AxColumn(name ="isPurchase", length = 0)
    private int isPurchase;

	@AxColumn(name ="isMaterial", length = 0)
    private int isMaterial;

	@AxColumn(name ="lowQuantity", length = 0)
    private String lowQuantity;

	@AxColumn(name ="topQuantity", length = 0)
    private String topQuantity;

	@AxColumn(name ="safeQuantity", length = 0)
    private String safeQuantity;

	@AxColumn(name ="picture", length = 50)
    private String picture;

	@AxColumn(name ="disabled", length = 0)
    private int disabled;

	@AxColumn(name ="isQualityCheck", length = 0)
    private int isQualityCheck;

	@AxColumn(name ="isMadeRequest", length = 0)
    private int isMadeRequest;

	@AxColumn(name ="isSingleUnit", length = 0)
    private int isSingleUnit;


	@AxColumn(name ="updatedBy", length = 32)
    private String updatedBy;

	@AxColumn(name ="Userfreeitem7", length = 0)
    private int Userfreeitem7;

	@AxColumn(name ="Userfreeitem6", length = 0)
    private int Userfreeitem6;

	@AxColumn(name ="Userfreeitem2", length = 0)
    private int Userfreeitem2;

	@AxColumn(name ="Userfreeitem1", length = 0)
    private int Userfreeitem1;

	@AxColumn(name ="Userfreeitem9", length = 0)
    private int Userfreeitem9;

	@AxColumn(name ="Userfreeitem0", length = 0)
    private int Userfreeitem0;

	@AxColumn(name ="Userfreeitem8", length = 0)
    private int Userfreeitem8;

	@AxColumn(name ="Userfreeitem5", length = 0)
    private int Userfreeitem5;

	@AxColumn(name ="Userfreeitem4", length = 0)
    private int Userfreeitem4;

	@AxColumn(name ="Userfreeitem3", length = 0)
    private int Userfreeitem3;

	@AxColumn(name ="MustInputFreeitem7", length = 0)
    private int MustInputFreeitem7;

	@AxColumn(name ="MustInputFreeitem2", length = 0)
    private int MustInputFreeitem2;

	@AxColumn(name ="MustInputFreeitem6", length = 0)
    private int MustInputFreeitem6;

	@AxColumn(name ="MustInputFreeitem3", length = 0)
    private int MustInputFreeitem3;

	@AxColumn(name ="MustInputFreeitem5", length = 0)
    private int MustInputFreeitem5;

	@AxColumn(name ="MustInputFreeitem4", length = 0)
    private int MustInputFreeitem4;

	@AxColumn(name ="MustInputFreeitem9", length = 0)
    private int MustInputFreeitem9;

	@AxColumn(name ="MustInputFreeitem1", length = 0)
    private int MustInputFreeitem1;

	@AxColumn(name ="MustInputFreeitem8", length = 0)
    private int MustInputFreeitem8;

	@AxColumn(name ="MustInputFreeitem0", length = 0)
    private int MustInputFreeitem0;

	@AxColumn(name ="produceBatch", length = 0)
    private String produceBatch;

	@AxColumn(name ="imageFile", length = 500)
    private String imageFile;

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

	@AxColumn(name ="standardturnoverdays", length = 0)
    private String standardturnoverdays;

	@AxColumn(name ="HasEverChanged", length = 32)
    private String HasEverChanged;

	@AxColumn(name ="pickbatch", length = 0)
    private String pickbatch;

	@AxColumn(name ="isphantom", length = 0)
    private int isphantom;

	@AxColumn(name ="ControlRangeFreeitem0", length = 0)
    private int ControlRangeFreeitem0;

	@AxColumn(name ="ControlRangeFreeitem1", length = 0)
    private int ControlRangeFreeitem1;

	@AxColumn(name ="ControlRangeFreeitem2", length = 0)
    private int ControlRangeFreeitem2;

	@AxColumn(name ="ControlRangeFreeitem3", length = 0)
    private int ControlRangeFreeitem3;

	@AxColumn(name ="ControlRangeFreeitem4", length = 0)
    private int ControlRangeFreeitem4;

	@AxColumn(name ="ControlRangeFreeitem5", length = 0)
    private int ControlRangeFreeitem5;

	@AxColumn(name ="ControlRangeFreeitem6", length = 0)
    private int ControlRangeFreeitem6;

	@AxColumn(name ="ControlRangeFreeitem7", length = 0)
    private int ControlRangeFreeitem7;

	@AxColumn(name ="ControlRangeFreeitem8", length = 0)
    private int ControlRangeFreeitem8;

	@AxColumn(name ="ControlRangeFreeitem9", length = 0)
    private int ControlRangeFreeitem9;

	@AxColumn(name ="IsLaborCost", length = 0)
    private int IsLaborCost;

	@AxColumn(name ="BatchRunNumber", length = 0)
    private String BatchRunNumber;

	@AxColumn(name ="IsNew", length = 0)
    private int IsNew;

	@AxColumn(name ="MadeRecordDate", length = 0)
    private Date MadeRecordDate;

	@AxColumn(name ="InventoryDescript", length = 500)
    private String InventoryDescript;

	@AxColumn(name ="ReNewGoodSellDays", length = 0)
    private int ReNewGoodSellDays;

	@AxColumn(name ="ReNewGoodAheadDays", length = 0)
    private int ReNewGoodAheadDays;

	@AxColumn(name ="IsSuite", length = 0)
    private int IsSuite;

	@AxColumn(name ="IsWeigh", length = 0)
    private int IsWeigh;

	@AxColumn(name ="DefaultBarCode", length = 200)
    private String DefaultBarCode;

	@AxColumn(name ="NewProductPeriod", length = 0)
    private int NewProductPeriod;

	@AxColumn(name ="Expired", length = 0)
    private int Expired;

	@AxColumn(name ="idbarcodesolution", length = 0)
    private int idbarcodesolution;

	@AxId
    @AxColumn(name ="id", length = 0)
    private int id;

	@AxColumn(name ="idinventoryclass", length = 0)
    private int idinventoryclass;

	@AxColumn(name ="idinvlocation", length = 0)
    private int idinvlocation;

	@AxColumn(name ="idMarketingOrgan", length = 0)
    private int idMarketingOrgan;

	@AxColumn(name ="idpartner", length = 0)
    private int idpartner;

	@AxColumn(name ="idunit", length = 0)
    private int idunit;

	@AxColumn(name ="idunitbymanufacture", length = 0)
    private int idunitbymanufacture;

	@AxColumn(name ="idUnitByPurchase", length = 0)
    private int idUnitByPurchase;

	@AxColumn(name ="idUnitByRetail", length = 0)
    private int idUnitByRetail;

	@AxColumn(name ="idUnitBySale", length = 0)
    private int idUnitBySale;

	@AxColumn(name ="idUnitByStock", length = 0)
    private int idUnitByStock;

	@AxColumn(name ="idunitgroup", length = 0)
    private int idunitgroup;

	@AxColumn(name ="idSubUnitByReport", length = 0)
    private int idSubUnitByReport;

	@AxColumn(name ="ExpiredUnit", length = 0)
    private int ExpiredUnit;

	@AxColumn(name ="idwarehouse", length = 0)
    private int idwarehouse;

	@AxColumn(name ="customerReplenishmentRule", length = 0)
    private int customerReplenishmentRule;

	@AxColumn(name ="pickbatchmethod", length = 0)
    private int pickbatchmethod;

	@AxColumn(name ="planattribute", length = 0)
    private int planattribute;

	@AxColumn(name ="productInfo", length = 0)
    private int productInfo;

	@AxColumn(name ="storeReplenishmentRule", length = 0)
    private int storeReplenishmentRule;

	@AxColumn(name ="taxRate", length = 0)
    private int taxRate;

	@AxColumn(name ="unittype", length = 0)
    private int unittype;

	@AxColumn(name ="valueType", length = 0)
    private int valueType;

	@AxColumn(name ="madeDate", length = 0)
    private Date madeDate;

	@AxColumn(name ="updated", length = 0)
    private Date updated;

	@AxColumn(name ="createdTime", length = 0)
    private Date createdTime;

	@AxColumn(name ="Creater", length = 200)
    private String Creater;

	@AxColumn(name ="Changer", length = 200)
    private String Changer;

	@AxColumn(name ="Changedate", length = 0)
    private Date Changedate;

	@AxColumn(name ="JinShuiCode", length = 40)
    private String JinShuiCode;

	@AxColumn(name ="IsModifiedCode", length = 0)
    private int IsModifiedCode;

	@AxColumn(name ="WithOutBargain", length = 0)
    private int WithOutBargain;

	@AxColumn(name ="idInventoryFreeItemClass0", length = 0)
    private int idInventoryFreeItemClass0;

	@AxColumn(name ="idInventoryFreeItemClass1", length = 0)
    private int idInventoryFreeItemClass1;

	@AxColumn(name ="idInventoryFreeItemClass2", length = 0)
    private int idInventoryFreeItemClass2;

	@AxColumn(name ="idInventoryFreeItemClass3", length = 0)
    private int idInventoryFreeItemClass3;

	@AxColumn(name ="idInventoryFreeItemClass4", length = 0)
    private int idInventoryFreeItemClass4;

	@AxColumn(name ="idInventoryFreeItemClass5", length = 0)
    private int idInventoryFreeItemClass5;

	@AxColumn(name ="idInventoryFreeItemClass6", length = 0)
    private int idInventoryFreeItemClass6;

	@AxColumn(name ="idInventoryFreeItemClass7", length = 0)
    private int idInventoryFreeItemClass7;

	@AxColumn(name ="idInventoryFreeItemClass8", length = 0)
    private int idInventoryFreeItemClass8;

	@AxColumn(name ="idInventoryFreeItemClass9", length = 0)
    private int idInventoryFreeItemClass9;

	@AxColumn(name ="InStorageUpLimit", length = 0)
    private String InStorageUpLimit;

	@AxColumn(name ="OutStorageUpLimit", length = 0)
    private String OutStorageUpLimit;

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
    public String getShorthand(){
        return shorthand;
    }

    public void setShorthand(String shorthand){
        this.shorthand = shorthand;
    }
    public String getSpecification(){
        return specification;
    }

    public void setSpecification(String specification){
        this.specification = specification;
    }
    public String getProcureBatch(){
        return procureBatch;
    }

    public void setProcureBatch(String procureBatch){
        this.procureBatch = procureBatch;
    }
    public String getInvSCost(){
        return invSCost;
    }

    public void setInvSCost(String invSCost){
        this.invSCost = invSCost;
    }
    public String getLatestCostAbandon(){
        return latestCostAbandon;
    }

    public void setLatestCostAbandon(String latestCostAbandon){
        this.latestCostAbandon = latestCostAbandon;
    }
    public String getAvagCostAbandon(){
        return avagCostAbandon;
    }

    public void setAvagCostAbandon(String avagCostAbandon){
        this.avagCostAbandon = avagCostAbandon;
    }
    public int getIsLimitedWithdraw(){
        return isLimitedWithdraw;
    }

    public void setIsLimitedWithdraw(int isLimitedWithdraw){
        this.isLimitedWithdraw = isLimitedWithdraw;
    }
    public int getIsBatch(){
        return isBatch;
    }

    public void setIsBatch(int isBatch){
        this.isBatch = isBatch;
    }
    public int getIsQualityPeriod(){
        return isQualityPeriod;
    }

    public void setIsQualityPeriod(int isQualityPeriod){
        this.isQualityPeriod = isQualityPeriod;
    }
    public int getIsSale(){
        return isSale;
    }

    public void setIsSale(int isSale){
        this.isSale = isSale;
    }
    public int getIsMadeSelf(){
        return isMadeSelf;
    }

    public void setIsMadeSelf(int isMadeSelf){
        this.isMadeSelf = isMadeSelf;
    }
    public int getIsPurchase(){
        return isPurchase;
    }

    public void setIsPurchase(int isPurchase){
        this.isPurchase = isPurchase;
    }
    public int getIsMaterial(){
        return isMaterial;
    }

    public void setIsMaterial(int isMaterial){
        this.isMaterial = isMaterial;
    }
    public String getLowQuantity(){
        return lowQuantity;
    }

    public void setLowQuantity(String lowQuantity){
        this.lowQuantity = lowQuantity;
    }
    public String getTopQuantity(){
        return topQuantity;
    }

    public void setTopQuantity(String topQuantity){
        this.topQuantity = topQuantity;
    }
    public String getSafeQuantity(){
        return safeQuantity;
    }

    public void setSafeQuantity(String safeQuantity){
        this.safeQuantity = safeQuantity;
    }
    public String getPicture(){
        return picture;
    }

    public void setPicture(String picture){
        this.picture = picture;
    }
    public int getDisabled(){
        return disabled;
    }

    public void setDisabled(int disabled){
        this.disabled = disabled;
    }
    public int getIsQualityCheck(){
        return isQualityCheck;
    }

    public void setIsQualityCheck(int isQualityCheck){
        this.isQualityCheck = isQualityCheck;
    }
    public int getIsMadeRequest(){
        return isMadeRequest;
    }

    public void setIsMadeRequest(int isMadeRequest){
        this.isMadeRequest = isMadeRequest;
    }
    public int getIsSingleUnit(){
        return isSingleUnit;
    }

    public void setIsSingleUnit(int isSingleUnit){
        this.isSingleUnit = isSingleUnit;
    }
    public String getUpdatedBy(){
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    public int getUserfreeitem7(){
        return Userfreeitem7;
    }

    public void setUserfreeitem7(int Userfreeitem7){
        this.Userfreeitem7 = Userfreeitem7;
    }
    public int getUserfreeitem6(){
        return Userfreeitem6;
    }

    public void setUserfreeitem6(int Userfreeitem6){
        this.Userfreeitem6 = Userfreeitem6;
    }
    public int getUserfreeitem2(){
        return Userfreeitem2;
    }

    public void setUserfreeitem2(int Userfreeitem2){
        this.Userfreeitem2 = Userfreeitem2;
    }
    public int getUserfreeitem1(){
        return Userfreeitem1;
    }

    public void setUserfreeitem1(int Userfreeitem1){
        this.Userfreeitem1 = Userfreeitem1;
    }
    public int getUserfreeitem9(){
        return Userfreeitem9;
    }

    public void setUserfreeitem9(int Userfreeitem9){
        this.Userfreeitem9 = Userfreeitem9;
    }
    public int getUserfreeitem0(){
        return Userfreeitem0;
    }

    public void setUserfreeitem0(int Userfreeitem0){
        this.Userfreeitem0 = Userfreeitem0;
    }
    public int getUserfreeitem8(){
        return Userfreeitem8;
    }

    public void setUserfreeitem8(int Userfreeitem8){
        this.Userfreeitem8 = Userfreeitem8;
    }
    public int getUserfreeitem5(){
        return Userfreeitem5;
    }

    public void setUserfreeitem5(int Userfreeitem5){
        this.Userfreeitem5 = Userfreeitem5;
    }
    public int getUserfreeitem4(){
        return Userfreeitem4;
    }

    public void setUserfreeitem4(int Userfreeitem4){
        this.Userfreeitem4 = Userfreeitem4;
    }
    public int getUserfreeitem3(){
        return Userfreeitem3;
    }

    public void setUserfreeitem3(int Userfreeitem3){
        this.Userfreeitem3 = Userfreeitem3;
    }
    public int getMustInputFreeitem7(){
        return MustInputFreeitem7;
    }

    public void setMustInputFreeitem7(int MustInputFreeitem7){
        this.MustInputFreeitem7 = MustInputFreeitem7;
    }
    public int getMustInputFreeitem2(){
        return MustInputFreeitem2;
    }

    public void setMustInputFreeitem2(int MustInputFreeitem2){
        this.MustInputFreeitem2 = MustInputFreeitem2;
    }
    public int getMustInputFreeitem6(){
        return MustInputFreeitem6;
    }

    public void setMustInputFreeitem6(int MustInputFreeitem6){
        this.MustInputFreeitem6 = MustInputFreeitem6;
    }
    public int getMustInputFreeitem3(){
        return MustInputFreeitem3;
    }

    public void setMustInputFreeitem3(int MustInputFreeitem3){
        this.MustInputFreeitem3 = MustInputFreeitem3;
    }
    public int getMustInputFreeitem5(){
        return MustInputFreeitem5;
    }

    public void setMustInputFreeitem5(int MustInputFreeitem5){
        this.MustInputFreeitem5 = MustInputFreeitem5;
    }
    public int getMustInputFreeitem4(){
        return MustInputFreeitem4;
    }

    public void setMustInputFreeitem4(int MustInputFreeitem4){
        this.MustInputFreeitem4 = MustInputFreeitem4;
    }
    public int getMustInputFreeitem9(){
        return MustInputFreeitem9;
    }

    public void setMustInputFreeitem9(int MustInputFreeitem9){
        this.MustInputFreeitem9 = MustInputFreeitem9;
    }
    public int getMustInputFreeitem1(){
        return MustInputFreeitem1;
    }

    public void setMustInputFreeitem1(int MustInputFreeitem1){
        this.MustInputFreeitem1 = MustInputFreeitem1;
    }
    public int getMustInputFreeitem8(){
        return MustInputFreeitem8;
    }

    public void setMustInputFreeitem8(int MustInputFreeitem8){
        this.MustInputFreeitem8 = MustInputFreeitem8;
    }
    public int getMustInputFreeitem0(){
        return MustInputFreeitem0;
    }

    public void setMustInputFreeitem0(int MustInputFreeitem0){
        this.MustInputFreeitem0 = MustInputFreeitem0;
    }
    public String getProduceBatch(){
        return produceBatch;
    }

    public void setProduceBatch(String produceBatch){
        this.produceBatch = produceBatch;
    }
    public String getImageFile(){
        return imageFile;
    }

    public void setImageFile(String imageFile){
        this.imageFile = imageFile;
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
    public String getStandardturnoverdays(){
        return standardturnoverdays;
    }

    public void setStandardturnoverdays(String standardturnoverdays){
        this.standardturnoverdays = standardturnoverdays;
    }
    public String getHasEverChanged(){
        return HasEverChanged;
    }

    public void setHasEverChanged(String HasEverChanged){
        this.HasEverChanged = HasEverChanged;
    }
    public String getPickbatch(){
        return pickbatch;
    }

    public void setPickbatch(String pickbatch){
        this.pickbatch = pickbatch;
    }
    public int getIsphantom(){
        return isphantom;
    }

    public void setIsphantom(int isphantom){
        this.isphantom = isphantom;
    }
    public int getControlRangeFreeitem0(){
        return ControlRangeFreeitem0;
    }

    public void setControlRangeFreeitem0(int ControlRangeFreeitem0){
        this.ControlRangeFreeitem0 = ControlRangeFreeitem0;
    }
    public int getControlRangeFreeitem1(){
        return ControlRangeFreeitem1;
    }

    public void setControlRangeFreeitem1(int ControlRangeFreeitem1){
        this.ControlRangeFreeitem1 = ControlRangeFreeitem1;
    }
    public int getControlRangeFreeitem2(){
        return ControlRangeFreeitem2;
    }

    public void setControlRangeFreeitem2(int ControlRangeFreeitem2){
        this.ControlRangeFreeitem2 = ControlRangeFreeitem2;
    }
    public int getControlRangeFreeitem3(){
        return ControlRangeFreeitem3;
    }

    public void setControlRangeFreeitem3(int ControlRangeFreeitem3){
        this.ControlRangeFreeitem3 = ControlRangeFreeitem3;
    }
    public int getControlRangeFreeitem4(){
        return ControlRangeFreeitem4;
    }

    public void setControlRangeFreeitem4(int ControlRangeFreeitem4){
        this.ControlRangeFreeitem4 = ControlRangeFreeitem4;
    }
    public int getControlRangeFreeitem5(){
        return ControlRangeFreeitem5;
    }

    public void setControlRangeFreeitem5(int ControlRangeFreeitem5){
        this.ControlRangeFreeitem5 = ControlRangeFreeitem5;
    }
    public int getControlRangeFreeitem6(){
        return ControlRangeFreeitem6;
    }

    public void setControlRangeFreeitem6(int ControlRangeFreeitem6){
        this.ControlRangeFreeitem6 = ControlRangeFreeitem6;
    }
    public int getControlRangeFreeitem7(){
        return ControlRangeFreeitem7;
    }

    public void setControlRangeFreeitem7(int ControlRangeFreeitem7){
        this.ControlRangeFreeitem7 = ControlRangeFreeitem7;
    }
    public int getControlRangeFreeitem8(){
        return ControlRangeFreeitem8;
    }

    public void setControlRangeFreeitem8(int ControlRangeFreeitem8){
        this.ControlRangeFreeitem8 = ControlRangeFreeitem8;
    }
    public int getControlRangeFreeitem9(){
        return ControlRangeFreeitem9;
    }

    public void setControlRangeFreeitem9(int ControlRangeFreeitem9){
        this.ControlRangeFreeitem9 = ControlRangeFreeitem9;
    }
    public int getIsLaborCost(){
        return IsLaborCost;
    }

    public void setIsLaborCost(int IsLaborCost){
        this.IsLaborCost = IsLaborCost;
    }
    public String getBatchRunNumber(){
        return BatchRunNumber;
    }

    public void setBatchRunNumber(String BatchRunNumber){
        this.BatchRunNumber = BatchRunNumber;
    }
    public int getIsNew(){
        return IsNew;
    }

    public void setIsNew(int IsNew){
        this.IsNew = IsNew;
    }
    public Date getMadeRecordDate(){
        return MadeRecordDate;
    }

    public void setMadeRecordDate(Date MadeRecordDate){
        this.MadeRecordDate = MadeRecordDate;
    }
    public String getInventoryDescript(){
        return InventoryDescript;
    }

    public void setInventoryDescript(String InventoryDescript){
        this.InventoryDescript = InventoryDescript;
    }
    public int getReNewGoodSellDays(){
        return ReNewGoodSellDays;
    }

    public void setReNewGoodSellDays(int ReNewGoodSellDays){
        this.ReNewGoodSellDays = ReNewGoodSellDays;
    }
    public int getReNewGoodAheadDays(){
        return ReNewGoodAheadDays;
    }

    public void setReNewGoodAheadDays(int ReNewGoodAheadDays){
        this.ReNewGoodAheadDays = ReNewGoodAheadDays;
    }
    public int getIsSuite(){
        return IsSuite;
    }

    public void setIsSuite(int IsSuite){
        this.IsSuite = IsSuite;
    }
    public int getIsWeigh(){
        return IsWeigh;
    }

    public void setIsWeigh(int IsWeigh){
        this.IsWeigh = IsWeigh;
    }
    public String getDefaultBarCode(){
        return DefaultBarCode;
    }

    public void setDefaultBarCode(String DefaultBarCode){
        this.DefaultBarCode = DefaultBarCode;
    }
    public int getNewProductPeriod(){
        return NewProductPeriod;
    }

    public void setNewProductPeriod(int NewProductPeriod){
        this.NewProductPeriod = NewProductPeriod;
    }
    public int getExpired(){
        return Expired;
    }

    public void setExpired(int Expired){
        this.Expired = Expired;
    }
    public int getIdbarcodesolution(){
        return idbarcodesolution;
    }

    public void setIdbarcodesolution(int idbarcodesolution){
        this.idbarcodesolution = idbarcodesolution;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getIdinventoryclass(){
        return idinventoryclass;
    }

    public void setIdinventoryclass(int idinventoryclass){
        this.idinventoryclass = idinventoryclass;
    }
    public int getIdinvlocation(){
        return idinvlocation;
    }

    public void setIdinvlocation(int idinvlocation){
        this.idinvlocation = idinvlocation;
    }
    public int getIdMarketingOrgan(){
        return idMarketingOrgan;
    }

    public void setIdMarketingOrgan(int idMarketingOrgan){
        this.idMarketingOrgan = idMarketingOrgan;
    }
    public int getIdpartner(){
        return idpartner;
    }

    public void setIdpartner(int idpartner){
        this.idpartner = idpartner;
    }
    public int getIdunit(){
        return idunit;
    }

    public void setIdunit(int idunit){
        this.idunit = idunit;
    }
    public int getIdunitbymanufacture(){
        return idunitbymanufacture;
    }

    public void setIdunitbymanufacture(int idunitbymanufacture){
        this.idunitbymanufacture = idunitbymanufacture;
    }
    public int getIdUnitByPurchase(){
        return idUnitByPurchase;
    }

    public void setIdUnitByPurchase(int idUnitByPurchase){
        this.idUnitByPurchase = idUnitByPurchase;
    }
    public int getIdUnitByRetail(){
        return idUnitByRetail;
    }

    public void setIdUnitByRetail(int idUnitByRetail){
        this.idUnitByRetail = idUnitByRetail;
    }
    public int getIdUnitBySale(){
        return idUnitBySale;
    }

    public void setIdUnitBySale(int idUnitBySale){
        this.idUnitBySale = idUnitBySale;
    }
    public int getIdUnitByStock(){
        return idUnitByStock;
    }

    public void setIdUnitByStock(int idUnitByStock){
        this.idUnitByStock = idUnitByStock;
    }
    public int getIdunitgroup(){
        return idunitgroup;
    }

    public void setIdunitgroup(int idunitgroup){
        this.idunitgroup = idunitgroup;
    }
    public int getIdSubUnitByReport(){
        return idSubUnitByReport;
    }

    public void setIdSubUnitByReport(int idSubUnitByReport){
        this.idSubUnitByReport = idSubUnitByReport;
    }
    public int getExpiredUnit(){
        return ExpiredUnit;
    }

    public void setExpiredUnit(int ExpiredUnit){
        this.ExpiredUnit = ExpiredUnit;
    }
    public int getIdwarehouse(){
        return idwarehouse;
    }

    public void setIdwarehouse(int idwarehouse){
        this.idwarehouse = idwarehouse;
    }
    public int getCustomerReplenishmentRule(){
        return customerReplenishmentRule;
    }

    public void setCustomerReplenishmentRule(int customerReplenishmentRule){
        this.customerReplenishmentRule = customerReplenishmentRule;
    }
    public int getPickbatchmethod(){
        return pickbatchmethod;
    }

    public void setPickbatchmethod(int pickbatchmethod){
        this.pickbatchmethod = pickbatchmethod;
    }
    public int getPlanattribute(){
        return planattribute;
    }

    public void setPlanattribute(int planattribute){
        this.planattribute = planattribute;
    }
    public int getProductInfo(){
        return productInfo;
    }

    public void setProductInfo(int productInfo){
        this.productInfo = productInfo;
    }
    public int getStoreReplenishmentRule(){
        return storeReplenishmentRule;
    }

    public void setStoreReplenishmentRule(int storeReplenishmentRule){
        this.storeReplenishmentRule = storeReplenishmentRule;
    }
    public int getTaxRate(){
        return taxRate;
    }

    public void setTaxRate(int taxRate){
        this.taxRate = taxRate;
    }
    public int getUnittype(){
        return unittype;
    }

    public void setUnittype(int unittype){
        this.unittype = unittype;
    }
    public int getValueType(){
        return valueType;
    }

    public void setValueType(int valueType){
        this.valueType = valueType;
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
    public String getJinShuiCode(){
        return JinShuiCode;
    }

    public void setJinShuiCode(String JinShuiCode){
        this.JinShuiCode = JinShuiCode;
    }
    public int getIsModifiedCode(){
        return IsModifiedCode;
    }

    public void setIsModifiedCode(int IsModifiedCode){
        this.IsModifiedCode = IsModifiedCode;
    }
    public int getWithOutBargain(){
        return WithOutBargain;
    }

    public void setWithOutBargain(int WithOutBargain){
        this.WithOutBargain = WithOutBargain;
    }
    public int getIdInventoryFreeItemClass0(){
        return idInventoryFreeItemClass0;
    }

    public void setIdInventoryFreeItemClass0(int idInventoryFreeItemClass0){
        this.idInventoryFreeItemClass0 = idInventoryFreeItemClass0;
    }
    public int getIdInventoryFreeItemClass1(){
        return idInventoryFreeItemClass1;
    }

    public void setIdInventoryFreeItemClass1(int idInventoryFreeItemClass1){
        this.idInventoryFreeItemClass1 = idInventoryFreeItemClass1;
    }
    public int getIdInventoryFreeItemClass2(){
        return idInventoryFreeItemClass2;
    }

    public void setIdInventoryFreeItemClass2(int idInventoryFreeItemClass2){
        this.idInventoryFreeItemClass2 = idInventoryFreeItemClass2;
    }
    public int getIdInventoryFreeItemClass3(){
        return idInventoryFreeItemClass3;
    }

    public void setIdInventoryFreeItemClass3(int idInventoryFreeItemClass3){
        this.idInventoryFreeItemClass3 = idInventoryFreeItemClass3;
    }
    public int getIdInventoryFreeItemClass4(){
        return idInventoryFreeItemClass4;
    }

    public void setIdInventoryFreeItemClass4(int idInventoryFreeItemClass4){
        this.idInventoryFreeItemClass4 = idInventoryFreeItemClass4;
    }
    public int getIdInventoryFreeItemClass5(){
        return idInventoryFreeItemClass5;
    }

    public void setIdInventoryFreeItemClass5(int idInventoryFreeItemClass5){
        this.idInventoryFreeItemClass5 = idInventoryFreeItemClass5;
    }
    public int getIdInventoryFreeItemClass6(){
        return idInventoryFreeItemClass6;
    }

    public void setIdInventoryFreeItemClass6(int idInventoryFreeItemClass6){
        this.idInventoryFreeItemClass6 = idInventoryFreeItemClass6;
    }
    public int getIdInventoryFreeItemClass7(){
        return idInventoryFreeItemClass7;
    }

    public void setIdInventoryFreeItemClass7(int idInventoryFreeItemClass7){
        this.idInventoryFreeItemClass7 = idInventoryFreeItemClass7;
    }
    public int getIdInventoryFreeItemClass8(){
        return idInventoryFreeItemClass8;
    }

    public void setIdInventoryFreeItemClass8(int idInventoryFreeItemClass8){
        this.idInventoryFreeItemClass8 = idInventoryFreeItemClass8;
    }
    public int getIdInventoryFreeItemClass9(){
        return idInventoryFreeItemClass9;
    }

    public void setIdInventoryFreeItemClass9(int idInventoryFreeItemClass9){
        this.idInventoryFreeItemClass9 = idInventoryFreeItemClass9;
    }
    public String getInStorageUpLimit(){
        return InStorageUpLimit;
    }

    public void setInStorageUpLimit(String InStorageUpLimit){
        this.InStorageUpLimit = InStorageUpLimit;
    }
    public String getOutStorageUpLimit(){
        return OutStorageUpLimit;
    }

    public void setOutStorageUpLimit(String OutStorageUpLimit){
        this.OutStorageUpLimit = OutStorageUpLimit;
    }
    public int getAutoGenProject(){
        return AutoGenProject;
    }

    public void setAutoGenProject(int AutoGenProject){
        this.AutoGenProject = AutoGenProject;
    }
}
