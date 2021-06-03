package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/check")
	public String status() {
		return "Hi My Name is AVINASH I am Sampark DevOps Engginer";
	}
}
