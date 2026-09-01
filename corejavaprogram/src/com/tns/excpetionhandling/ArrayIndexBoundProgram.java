package com.tns.excpetionhandling;

public class ArrayIndexBoundProgram {
public static void main(String[] args) {
	int[] arr = {3,4,5,6};
	System.out.println("Progrma Strated..");
	
	try {
		System.out.println(arr[2]);
		System.out.println(arr[10]);
	} catch(Exception exception) {
		System.out.println(exception.getMessage());
	}
	
	System.out.println("Proghram ended...");
}
}