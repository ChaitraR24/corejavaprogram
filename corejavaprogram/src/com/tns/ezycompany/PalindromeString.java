package com.tns.ezycompany;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String str = scanner.next();
	
	String reverse = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		reverse = reverse + str.charAt(i);
	}
	
	if(reverse.equals(str)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
