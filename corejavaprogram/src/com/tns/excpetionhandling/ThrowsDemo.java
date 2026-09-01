package com.tns.excpetionhandling;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			calculate(3,0);
		} catch (Exception e) {
			System.out.println("Can't dived by zero");
		}
	}

	private static void calculate(int i, int j) throws ArithmeticException {
		int result = i/j;
		System.out.println("Result :" + result);
	}
}
