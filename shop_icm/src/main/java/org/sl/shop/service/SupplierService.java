package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.SupplierMapper;
import org.sl.shop.model.Supplier;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
	public SupplierMapper supplierMapper;

	public List<Supplier> getSupplier(Supplier supplier) {
		return supplierMapper.getSupplier(supplier);
	}

	public List<Supplier> getSupplierAll(Supplier supplier) {
		return supplierMapper.getSupplierAll(supplier);
	}

	public void addSupplier(Supplier supplier) {
		supplierMapper.addSupplier(supplier);
	}

	public boolean updateSupplier(Supplier supplier) {
		if(supplier.getSpid() == 0)
			return false;
		supplierMapper.updateSupplier(supplier);
		return true;
	}

}
