package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.mapper.ViewMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired 
    private ViewMapper vMapper;

    @Transactional(readOnly = true)
    public List<Commodity> getCommodity(Commodity comm) {
        return commodityMapper.getCommodity(comm);
    }
    
    @Transactional(readOnly = true)
    public List<SalesView> getCommoditySalesView(Commodity comm){
    	return vMapper.getCommoditySalesView(comm);
    }

    @Transactional
    public int addCommodity(Commodity comm) {
        return commodityMapper.addCommodity(comm);
    }

    @Transactional
    public int updateCommodity(Commodity comm) {
        return commodityMapper.updateCommodity(comm);
    }

    @Transactional
    public int deleteCommodity(Commodity comm) {
        return commodityMapper.deleteCommodity(comm);
    }

}
