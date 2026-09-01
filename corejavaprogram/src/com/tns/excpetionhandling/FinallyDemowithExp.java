package com.tns.excpetionhandling;

public class FinallyDemowithExp {
public static void main(String[] args) {
	try {
		System.out.println(4/0);
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("welcome to java");
	}
}
}
