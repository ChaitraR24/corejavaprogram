package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test5 {
public static void main(String[] args) {
	List<String> items = Arrays.asList("mobile","fan","ac","microowen");
   List<String> result =items.stream().limit(3).toList();
   System.out.println("product name : " + result);
}
}
