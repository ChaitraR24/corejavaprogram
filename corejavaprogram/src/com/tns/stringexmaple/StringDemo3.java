package com.tns.stringexmaple;

public class StringDemo3 {
public static void main(String[] args) {
	String s1 = "hiii";
	String s2 = "hiii";
	String s3 = new String("hello");
	String s4 = new String("hiii");
	
	System.out.println(s1==s2);
	System.out.println(s1==s4);
	System.out.println(s1.compareTo(s4));
}
}
