package com.zettamine.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zetta")
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to Zettamine";
	}
	
	@GetMapping("/pk")
	public String getWelcomeMsg1() {
		return "Punya Koti is a Hacker";
	}
	
	@GetMapping("/js")
	public String getWelcomeMsg2( String name) {
		return name;
	}
}
