package com.example.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.services.TodoService;

@Controller
@SessionAttributes("userName")
public class TodoController {
	@Autowired
	private TodoService todoService;

	@GetMapping("/todos")
	public String goTodo(ModelMap model) {
		model.put("todos", todoService.getAllTodo());
		return "todos";
	}
}
