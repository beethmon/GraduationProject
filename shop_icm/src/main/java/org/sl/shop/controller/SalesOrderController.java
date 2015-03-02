package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.SalesOrder;
import org.sl.shop.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Controller
@RequestMapping("/salesOrder")
public class SalesOrderController extends BaseController{

	@Autowired
	private SalesOrderService salesOrderService;

	@RequestMapping("/")
	public String salesOrderView() {

		return "salesOrder";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSalesOrder(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, SalesOrder salesOrder) {
		System.out.println(salesOrder);
		PageHelper.startPage(page, pagesize);
		Page<SalesOrder> p = (Page<SalesOrder>) salesOrderService
				.getSalesOrder(salesOrder);
		return generationJsonMap(p);
	}
	
	@RequestMapping(value = "/json/all/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSalesOrderAll(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, SalesOrder salesOrder) {
		System.out.println(salesOrder);
		PageHelper.startPage(page, pagesize);
		Page<SalesOrder> p = (Page<SalesOrder>) salesOrderService
				.getSalesOrderAll(salesOrder);
		return generationJsonMap(p);
	}

}
