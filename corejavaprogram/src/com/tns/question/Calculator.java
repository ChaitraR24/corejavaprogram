package com.tns.question;

public class Calculator {

	void calculatearea(double pi,int radius) {
		System.out.println("Area of circle is: "  + pi * radius * radius);	
	}
	
	void calculatearea(int length,int breadth) {
		System.out.println("Area of Rectangle is: " +  length * breadth);	
	}
	
	void calculatearea(int side) {
		System.out.println("Area of square is: "  + side * side);	
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.calculatearea(3.147, 7);
		calculator.calculatearea(4, 6);
		calculator.calculatearea(4);
	}
}
