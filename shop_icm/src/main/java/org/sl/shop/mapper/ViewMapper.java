package org.sl.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesView;

public interface ViewMapper {
	
	public List<SalesView> getCommoditySalesView(Commodity comm);
	
}
