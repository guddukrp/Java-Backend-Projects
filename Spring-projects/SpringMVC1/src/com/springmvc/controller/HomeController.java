package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String  firstCall() {
		return "home-page";
	}
	
	@RequestMapping("secondPage")
	public String  secondCall() {
		return "second-page";
	}
	
	@RequestMapping("thirdPage")
	public String formPage() {
		return "form-page";
	}
	
	@RequestMapping("formFilled")
	public String dataReceived(HttpServletRequest req,Model m) {
		String name = req.getParameter("name");
		m.addAttribute("nameReceived", name);
		return "show-data";
	}
	
	
}
