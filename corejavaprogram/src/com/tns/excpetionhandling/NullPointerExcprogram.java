package com.tns.excpetionhandling;

public class NullPointerExcprogram {
public static void main(String[] args) {
	String str = null;
	
	System.out.println("Program Strated...");
	
	try {
		System.out.println(str.length());
	} catch (NullPointerException nullPointerException) {
		System.out.println(nullPointerException.getMessage());
	}
	System.out.println("Program ended..");
}
}
