package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.CommodityMapper;
import org.sl.shop.model.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommodityService {

    @Autowired
    public CommodityMapper commodityMapper;

    @Transactional(readOnly = true)
    public List<Commodity> getCommodity(Commodity comm) {
        return commodityMapper.getCommodity(comm);
    }

    @Transactional
    public void addCommodity(Commodity comm) {
        commodityMapper.addCommodity(comm);
    }

    @Transactional
    public void updateCommodity(Commodity comm) {
        commodityMapper.updateCommodity(comm);
    }

    @Transactional
    public boolean deleteCommodity(Commodity comm) {
        commodityMapper.deleteCommodity(comm);
        return true;
    }

}
