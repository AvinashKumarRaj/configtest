package com.eicherlive.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/check")
	public String status() {
		return "my url exposed";
	}
	
	@GetMapping(value = "/")
	public String applicationSttaus() {
		return "Application Started..........";
	}
}


