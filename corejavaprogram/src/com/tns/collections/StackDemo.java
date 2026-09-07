package com.tns.collections;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	
	stack.add(10);
	stack.add(20);
	stack.add(30);
	stack.add(40);
	System.out.println(stack);
	
	System.out.println(stack.push(50));
	
	System.out.println(stack);
	
	System.out.println(stack.pop());
	
	System.out.println(stack);
	
	
//	last element
	System.out.println("The last element is :" +stack.peek());
	System.out.println(stack);
	
	System.out.println(""  + stack.size());
}
}
