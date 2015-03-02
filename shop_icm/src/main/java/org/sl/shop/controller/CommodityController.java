package org.sl.shop.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.sl.shop.model.Commodity;
import org.sl.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by godoway on 2015/2/11.
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController extends BaseController {

	@Autowired
	private CommodityService commodityService;

	@RequestMapping("/")
	public String commodityView() {

		return "commodity";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getCommodity(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Commodity commodity) {
		System.out.println(commodity);
		PageHelper.startPage(page, pagesize);
		Page<Commodity> p = (Page<Commodity>) commodityService
				.getCommodity(commodity);
		return generationJsonMap(p);
	}
}
