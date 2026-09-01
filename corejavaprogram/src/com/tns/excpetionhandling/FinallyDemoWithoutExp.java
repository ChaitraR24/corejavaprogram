package com.tns.excpetionhandling;

public class FinallyDemoWithoutExp {
public static void main(String[] args) {
	try {
		System.out.println("hello world...");
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("welcome top java");
	}
}
}
