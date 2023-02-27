package net.guides.springboot.todomanagement.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	
	
	@NotBlank
	@Email
	private String email;

	@Size(min = 3, message = "Enter at least 3 Characters...")
	private String employee;

	private Date targetDate;
	
	private int age;
	@NotNull
	private double salary;
	
	private String status;
	
	
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Todo() {
		super();
	}

	public Todo(String email, String desc, Date targetDate ,int age ,double salary,String status, boolean isDone) {
		super();
		
		this.email=email;
		this.employee = desc;
		this.targetDate = targetDate;
		this.age=age;
		this.salary=salary;
		this.status=status;
	}

	public int getAge() {
		return age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

	public String getDescription() {
		return employee;
	}

	public void setDescription(String employee) {
		this.employee = employee;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
}