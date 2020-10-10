package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/home")
//	@ResponseBody
	public String home() {
		
		return "home";
	}
}
