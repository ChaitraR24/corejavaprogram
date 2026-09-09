package com.tns.stringexmaple;

public class StringDemo {
public static void main(String[] args) {
	String s1 = "Thanvi";
	String s2 = s1;
	String s3 = s2;
	
	System.out.println("Before Modification : ");
	
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);
	System.out.println("s3 : " + s3);
	
	System.out.println("-----------------------------");
	
	s1 = "sanvi";
	
	System.out.println("After modification ");
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);
	System.out.println("s3 : " + s3);
}
}
