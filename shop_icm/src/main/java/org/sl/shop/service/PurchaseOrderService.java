package org.sl.shop.service;

import java.util.Date;
import java.util.List;

import org.sl.shop.mapper.PurchaseOrderItemMapper;
import org.sl.shop.mapper.PurchaseOrderMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.model.PurchaseOrderItem;
import org.sl.shop.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;
    @Autowired
    private PurchaseOrderItemMapper purchaseOrderItemMapper;
    @Autowired
    private CommodityService commodityService;
    @Autowired
    private SupplierService supplierService;

    @Transactional(readOnly = true)
    public List<PurchaseOrder> getPurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderMapper.getPurchaseOrder(purchaseOrder);
    }

    @Transactional(readOnly = true)
    public List<PurchaseOrder> getPurchaseOrderAll(PurchaseOrder purchaseOrder) {
        return purchaseOrderMapper.getPurchaseOrderAll(purchaseOrder);
    }

    @Transactional
    public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
        //获取当前时间
        Date date = new Date();
        //设置销售时间
        purchaseOrder.setPoDate(date);
        Supplier supplier = purchaseOrder.getSupplier();
        //获取信息 检查是否完整
        if (null!=supplier){
            if(supplierService.getSupplier(supplier).size()<=0)
                supplierService.addSupplier(supplier);
            purchaseOrder.setSupplier(supplier);
        }
        purchaseOrderMapper.addPurchaseOrder(purchaseOrder);
        int poid = purchaseOrder.getPoid();
        boolean flag = purchaseOrder.getSum()==0?true:false;
        List<PurchaseOrderItem> list = purchaseOrder.getItems();
        double posum = 0;
        if (null != list) {
            for (PurchaseOrderItem item : list) {
                //设置关联与日期
                item.setPoid(poid);
                item.setPuDate(date);
                //获取信息 检查是否完整
                Commodity commodity = item.getComm();
                //假如为空 跳出 虽然不可能
                if(null==commodity)
                    break;
                if(commodityService.getCommodity(commodity).size()<=0){
                    commodityService.addCommodity(commodity);
                }
                double num = item.getNum();
                double sum = item.getSum();
                double uninPrice = (Math.round(sum/num*100)/100.0);
                item.setUnitPrice(uninPrice);
                posum+=sum;
                purchaseOrderItemMapper.addPurchaseOrderItem(item);
            }
            if(flag){
                purchaseOrder.setSum(posum);
                purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
            }
        }

    }

    @Transactional
    public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
        purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
        List<PurchaseOrderItem> list = purchaseOrder.getItems();
        if (null != list) {
            for (PurchaseOrderItem item : list) {
                purchaseOrderItemMapper.updatePurchaseOrderItem(item);
            }
        }
    }

    @Transactional
    public boolean deletePurchaseOrder(PurchaseOrder purchaseOrder) {
        List<PurchaseOrderItem> list = purchaseOrder.getItems();
        if (list != null && list.size() > 0) {
            for (PurchaseOrderItem item : list) {
                purchaseOrderItemMapper.deletePurchaseOrderItem(item);
            }
        }
        purchaseOrderMapper.deletePurchaseOrder(purchaseOrder);
        return true;
    }
}
