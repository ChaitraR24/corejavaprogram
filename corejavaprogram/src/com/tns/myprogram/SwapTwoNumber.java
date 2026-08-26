package com.tns.myprogram;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter Sceonde Number");
		int num2 = scanner.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping");
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
