package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.PurchaseOrder;

public interface PurchaseOrderMapper {
	public boolean addPurchaseOrder(PurchaseOrder purchaseOrder);

	public int updatePurchaseOrder(PurchaseOrder purchaseOrder);

	public boolean deletePurchaseOrder(PurchaseOrder purchaseOrder);

	public List<PurchaseOrder> getPurchaseOrder(PurchaseOrder purchaseOrder);

	public List<PurchaseOrder> getPurchaseOrderAll(PurchaseOrder purchaseOrder);
}
