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
    private StockMapper stockMapper;

    @Transactional(readOnly = true)
    public List<Stock> getStock(Stock stock) {
        return stockMapper.getStock(stock);
    }

    @Transactional
    public void addStock(Commodity commodity, double num) {
        Stock stock = new Stock();
        stock.setComm(commodity);
        Stock tmp = stockMapper.getStock(stock).get(0);
        if (null != tmp) {
            tmp.setNum(tmp.getNum() + num);
        } else {
            tmp = stock;
        }
        stockMapper.updateStock(tmp);
    }

    @Transactional
    public void minusStock(Commodity commodity, double num) {
        addStock(commodity, -num);
    }

    @Transactional
    public void updateStock(Stock stock) {
        stockMapper.updateStock(stock);
    }

    @Transactional
    public boolean deleteStock(Stock stock) {
        stockMapper.deleteStock(stock);
        return true;
    }

}
