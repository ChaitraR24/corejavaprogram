package com.tns.statickeywordprogram;

public class StaticBlock {

	static int employeecount;
	
	static {
		employeecount = 100;
		System.out.println("employee system is initialized");
	}
	
	public static void main(String[] args) {
		System.out.println("employee system is stared.....");
		System.out.println("employee count : " + employeecount);
	}
}
