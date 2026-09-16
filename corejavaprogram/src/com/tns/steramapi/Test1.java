package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List<Integer> no = Arrays.asList(10,20,34,56,76,89,5);
	no.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
