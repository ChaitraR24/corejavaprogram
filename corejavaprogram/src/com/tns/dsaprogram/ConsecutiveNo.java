package com.tns.dsaprogram;

import java.util.Scanner;

public class ConsecutiveNo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number of calls : ");
	int n = scanner.nextInt();
	
	int count = 0;
	boolean found = false;
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the outcome(Yes/No) : ");
		String outcome = scanner.next();
		
		if(outcome.equalsIgnoreCase("No")) {
			count++;
			
			if(count==6) {
				found=true;
				break;
			}
		}else {
			count=0;
		}
	}
	
	if(found) {
		System.out.println("six consicutive no outcome is found");
	} else {
		System.out.println("six consutive no outcome not found");
	}
	
}
}
