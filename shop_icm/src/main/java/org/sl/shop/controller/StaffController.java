package org.sl.shop.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.sl.shop.model.Staff;
import org.sl.shop.service.StaffService;
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
@RequestMapping("/staff")
public class StaffController extends BaseController {

	@Autowired
	private StaffService staffService;

	@RequestMapping("/")
	public String staffView() {

		return "staff";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getStaff(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, Staff staff) {
		System.out.println(staff);
		PageHelper.startPage(page, pagesize);
		Page<Staff> p = (Page<Staff>) staffService
				.getStaff(staff);
		return generationJsonMap(p);
	}

}
