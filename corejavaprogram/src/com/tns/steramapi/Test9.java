package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

public class Test9 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("sangettha","anu","manu","radha");
	names.stream().sorted().forEach(name->System.out.println(name));
}
}
