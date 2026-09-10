package com.tns.lamdaexpression;

interface Draw1{
	public void paint();
}

class Test implements Draw1{

	@Override
	public void paint() {
		System.out.println("I am a good painter....");
		
	}
	
}

public class WithoutLamdaExp {
public static void main(String[] args) {
	Draw1 draw = new Test();
	draw.paint();
}
}
