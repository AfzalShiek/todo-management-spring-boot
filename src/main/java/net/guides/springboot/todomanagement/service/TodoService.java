package net.guides.springboot.todomanagement.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot.todomanagement.model.Todo;
import net.guides.springboot.todomanagement.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		Instant instant = todo.getTargetDate().toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate date = zdt.toLocalDate();
		
		
		todo.setAge(Period.between(date, LocalDate.now()).getYears());
		
		
		
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String email, String desc, Date targetDate, int age,double salary,String status, boolean isDone) {
		
		todoRepository.save(new Todo(email, desc, targetDate,age,salary,status,isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		
		Instant instant = todo.getTargetDate().toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate date = zdt.toLocalDate();
		
		
		
		
		todo.setAge(Period.between(date, LocalDate.now()).getYears());
		
		todoRepository.save(todo);
	}

	

	@Override
	public Object retrieveTodos() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}
}