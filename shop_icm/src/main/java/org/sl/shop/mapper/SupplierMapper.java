package org.sl.shop.mapper;

import java.util.List;

import org.sl.shop.model.Supplier;

public interface SupplierMapper {
	public int addSupplier(Supplier supplier);

	public int updateSupplier(Supplier supplier);

	public int deleteSupplier(Supplier supplier);

	// query
	/**
	 * 
	 * @param supplier
	 *            用javabean传参
	 * @return
	 */
	public List<Supplier> getSupplierAll(Supplier supplier);

	public List<Supplier> getSupplier(Supplier supplier);
}
