package org.sl.shop.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.sl.shop.model.Refund;
import org.sl.shop.service.RefundService;
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
@RequestMapping("/refund")
public class RefundController extends BaseController {

	@Autowired
	private RefundService refundService;

	@RequestMapping("/")
	public String refundView() {

		return "refund";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getRefund(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Refund refund) {
		System.out.println(refund);
		PageHelper.startPage(page, pagesize);
		Page<Refund> p = (Page<Refund>) refundService
				.getRefund(refund);
		return generationJsonMap(p);
	}

}
