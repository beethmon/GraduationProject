package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.SalesOrder;

public interface SalesOrderMapper {
	public int addSalesOrder(SalesOrder salesOrder);

	public int updateSalesOrder(SalesOrder salesOrder);

	public int deleteSalesOrder(SalesOrder salesOrder);

	public List<SalesOrder> getSalesOrder(SalesOrder salesOrder);

	public List<SalesOrder> getSalesOrderAll(SalesOrder salesOrder);

}
