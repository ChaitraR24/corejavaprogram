package com.tns.myprogram;

import java.util.Scanner;

public class SumOfGivenNum {
 public static void add(int a,int b, int c) {
	 int result = a+ b+ c;
	 System.out.println("sum of three number's are : " + result);
 }
 
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = scanner.nextInt();
	System.out.println("Enter seconde number");
	int b = scanner.nextInt();
	System.out.println("Enter 3rd number");
	int c = scanner.nextInt();
	add(a,b,c);
}
}
