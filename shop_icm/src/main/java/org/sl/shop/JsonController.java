package org.sl.shop;

import java.util.HashMap;
import java.util.Map;

import org.sl.shop.model.Commodity;
import org.sl.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/json")
public class JsonController extends BaseController{

	@Autowired
	public CommodityService commodityService;

	@RequestMapping(value = "/commodity-{page}-{pagesize}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getCommodity(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize,
			@ModelAttribute("commodity")@Validated Commodity commodity) {
		System.out.println("jsonController" + commodity);
		Map<String, Object> map = new HashMap<String, Object>();
		PageHelper.startPage(page, pagesize);
		Page<Commodity> p = (Page<Commodity>) commodityService
				.getCommodity(commodity);
		map.put("pages", p.getPages());
		map.put("index", p.getPageNum());
		map.put("total", p.getTotal());
		map.put("pagesize", p.getPageSize());
		map.put("list", p);
		return map;
	}
}
