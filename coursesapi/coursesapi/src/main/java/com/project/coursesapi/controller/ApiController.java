package com.project.coursesapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/")
	public String intro() {
		return "intro";
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hello world";
	}
}
