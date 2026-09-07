package com.tns.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector< Integer> vector = new Vector<Integer>();
		vector.add(89);
		vector.add(90);
		vector.add(91);
		
		System.out.println(vector);
		
		System.out.println(vector.capacity());
		
		System.out.println(vector.contains(4));
		
		System.out.println(vector.removeFirst());

	}

}
