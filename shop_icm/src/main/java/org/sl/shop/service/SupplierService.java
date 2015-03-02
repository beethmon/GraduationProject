package org.sl.shop.service;

import java.util.List;

import org.sl.shop.mapper.SupplierMapper;
import org.sl.shop.model.Supplier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SupplierService {
	private SupplierMapper supplierMapper;

    @Transactional(readOnly = true)
    public List<Supplier> getSupplier(Supplier supplier) {
        return supplierMapper.getSupplier(supplier);
    }

    @Transactional(readOnly = true)
    public List<Supplier> getSupplierAll(Supplier supplier) {
        return supplierMapper.getSupplierAll(supplier);
    }

    @Transactional
    public void addSupplier(Supplier supplier) {
        supplierMapper.addSupplier(supplier);
    }

    @Transactional
    public void updateSupplier(Supplier supplier) {
        supplierMapper.updateSupplier(supplier);
    }

    @Transactional
    public boolean deleteSupplier(Supplier supplier) {
        supplierMapper.deleteSupplier(supplier);
        return true;
    }

}
