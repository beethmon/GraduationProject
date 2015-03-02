package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.SalesOrderItemMapper;
import org.sl.shop.mapper.SalesOrderMapper;
import org.sl.shop.model.SalesOrder;
import org.sl.shop.model.SalesOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SalesOrderService {
    @Autowired
    private SalesOrderMapper salesOrderMapper;
    @Autowired
    private SalesOrderItemMapper salesOrderItemMapper;

    @Transactional(readOnly = true)
    public List<SalesOrder> getSalesOrder(SalesOrder salesOrder) {
        return salesOrderMapper.getSalesOrder(salesOrder);
    }

    @Transactional(readOnly = true)
    public List<SalesOrder> getSalesOrderAll(SalesOrder salesOrder) {
        return salesOrderMapper.getSalesOrderAll(salesOrder);
    }

    @Transactional
    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderMapper.addSalesOrder(salesOrder);
        List<SalesOrderItem> list = salesOrder.getItems();
        if (null != list) {
            for (SalesOrderItem item : list) {
                salesOrderItemMapper.addSalesOrderItem(item);
            }
        }
    }

    @Transactional
    public void updateSalesOrder(SalesOrder salesOrder) {
        salesOrderMapper.updateSalesOrder(salesOrder);
        List<SalesOrderItem> list = salesOrder.getItems();
        if (null != list) {
            for (SalesOrderItem item : list) {
                salesOrderItemMapper.updateSalesOrderItem(item);
            }
        }
    }

    @Transactional
    public boolean deleteSalesOrder(SalesOrder salesOrder) {
        List<SalesOrderItem> list = salesOrder.getItems();
        if (list != null && list.size() > 0) {
            for (SalesOrderItem item : list) {
                salesOrderItemMapper.deleteSalesOrderItem(item);
            }
        }
        salesOrderMapper.deleteSalesOrder(salesOrder);
        return true;
    }
}
