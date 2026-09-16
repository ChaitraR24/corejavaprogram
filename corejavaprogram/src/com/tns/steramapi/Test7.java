package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test7 {
public static void main(String[] args) {
	List<String> fruits = Arrays.asList("apple","banana","kivi","mango");
	Optional<String> result = fruits.stream().skip(2).findFirst();
	System.out.println(result.orElse("product not found"));
}
}
