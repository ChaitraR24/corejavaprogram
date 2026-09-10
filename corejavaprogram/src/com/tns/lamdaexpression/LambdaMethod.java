package com.tns.lamdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface Demo2{
	public double electriccitybill(Double units);
}

public class LambdaMethod {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter electricity bill");
	double units = scanner.nextDouble();
	
	//lamda expression
	
	Demo2 demo2 =(unit)->{
		if(unit<=100) {
			return unit * 3;
		}
		else if(unit<=200) {
			return (100 * 3) + ((unit-100) *5);
		}
		return unit;
	};
	System.out.println(demo2.electriccitybill(units));
}
}
