package com.tns.excpetionhandling;

public class WithException {
public static void main(String[] args) {
	System.out.println("Program Started...");
	int a = 9;
	int b = 0;
	try {
		System.out.println(a/b);
	} catch(Exception e) {
//		System.out.println(e);
		System.out.println(e.getMessage());
	}
	System.out.println("Program ended...");
}
}
