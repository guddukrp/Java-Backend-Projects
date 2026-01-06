package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String welcomePage(Model model ,@RequestParam String userid,@RequestParam String password) {
		if(userid.equals("admin") && password.equals("admin")) {
			((HashMap<String, Object>) model).put("userid",userid);
			return "welcome";
		}else {
			((HashMap<String, Object>) model).put("errorMsg", "Please provide the correct userid and password");
			return "login";
		}
		
		
		
	}
}
