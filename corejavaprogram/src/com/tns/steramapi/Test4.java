package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	List<Integer> n = Arrays.asList(45,677,89,89,90,90,87,87,60,60);
//	n.stream().distinct().forEach(number->System.out.println(number));
	
	long count = n.stream().distinct().count();
	System.out.println("unique values : " + count);
}
}
