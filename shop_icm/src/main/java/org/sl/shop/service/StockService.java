package org.sl.shop.service;

import org.sl.shop.mapper.StockMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class StockService {

    @Autowired
    public StockMapper stockMapper;

    @Transactional(readOnly = true)
    public List<Stock> getStock(Stock stock){
        return stockMapper.getStock(stock);
    }



}
