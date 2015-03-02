package org.sl.shop.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.sl.shop.model.User;
import org.sl.shop.service.UserService;
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
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String userView() {

		return "user";
	}

	@RequestMapping(value = "/json/{pagesize}/{page}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> getUser(@PathVariable("page") int page,
			@PathVariable("pagesize") int pagesize, User user) {
		System.out.println(user);
		PageHelper.startPage(page, pagesize);
		Page<User> p = (Page<User>) userService
				.getAllUser(user);
		return generationJsonMap(p);
	}
	
	@RequestMapping(value = "/login")
	public String login(User user){
		
		return "login";
	}
	
	@RequestMapping(value = "/login_now")
	public String loginNow(User user){
		User login = userService.Login(user);
		boolean flag = (login!=null);
		
		return "info";
	}

}
