package com.zx.service;

import com.zx.dao.*;
import com.zx.po.mysql.Customer;
import com.zx.po.mysql.Order;
import com.zx.po.mysql.OrderDetail;
import com.zx.po.mysql.Product;
import com.zx.po.sqlserver.*;
import com.zx.tools.common.StringUtil;
import org.springframework.stereotype.Service;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderDetailMapper orderDetailMapper;
    @Resource
    private SaleOrderMapper saleOrderMapper;
    @Resource
    private SaleOrderBMapper saleOrderBMapper;
    @Resource
    private AxLogMapper axLogMapper;
    @Resource
    private PartnerMapper partnerMapper;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private InventoryMapper inventoryMapper;

    @Resource
    private UnitMapper unitMapper;

    public  List<Map<String,Object>> updateOrder(){
        DataSourceTypeManager.set(DataSources.SLAVE);

        String sql ="  select a.* from b_order a where  a.code <> '0'and a.status = '已审核'and not exists(\n" +
                "    select 1  from ax_log b where voucher_type = '04'  and ( success = '1' or (success ='0' and cnt <  3))\n" +
                "    and b.voucher_code = a.code  \n" +
                "    )";
        List<Order> listOrder = orderMapper.selectSql(sql);
        List<Map<String,Object>> listNew = new ArrayList<Map<String,Object>>();
        for(Order order:listOrder){
            Map<String,Object> map = new HashMap<String,Object>();

            map.put("m",order);
            String sqldetal = "select * from b_order_detail where pid = "+ order.getId();
            List<OrderDetail> listOrderDetail = orderDetailMapper.selectSql(sqldetal);
            List<OrderDetail> listOrderDetailNew =  new ArrayList<OrderDetail>() {    };
            for(OrderDetail orderDetail:listOrderDetail){
                int proId = orderDetail.getId();
                String prosql = "select * from b_product where id = "+proId;
                Product product = productMapper.selectSql(prosql).get(0);
                orderDetail.setProductCode(product.getCode());

            }

            map.put("d",listOrderDetail);

            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("04");
            axLog.setVoucherCode(order.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
            listNew.add(map);
        }
        return listNew;
    }
    public boolean updateSaleOrder(List<Map<String,Object>> lists){
        System.out.println("===========================3");
        DataSourceTypeManager.set(DataSources.MASTER);
        for(Map<String,Object> m :lists){
            Order order = (Order)m.get("m");
            SaleOrder saleOrder = new SaleOrder();
            saleOrder.setCode(order.getCode());
            //取客户编码
            int idPartner = 0;
            String sql = "select * from aa_partner where name = '"+order.getCus_name()+"'";
            Partner  partner = partnerMapper.selectSql(sql).get(0);
            saleOrder.setIdcustomer(partner.getId());
            saleOrder.setIdsettlecustomer(partner.getId());
            saleOrder.setVoucherdate(order.getCreate_time());
           /* saleOrder.setAuditor("demo");*/
            saleOrder.setMaker("demo");
            saleOrder.setIdcurrency(4);
            saleOrder.setIddepartment(7);
            saleOrder.setIdmarketingOrgan(1);
            saleOrder.setCreatedtime(order.getCreate_time());
            saleOrder.setExchangeRate(1);
            saleOrder.setIdbusinesstype(65);
            saleOrder.setDataSource(1531);
            saleOrder.setIdwarehouse(1);
            saleOrder.setDiscountRate(1);
            //  收货地址
            saleOrder.setAddress(order.getReceive_address());
            //  联系电话
            saleOrder.setContactPhone(order.getReceive_phone());
            //  联系人
            saleOrder.setLinkMan(order.getReceive_name());
            //单据备注
            saleOrder.setMemo(order.getRemark());
            //  备注结算方式
            saleOrder.setPubuserdefnvc1(order.getTel());
            //  销售员  转  业务员不带（和分管部门有关，通过档案完成）


            saleOrderMapper.insert(saleOrder);
            List<OrderDetail> list = ( List<OrderDetail>)m.get("d");
            int i = 0;
            for(OrderDetail orderDetail:list){
                SaleOrderB saleOrderB = new SaleOrderB();
                String code = String.format("%0"+4+"d", i);
                saleOrderB.setCode(code);
                saleOrderB.setQuantity(orderDetail.getQuantity());
               // saleOrderB.setPrice(orderDetail.getPrice());
                //saleOrderB.setOrigPrice(orderDetail.getPrice());
                saleOrderB.setOrigTaxPrice(orderDetail.getPrice());
                saleOrderB.setOrigTaxAmount(orderDetail.getTotal());
                saleOrderB.setTaxAmount(orderDetail.getTotal());
                saleOrderB.setTax(0);
                saleOrderB.setDiscountRate(1);
                saleOrderB.setDiscountPrice(orderDetail.getPrice());
                saleOrderB.setUnitExchangeRate(1);
                saleOrderB.setBaseQuantity(orderDetail.getQuantity());
                saleOrderB.setOrigDiscountPrice(orderDetail.getPrice());
                saleOrderB.setOrigPrice(orderDetail.getPrice());
                saleOrderB.setTaxPrice(orderDetail.getPrice());
                saleOrderB.setOrigDiscountAmount(orderDetail.getTotal());
                saleOrderB.setDiscountAmount(orderDetail.getTotal());
               // saleOrderB.setOrigTax(0);
                saleOrderB.setTax(0);
                saleOrderB.setTaxFlag(1);
                //  税率
                if(!isEmpty(orderDetail.getSpec())){
                    saleOrderB.setTaxRate(Double.valueOf(orderDetail.getSpec())/100);
                }else{

                }
                //备注
                saleOrderB.setDetailMemo(orderDetail.getRemark());
                //   客户存货编码
                saleOrderB.setPriuserdefnvc1(orderDetail.getKccode());


                saleOrderB.setDataSource(1531);



                String sqlUnit = "select * from aa_unit where name = '"+orderDetail.getUnit()+"'";
                Unit unit = unitMapper.selectSql(sqlUnit).get(0);
                sqlUnit = "select * from aa_inventory where code = '"+orderDetail.getProductCode()+"'";
                Inventory inventory  = inventoryMapper.selectSql(sqlUnit).get(0);
                saleOrderB.setIdunit(unit.getId());
                saleOrderB.setIdbaseunit(unit.getId());
                saleOrderB.setIdinventory(inventory.getId());
                saleOrderB.setIdSaleOrderDTO(saleOrder.getId());

                i++;
                saleOrderBMapper.insert(saleOrderB);
            }
            AxLog axLog  = new AxLog();
            axLog.setCnt(1);
            axLog.setSuccess("1");
            axLog.setVoucherType("04");
            axLog.setVoucherCode(order.getCode());
            axLog.setOperateTime(new Date());
            axLogMapper.insert(axLog);
        }
        return true;
    }
    public boolean  isEmpty(String str){

        if(str == null || str.equals(" ")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String  a= String.format("%0"+4+"d", 0);
        System.out.println(a);
    }
}
