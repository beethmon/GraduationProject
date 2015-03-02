package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesView;

public interface ViewMapper {
	public List<SalesView> getCommoditySaleView(Commodity comm);
}
