package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.PurchaseOrderItem;

public interface PurchaseOrderItemMapper {
	public boolean addPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem);

	public int updatePurchaseOrderItem(PurchaseOrderItem purchaseOrderItem);

	public boolean deletePurchaseOrderItem(PurchaseOrderItem purchaseOrderItem);

	public List<PurchaseOrderItem> getPurchaseOrderItem(
			PurchaseOrderItem purchaseOrderItem);
}
