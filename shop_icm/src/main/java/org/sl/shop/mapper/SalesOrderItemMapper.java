package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.SalesOrderItem;

public interface SalesOrderItemMapper {
	public boolean addSalesOrderItem(SalesOrderItem SalesOrderItem);

	public int updateSalesOrderItem(SalesOrderItem SalesOrderItem);

	public boolean deleteSalesOrderItem(SalesOrderItem SalesOrderItem);

	public List<SalesOrderItem> getSalesOrderItem(SalesOrderItem SalesOrderItem);
}
