package com.yemensoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
	
	@GetMapping("/test" )
	public String test(){
		System.out.println("HelloWorldController");
		return "/index.jsp";
	}
	@GetMapping("/test2")
	public String test2(){
		System.out.println("HelloWorldController2");
		return "/index.jsp";
	}

}
