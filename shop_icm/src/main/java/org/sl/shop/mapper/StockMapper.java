package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Stock;

public interface StockMapper {
	public boolean addStock(Stock stock);
	public int updateStock(Stock stock);
	public boolean deleteStock(Stock stock);
	public List<Stock> getStock(Stock stock);
}
