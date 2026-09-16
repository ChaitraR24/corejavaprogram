package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private String dept;
    private	long salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
    
}

public class Test10 {
public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(new Employee(101, "sanvi", "IT", 6999999),
			new Employee(102, "Thanvi", "AI", 45566676),
			new Employee(103, "Geetha", "ML", 400000),
			new Employee(104, "chaitra", "IT", 900000));
	
//	List<String> result = employees.stream().filter(e->e.getSalary()>10000);
}
}
