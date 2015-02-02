package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.PurchaseOrderItemMapper;
import org.sl.shop.mapper.PurchaseOrderMapper;
import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.model.PurchaseOrderItem;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {
	public PurchaseOrderMapper purchaseOrderMapper;
	public PurchaseOrderItemMapper purchaseOrderItemMapper;

	public List<PurchaseOrder> getPurchaseOrder(PurchaseOrder purchaseOrder) {
		return purchaseOrderMapper.getPurchaseOrder(purchaseOrder);
	}

	public List<PurchaseOrder> getPurchaseOrderAll(PurchaseOrder purchaseOrder) {
		return purchaseOrderMapper.getPurchaseOrderAll(purchaseOrder);
	}

	public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.addPurchaseOrder(purchaseOrder);
		List<PurchaseOrderItem> list = purchaseOrder.getItems();
		if (null != list) {
			for (PurchaseOrderItem item : list) {
				purchaseOrderItemMapper.addPurchaseOrderItem(item);
			}
		}
	}

	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		purchaseOrderMapper.updatePurchaseOrder(purchaseOrder);
		List<PurchaseOrderItem> list = purchaseOrder.getItems();
		if (null != list) {
			for (PurchaseOrderItem item : list) {
				purchaseOrderItemMapper.updatePurchaseOrderItem(item);
			}
		}
	}
}
