package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;



public class Test6 {
public static void main(String[] args) {
	
	List<Integer> num = Arrays.asList(34,65,7,8,56,67,10,20,45,67,5);
	List<Integer> result = num.stream().filter(n->n%5==0).toList();
	System.out.println(result);
}
}
