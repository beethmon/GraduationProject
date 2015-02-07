package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Commodity;

public interface CommodityMapper {
	// insert update remove
	public boolean addCommodity(Commodity comm);

	public int updateCommodity(Commodity comm);

	public boolean removeCommodity(Commodity comm);

	// query
	/**
	 * 
	 * @param comm
	 *            用javabean传参
	 * @return
	 */
	public List<Commodity> getCommodity(Commodity comm);

}
