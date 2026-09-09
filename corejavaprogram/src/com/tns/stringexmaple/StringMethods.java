package com.tns.stringexmaple;

public class StringMethods {
public static void main(String[] args) {
	String s1 = "hii how are you?";
	System.out.println("Length of the string is :" + s1.length());
	System.out.println("cahrAt method : " + s1.charAt(6));
	System.out.println("conver to uppercase method : " + s1.toUpperCase());
	System.out.println("conver to lower case : " + s1.toLowerCase());
	System.out.println("check the word is there are  not : " + s1.contains("o"));
	System.out.println(s1.startsWith("h"));
	System.out.println(s1.endsWith("l"));
	System.out.println(s1.replace("hii", "hello"));
	System.out.println(s1.substring(4,6));
}
}
