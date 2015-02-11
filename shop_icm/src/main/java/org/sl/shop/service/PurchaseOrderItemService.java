package org.sl.shop.service;

import org.sl.shop.mapper.PurchaseOrderItemMapper;
import org.sl.shop.model.PurchaseOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PurchaseOrderItemService {

    @Autowired
    public PurchaseOrderItemMapper purchaseOrderItemMapper;

    @Transactional(readOnly = true)
    public List<PurchaseOrderItem> getPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem){
        return purchaseOrderItemMapper.getPurchaseOrderItem(purchaseOrderItem);
    }

    @Transactional
    public void addPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem){
        purchaseOrderItemMapper.addPurchaseOrderItem(purchaseOrderItem);
    }

    @Transactional
    public void updatePurchaseOrderItem(PurchaseOrderItem purchaseOrderItem){
        purchaseOrderItemMapper.updatePurchaseOrderItem(purchaseOrderItem);
    }

    @Transactional
    public boolean deletePurchaseOrderItem(PurchaseOrderItem purchaseOrderItem){
        purchaseOrderItemMapper.deletePurchaseOrderItem(purchaseOrderItem);
        return true;
    }
}
