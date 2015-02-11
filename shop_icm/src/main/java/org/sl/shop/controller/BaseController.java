package org.sl.shop.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.github.pagehelper.Page;
import org.sl.shop.util.databinder.IntegerEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class BaseController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("initBinder");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
		binder.registerCustomEditor(int.class, new IntegerEditor());
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

    protected Map generationJsonMap(Page page) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pages", page.getPages());
        map.put("index", page.getPageNum());
        map.put("total", page.getTotal());
        map.put("pagesize", page.getPageSize());
        map.put("list", page);
        return map;
    }
}
