package org.sl.shop.service;

import org.sl.shop.mapper.SalesOrderItemMapper;
import org.sl.shop.model.SalesOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalesOrderItemService {

    @Autowired
    private SalesOrderItemMapper salesOrderItemMapper;

    @Transactional(readOnly = true)
    public List<SalesOrderItem> getSalesOrderItem(SalesOrderItem salesOrderItem){
        return salesOrderItemMapper.getSalesOrderItem(salesOrderItem);
    }

    @Transactional
    public void addSalesOrderItem(SalesOrderItem salesOrderItem){
        salesOrderItemMapper.addSalesOrderItem(salesOrderItem);
    }

    @Transactional
    public void updateSalesOrderItem(SalesOrderItem salesOrderItem){
        salesOrderItemMapper.updateSalesOrderItem(salesOrderItem);
    }

    @Transactional
    public boolean deleteSalesOrderItem(SalesOrderItem salesOrderItem){
        salesOrderItemMapper.deleteSalesOrderItem(salesOrderItem);
        return true;
    }
}
