package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;





@RequestMapping("/demo")
@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/sayhello")
	public String sayHello() throws Exception {		
		return "Hello";
	}
	@GetMapping("/sum/{a}/{b}")
	public int add(@PathVariable("a") int a,@PathVariable("b") int b) throws Exception {			
		return demoService.addTwoNumber(a, b);
	}
	@GetMapping("/devide/{a}/{b}")
	public int devide(@PathVariable("a") int a,@PathVariable("b") int b) throws Exception {			
		return demoService.devideNumber(a, b);
	}

}
