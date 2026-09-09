package com.tns.stringexmaple;

public class EqualsAndEqualTo {

	public static void main(String[] args) {
		String s1 = "Asha";
		String s2 = new String("Arun");
		String s3 = "Asha";
		String s4 = "Anu";
		String s5 = "anu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));

	}

}
