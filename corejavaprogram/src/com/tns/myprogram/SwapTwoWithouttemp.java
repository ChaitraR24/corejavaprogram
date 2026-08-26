package com.tns.myprogram;

import java.util.Scanner;

public class SwapTwoWithouttemp {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1 = scanner.nextInt();
	System.out.println("Enter seconde number");
	int num2 = scanner.nextInt();
	System.out.println("before swapping");
	System.out.println(num1);
	System.out.println(num2);
	
//	num1 = num1 + num2;
//	num2 = num1 - num2;
//	num1 = num1 - num2;
	
//	num1 = num1 * num2;
//	num2 = num1/num2;
//	num1 = num1/num2;
	
	num1 = num1 ^num2;
	num2 = num1 ^ num2;
	num1 = num1 ^ num2;
	
	System.out.println("After Swapping");
	System.out.println(num1);
	System.out.println(num2);
}
}
