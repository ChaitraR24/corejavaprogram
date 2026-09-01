package com.tns.excpetionhandling;

public class StringIndexOutExcpro {
public static void main(String[] args) {
	System.out.println("Program Strated...");
	String str = "java";
	
	try {
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(9));
		System.out.println("Welcome");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Program ended..");
}
}
