package com.tns.excpetionhandling;

public class ArithematicExceprogrm {
public static void main(String[] args) {
	int salary = 590000;
	int workingdays = 30;
	int bonusDay = 9;
	
	try {
		int dailysalary = salary/workingdays;
		System.out.println("Daily Salary : " + dailysalary);
		
		int bonusperDay = salary/0;
		System.out.println("Bonus per day : " + bonusperDay);
	} catch (ArithmeticException arithmeticException) {
		System.out.println("can not calculate salary bonus");
		System.out.println(arithmeticException);
	}
}
}
