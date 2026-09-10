package com.tns.lamdaexpression;

@FunctionalInterface
interface Demo{
	public String paint(String message);
}

public class WithLamdaExpAndPara {
public static void main(String[] args) {
	int width = 90;
	Demo draw = (message)->{
		String str1 = "I would like to say ....";
		String str2 = str1 + message;
		return str2;
	};
	System.out.println(draw.paint("time is pricisous"));
}
}
