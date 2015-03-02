package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.Supplier;
import org.sl.shop.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/supplier")
public class SupplierController extends BaseController {
	@Autowired
	private SupplierService supplierService;

	@RequestMapping("/")
	public String supplierView() {

		return "supplier";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSupplier(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Supplier supplier) {
		System.out.println(supplier);
		PageHelper.startPage(page, pagesize);
		Page<Supplier> p = (Page<Supplier>) supplierService
				.getSupplier(supplier);
		return generationJsonMap(p);
	}
	
	@RequestMapping(value = "/json/all/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSupplierAll(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Supplier supplier) {
		System.out.println(supplier);
		PageHelper.startPage(page, pagesize);
		Page<Supplier> p = (Page<Supplier>) supplierService
				.getSupplierAll(supplier);
		return generationJsonMap(p);
	}

}
