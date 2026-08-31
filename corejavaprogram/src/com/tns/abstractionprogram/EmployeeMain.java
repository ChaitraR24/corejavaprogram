package com.tns.abstractionprogram;

abstract class Employee {
	abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{

	int month;
	double salary;
	 public FullTimeEmployee(double salary,int month) {
		this.salary=salary;
		this.month=month;
	}
	@Override
	void calculateSalary() {
		System.out.println("FullTime employee salary is : " + month * salary);
		
	}
	
}

class PartTimeEmployee extends Employee{

	float time;
	double salary;
	public PartTimeEmployee(float time, double salary) {
		super();
		this.time = time;
		this.salary = salary;
	}
	@Override
	void calculateSalary() {
		System.out.println("Parttime employee salary is :" + time * salary);
		
	}
	
}

public class EmployeeMain {
public static void main(String[] args) {
	FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(20000,12);
	fullTimeEmployee.calculateSalary();
	System.out.println("=============================");
	
	PartTimeEmployee partTimeEmployee = new PartTimeEmployee(7, 12000);
	partTimeEmployee.calculateSalary();
}
}
