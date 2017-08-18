package com.satvir;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String home(){
		return "Welcome to Spring Boot";
	}

}
