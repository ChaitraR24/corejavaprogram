package com.tns.lamdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface Circle{
	public void area(int r);
}

public class AreaofCircleUsingLamda {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the radius");
	int radius = scanner.nextInt();
	
	Circle circle = (r)->{
		System.out.println(3.142 * radius * radius);
	};
	circle.area(radius);
}
}
