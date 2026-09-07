package com.tns.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("chrome");
		linkedList.add("zoom");
		linkedList.add("youtube");
		linkedList.add("google");
		
		System.out.println(linkedList);
		
//		remove first
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		
//		remove last
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);

	}

}
