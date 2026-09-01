package com.tns.excpetionhandling;

public class ThrowDemo2 {
public static void main(String[] args) {
	try {
		checkpassword("de");
	} catch (IllegalArgumentException illegalArgumentException) {
		System.out.println(illegalArgumentException.getMessage());
	}
}

private static void checkpassword(String password) {
	if(password.length()<6) {
	 throw new IllegalArgumentException("Password is too small");
	}
	System.out.println("Password is creadted..");
	
}
}
