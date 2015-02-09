package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.PurchaseOrderItemMapper;
import org.sl.shop.mapper.PurchaseOrderMapper;
import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.model.PurchaseOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseOrderService {
    @Autowired
    public PurchaseOrderMapper purchaseOrderMapper;
    @Autowired
    public PurchaseOrderItemMapper purchaseOrderItemMapper;

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
        List<PurchaseOrderItem> list = purchaseOrder.getItems();
        if (null != list) {
            for (PurchaseOrderItem item : list) {
                purchaseOrderItemMapper.addPurchaseOrderItem(item);
            }
        }
        purchaseOrderMapper.addPurchaseOrder(purchaseOrder);
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
