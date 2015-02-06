package org.sl.shop;

import java.text.SimpleDateFormat;
import java.util.Date;

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

}
