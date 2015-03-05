package org.sl.shop.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesView;
import org.sl.shop.service.CommodityService;
import org.sl.shop.service.StockService;
import org.sl.shop.util.Orderby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * Created by godoway on 2015/2/11.
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController extends BaseController {

	@Autowired
	private CommodityService commodityService;
	
	
	@RequestMapping(value = "")
	public String commodityView(Model model,HttpServletRequest request){
		String contextPath = request.getContextPath();
		String path = request.getServletPath();
		System.out.println("//"+path);
		//Page<Commodity> p = getCommodities(1,12,null);
		//model.addAttribute("p", p);
		model.addAttribute("contextPath", contextPath);
		model.addAttribute("path",path);
		return "commodity";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getCommodity(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Commodity commodity) {
		System.out.println(commodity);
		commodity.setOrderby(new Orderby("cid",Orderby.DESC));
		Page<Commodity> p = getCommodities(page, pagesize, commodity);
		return generationJsonMap(p);
	}
	
	@RequestMapping(value = "/json/sales/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getSalesView(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Commodity commodity) {
		PageHelper.startPage(page, pagesize);
		commodity.setOrderby(new Orderby("cid",Orderby.DESC));
		Page<SalesView> p = (Page<SalesView>) commodityService.getCommoditySalesView(commodity);
		return generationJsonMap(p);
	}
	
	private Page<Commodity> getCommodities(int page,int pagesize, Commodity query){
		PageHelper.startPage(page, pagesize);
		return (Page<Commodity>) commodityService.getCommodity(query);
	}
	
	
	
}
