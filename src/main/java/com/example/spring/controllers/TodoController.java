package com.example.spring.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.models.Todo;
import com.example.spring.services.TodoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService todoService;

	@GetMapping("/list-todos")
	public String goTodo(ModelMap model) {
		String username = (String) model.get("name");
		todoService.findByUserName(username);
		model.put("todos", todoService.findByUserName(username));
		return "todos";
	}

	@GetMapping("add-todo")
	public String showNewTodoPage(ModelMap model) {
		Todo todo = new Todo(0, (String) model.get("name"), "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "updateTodo";
	}

	@PostMapping("add-todo")
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
//		Todo t = new Todo(0, null, description, null, false);
//		todoService.getAllTodo().add(t);
//		model.put("todos", todoService.getAllTodo());
//		return "todos";
		if (result.hasErrors()) {
			return "todo";
		}
		todoService.addTodo((String) model.get("name"), todo.getDescription(), todo.getTargetDate(), todo.isDone());
		return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteATodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String showUpdatePage(@RequestParam int id, ModelMap model) {
		model.put("todo", todoService.getTodoById(id));
		return "updateTodo";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateATodo(@Valid Todo todo, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "updateTodo";
		}
		todoService.updateTodoById(todo.getId(), todo.getDescription(), todo.getTargetDate(), todo.isDone());
		return "redirect:list-todos";
	}
}
