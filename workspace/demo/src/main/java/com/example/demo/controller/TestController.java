package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RequestMapping("/test")
@RestController
public class TestController {

	//GET
	//POST
	//PUT
	//DELETE
	@GetMapping("/hello")
	//@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring boot";
	}
}
