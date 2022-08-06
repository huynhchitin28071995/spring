package com.example.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.services.AuthenticateService;

@Controller
@SessionAttributes("userName")
public class LoginController {
	@Autowired
	AuthenticateService authService;

	@GetMapping(path = "/login")
	public String login() {
		return "login";
	}

	@PostMapping(path = "/login")
	public String afterLogin(@RequestParam String userName, @RequestParam String password, ModelMap model) {
		if (authService.authen(userName, password)) {
			model.put("userName", userName);
			model.put("password", password);
			return "welcome";
		}
		return "login";
	}
}
