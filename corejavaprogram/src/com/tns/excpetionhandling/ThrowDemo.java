package com.tns.excpetionhandling;

public class ThrowDemo {

	static void CheckAge(int age) {
		if(age<18) {
		throw new ArithmeticException("Student is not eligible for voting..");
		}
		System.out.println("Eligible for vote..");
	}
	
	public static void main(String[] args) {
		try {
			CheckAge(56);
		} catch (Exception e) {
		 System.out.println(e);
		}
	}
   
}
