package org.sl.shop.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.sl.shop.model.Commodity;
import org.sl.shop.model.PurchaseOrderItem;
import org.sl.shop.model.SalesView;
import org.sl.shop.service.CommodityService;
import org.sl.shop.service.PurchaseOrderItemService;
import org.sl.shop.util.Orderby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends BaseController {

	@Autowired
	private PurchaseOrderItemService purchaseOrderItemService;
	@Autowired
	private CommodityService commodityService;

	@RequestMapping(value = "/")
	public String index(Model model) {
		// 视图数据填充
		model.addAttribute("commodity", getCommodity());
		model.addAttribute("pPurchaseOrderItems", getPurchase());
		model.addAttribute("salesView", getSalesView());
		return "index";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home")
	public String home(Locale locale, Model model, Commodity commodity) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		System.out.println("homeController:" + commodity);
		return "home";
	}

	@RequestMapping("/test")
	public String test(Model model, Commodity commodity) {
		
		model.addAttribute("commodity", commodity);
		return "test";
	}

	private Page<Commodity> getCommodity() {
		// 设置分页为第1页每页3个
		PageHelper.startPage(1, 3);
		// 获取库存最少3个
		Commodity commodity = new Commodity();
        commodity.setOrderby(new Orderby("num", Orderby.ASC));
        Page<Commodity> pCommodigy = (Page<Commodity>)commodityService.getCommodity(commodity);
		return pCommodigy;
	}

	private Page<PurchaseOrderItem> getPurchase() {
		// 设置分页为第1页每页3个
		PageHelper.startPage(1, 3);
		// 获取最近进货的3条
		PurchaseOrderItem purchaseOrderItem = new PurchaseOrderItem();
		purchaseOrderItem.setOrderby(new Orderby("poiDate", Orderby.DESC));
		Page<PurchaseOrderItem> pPurchaseOrderItems = (Page<PurchaseOrderItem>) purchaseOrderItemService
				.getPurchaseOrderItem(purchaseOrderItem);
		return pPurchaseOrderItems;
	}

	private Page<SalesView> getSalesView() {
		// 设置分页为第1页每页3个
		PageHelper.startPage(1, 3);
		// 获取本天热销
		Commodity queryComm = new Commodity();
		queryComm.setOrderby(new Orderby("num", Orderby.DESC));
		Page<SalesView> salesView = (Page<SalesView>) commodityService
				.getCommoditySalesView(queryComm);
		return salesView;
	}

}
