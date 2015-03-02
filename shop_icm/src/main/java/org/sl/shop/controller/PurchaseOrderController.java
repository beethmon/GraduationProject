package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.PurchaseOrder;
import org.sl.shop.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Controller
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController extends BaseController{

	@Autowired
	private PurchaseOrderService purchaseOrderService;

	@RequestMapping("/")
	public String purchaseOrderView() {

		return "purchaseOrder";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getPurchaseOrder(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, PurchaseOrder purchaseOrder) {
		System.out.println(purchaseOrder);
		PageHelper.startPage(page, pagesize);
		Page<PurchaseOrder> p = (Page<PurchaseOrder>) purchaseOrderService
				.getPurchaseOrder(purchaseOrder);
		return generationJsonMap(p);
	}
	
	@RequestMapping(value = "/json/all/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getPurchaseOrderAll(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, PurchaseOrder purchaseOrder) {
		System.out.println(purchaseOrder);
		PageHelper.startPage(page, pagesize);
		Page<PurchaseOrder> p = (Page<PurchaseOrder>) purchaseOrderService
				.getPurchaseOrderAll(purchaseOrder);
		return generationJsonMap(p);
	}

}
