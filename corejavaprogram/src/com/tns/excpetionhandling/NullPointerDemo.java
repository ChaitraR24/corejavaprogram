package com.tns.excpetionhandling;

public class NullPointerDemo {
public static void main(String[] args) {
	String employee = "Sanvi";
	String department = null;
	String designation = "doctor";
	 System.out.println("Program strated...");
	try {
		System.out.println("Employee name : " + employee);
		System.out.println("Employee name length : " + employee.length());
		System.out.println("Employee designation :" + designation);
		System.out.println("Department : " + department.toLowerCase());
	} catch (NullPointerException nullPointerException) {
		System.out.println(nullPointerException.getMessage());
	}
	
	System.out.println("Progrm ended...");
}
}
