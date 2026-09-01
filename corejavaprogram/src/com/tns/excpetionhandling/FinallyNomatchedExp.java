package com.tns.excpetionhandling;

public class FinallyNomatchedExp {
public static void main(String[] args) {
	try {
		System.out.println(2/0);
	} catch (NullPointerException nullPointerException) {
		System.out.println(nullPointerException);
	}
	finally {
		System.out.println("hii hello");
	}
}
}
