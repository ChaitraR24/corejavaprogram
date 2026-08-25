package com.tns.superkeywordprogram;

class Employee{
	int salary = 90000;
	
	void department() {
		System.out.println("The employee dep is cs");
	}
}

class SenoirEmployee extends Employee{
	int salary = 98000;
	void displayinfo() {
		System.out.println("Employee salary : " + super.salary);
		System.out.println("Senoir Employee salary  : " + salary);
	}
	
	void department() {
		super.department();
		System.out.println("The senoir employee dept is AI");
	}
}

public class SuperKeywordProgram {
public static void main(String[] args) {
	SenoirEmployee senoirEmployee = new SenoirEmployee();
	senoirEmployee.displayinfo();
	senoirEmployee.department();
	
}
}
