package org.sl.shop.controller;

import java.util.Map;

import org.sl.shop.model.Stock;
import org.sl.shop.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/stock")
public class StockController extends BaseController {

	@Autowired
	private StockService stockService;

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getStock(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Stock stock) {
		System.out.println(stock);
		PageHelper.startPage(page, pagesize);
		Page<Stock> p = (Page<Stock>) stockService.getStock(stock);
		return generationJsonMap(p);
	}

}
