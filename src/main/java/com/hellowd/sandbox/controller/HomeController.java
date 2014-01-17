package com.hellowd.sandbox.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellowd.sandbox.service.UserService;

@Controller
public class HomeController {
	
	/* core services */
	@Autowired private UserService userService;
	
	
	
	/* request mappings */
	@RequestMapping("/")
	public String showIndexPage(Map<String, Object> model) throws Exception {
		System.out.println("here requested");
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam String identifier, @RequestParam String password) {
		if(identifier != null && password != null) {
			
			boolean valid = userService.login(identifier, password);
			
			if( valid ) {
				return "home";
			}
			else {
				return "error";
			}
		}
		else {
			return "error";	
		}
	}
}
