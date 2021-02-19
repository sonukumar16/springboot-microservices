package com.innovate.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is taking longger than Expected time." + "Please try again later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentFallBackMethod() {
		System.out.println("department is calling in fallback");
		return "Department Service is taking longger than Expected time." + "Please try again later";
	}
}
