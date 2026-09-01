package com.tns.excpetionhandling;

public class ThrowsDemo2 {
public static void main(String[] args) {
	try {
		login("thanvi","drrtt");
	} catch (Exception e) {
	 System.out.println(e);
	}
	System.out.println("Login process complted..");
}

private static void login(String username, String password) throws Exception {

	
	if(username.equals("admin")) {
		throw new Exception("Invali user name");
		
	}
	if(!password.equals("1234")) {
		System.out.println("Invalid password");
	}
	
	
	System.out.println("Login succefully..");
}
}
