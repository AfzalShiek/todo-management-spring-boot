package net.guides.springboot.todomanagement.service;


import java.util.Date;

import java.util.List;
import java.util.Optional;

import net.guides.springboot.todomanagement.model.Todo;

public interface ITodoService {

	

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo( String desc,String email, Date targetDate,int age,double salary,String status, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

	Object retrieveTodos();

}