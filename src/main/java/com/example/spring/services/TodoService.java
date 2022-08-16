package com.example.spring.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		todoList.add(new Todo(4, "tin0", "description0", LocalDate.now(), true));
		todoList.add(new Todo(5, "tin1", "description1", LocalDate.now(), true));
		todoList.add(new Todo(6, "tin2", "description2", LocalDate.now(), true));
	}

	public List<Todo> getAllTodo() {
		return this.todoList;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo t = new Todo(todoList.size() + 1, username, description, targetDate, done);
		todoList.add(t);
	}

	public void deleteById(int id) {
		Predicate<? super Todo> filter = todo -> todo.getId() == id;
		todoList.removeIf(filter);
	}

	public Todo getTodoById(int id) {
		return todoList.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
	}

	public void updateTodoById(int id, String description, LocalDate targetDate, boolean done) {
		Todo todoById = getTodoById(id);
		todoById.setDescription(description);
		todoById.setTargetDate(targetDate);
		todoById.setDone(done);

	}

	public List<Todo> findByUserName(String username) {
		Predicate<? super Todo> filter = todo -> todo.getUsername().equalsIgnoreCase(username);
		return todoList.stream().filter(filter).collect(Collectors.toList());
	}
}
