package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.SalesOrderItem;
import org.sl.shop.service.SalesOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/salesOrderItem")
public class SalesOrderItemController extends BaseController {
	@Autowired
	private SalesOrderItemService salesOrderItemService;

	@RequestMapping("/")
	public String salesOrderItemView() {

		return "salesOrderItem";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSalesOrderItem(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, SalesOrderItem salesOrderItem) {
		System.out.println(salesOrderItem);
		PageHelper.startPage(page, pagesize);
		Page<SalesOrderItem> p = (Page<SalesOrderItem>) salesOrderItemService
				.getSalesOrderItem(salesOrderItem);
		return generationJsonMap(p);
	}

}
