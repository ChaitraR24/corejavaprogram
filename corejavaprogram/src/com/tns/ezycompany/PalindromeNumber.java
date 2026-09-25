package com.tns.ezycompany;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	int num = scanner.nextInt();
	
	int org = num;
	int rev = 0;
	
	while(num!=0) {
		int rem = num%10;
		rev = rev *10 + rem;
		num = num/10;
	}
	
	
	if(org==rev) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a palindrome");
	}
}
}
