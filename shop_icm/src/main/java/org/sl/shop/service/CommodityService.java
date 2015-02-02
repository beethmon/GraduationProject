package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.model.Commodity;
import org.springframework.stereotype.Service;

@Service
public class CommodityService {

	public CommodityMapper commodityMapper;

	public List<Commodity> getCommodity(Commodity comm) {
		return commodityMapper.getCommodity(comm);
	}

	public void addComodity(Commodity comm) {
		commodityMapper.addCommodity(comm);
	}

	public void updateCommodity(Commodity comm) {
		commodityMapper.updateCommodity(comm);
	}
	
}
