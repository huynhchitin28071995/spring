package com.example.spring.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring.models.Todo;

@Service
public class TodoService {
	private static List<Todo> todoList = new ArrayList<>();
	static {
		todoList.add(new Todo(0, "tin0", "description0", LocalDate.now(), true));
		todoList.add(new Todo(1, "tin1", "description1", LocalDate.now(), true));
		todoList.add(new Todo(2, "tin2", "description2", LocalDate.now(), true));
	}

	public List<Todo> getAllTodo() {
		return this.todoList;
	}
}
