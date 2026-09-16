package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Rahul","priya","anu","swathi");
	List<String> uppernames=names.stream().map(name->name.toUpperCase()).toList();
	System.out.println("all conveted  : " + uppernames);
}
}
