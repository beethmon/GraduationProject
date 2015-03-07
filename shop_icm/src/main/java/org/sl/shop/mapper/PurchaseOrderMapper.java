package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.PurchaseOrder;

public interface PurchaseOrderMapper {
	public int addPurchaseOrder(PurchaseOrder purchaseOrder);

	public int updatePurchaseOrder(PurchaseOrder purchaseOrder);

	public int deletePurchaseOrder(PurchaseOrder purchaseOrder);

	public List<PurchaseOrder> getPurchaseOrder(PurchaseOrder purchaseOrder);

	public List<PurchaseOrder> getPurchaseOrderAll(PurchaseOrder purchaseOrder);
}
