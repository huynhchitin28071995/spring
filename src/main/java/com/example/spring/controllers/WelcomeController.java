package com.example.spring.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class WelcomeController {

	@GetMapping(path = "/")
	public String login(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}

//	@PostMapping(path = "/login")
//	public String afterLogin(@RequestParam String userName, @RequestParam String password, ModelMap model) {
//		if (authService.authen(userName, password)) {
//			model.put("userName", userName);
//			model.put("password", password);
//			return "welcome";
//		}
//		return "login";
//	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
}
