package com.tns.lamdaexpression;

@FunctionalInterface
interface Draw{
	public void paint();
}

public class WithLamdaExp {
public static void main(String[] args) {
	int width  = 67;
	Draw draw = ()->{
		System.out.println("Width : " + width);
	};
	draw.paint();
}
}
