package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.PurchaseOrderItem;
import org.sl.shop.service.PurchaseOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/purchaseOrderItem")
public class PurchaseOrderItemController extends BaseController {
	@Autowired
	private PurchaseOrderItemService purchaseOrderItemService;

	@RequestMapping("/")
	public String purchaseOrderItemView() {

		return "purchaseOrderItem";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getPurchaseOrderItem(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, PurchaseOrderItem purchaseOrderItem) {
		System.out.println(purchaseOrderItem);
		PageHelper.startPage(page, pagesize);
		Page<PurchaseOrderItem> p = (Page<PurchaseOrderItem>) purchaseOrderItemService
				.getPurchaseOrderItem(purchaseOrderItem);
		return generationJsonMap(p);
	}

}
