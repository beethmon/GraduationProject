package org.sl.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.sl.shop.model.SalesOrderItem;

public interface SalesOrderItemMapper {
	public int addSalesOrderItem(SalesOrderItem SalesOrderItem);

	public int updateSalesOrderItem(SalesOrderItem SalesOrderItem);

	public int deleteSalesOrderItem(SalesOrderItem SalesOrderItem);

	public List<SalesOrderItem> getSalesOrderItem(SalesOrderItem SalesOrderItem);
}
