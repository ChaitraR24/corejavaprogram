package com.tns.statickeywordprogram;

public class StaticMethod {
	
	static int calculateBonus(int salary) {
		return salary*10/100;
	}
public static void main(String[] args) {
	int bonus = StaticMethod.calculateBonus(3000);
	System.out.println("Bonus : " + bonus);
}
}
