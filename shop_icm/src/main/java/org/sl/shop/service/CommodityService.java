package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.model.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService {

	@Autowired
	public CommodityMapper commodityMapper;

	public List<Commodity> getCommodity(Commodity comm) {
		return commodityMapper.getCommodity(comm);
	}

	public void addComodity(Commodity comm) {
		commodityMapper.addCommodity(comm);
	}

	public boolean updateCommodity(Commodity comm) {
		if (comm.getCid() == 0)
			return false;
		commodityMapper.updateCommodity(comm);
		return true;
	}

}
