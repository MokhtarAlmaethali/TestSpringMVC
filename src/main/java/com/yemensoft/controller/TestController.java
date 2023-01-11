package com.yemensoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	
@GetMapping("/test3")	
public void test(){
		
		System.out.println("controller 2");
		
	}


	public String testset(){
		
		System.out.println("controller 2");
		return "index.jsp";
	}
}
