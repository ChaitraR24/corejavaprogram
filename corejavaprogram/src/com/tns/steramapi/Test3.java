package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	List<Integer> n = Arrays.asList(34,56,7,8,66,6);
	n.stream().sorted().forEach(number->System.out.println(number));
}
}
