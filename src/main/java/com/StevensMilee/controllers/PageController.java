package com.StevensMilee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}

	@RequestMapping("/about")
	String about() {
		return "about";
	}

	@RequestMapping("/admin")
	String admin() {
		return "admin";
	}
	
	@RequestMapping("/profile")
	String profile() {
		return "profile";
	}
	
}
