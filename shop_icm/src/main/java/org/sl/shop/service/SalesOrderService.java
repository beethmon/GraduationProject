package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.SalesOrderItemMapper;
import org.sl.shop.mapper.SalesOrderMapper;
import org.sl.shop.model.SalesOrder;
import org.sl.shop.model.SalesOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalesOrderService {
	@Autowired
	public SalesOrderMapper salesOrderMapper;
	@Autowired
	public SalesOrderItemMapper salesOrderItemMapper;

	public List<SalesOrder> getSalesOrder(SalesOrder salesOrder) {
		return salesOrderMapper.getSalesOrder(salesOrder);
	}

	public List<SalesOrder> getSalesOrderAll(SalesOrder salesOrder) {
		return salesOrderMapper.getSalesOrderAll(salesOrder);
	}

	public void addSalesOrder(SalesOrder salesOrder) {
		salesOrderMapper.addSalesOrder(salesOrder);
		List<SalesOrderItem> list = salesOrder.getItems();
		if (null != list) {
			for (SalesOrderItem item : list) {
				salesOrderItemMapper.addSalesOrderItem(item);
			}
		}
	}

	public boolean updateSalesOrder(SalesOrder salesOrder) {
		if (salesOrder.getSoid() == 0)
			return false;
		salesOrderMapper.updateSalesOrder(salesOrder);
		List<SalesOrderItem> list = salesOrder.getItems();
		if (null != list) {
			for (SalesOrderItem item : list) {
				salesOrderItemMapper.updateSalesOrderItem(item);
			}
		}
		return true;
	}
}
