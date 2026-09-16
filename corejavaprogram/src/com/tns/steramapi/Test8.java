package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test8 {
public static void main(String[] args) {
	List<Integer> num = Arrays.asList(3000,8788,78876,45677,7888,5443);
//	boolean result = num.stream().filter(salary->salary>1000).allMatch(salary->salary>10000);
	boolean result = num.stream().filter(salary->salary>1000).anyMatch(salary->salary>10000);
	System.out.println("salary found : " + result);
}
}
