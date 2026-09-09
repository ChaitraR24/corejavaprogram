package com.tns.treeset;

import java.util.TreeSet;

public class SalarySystem {

	public static void main(String[] args) {
		
		TreeSet< Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(10000);
		treeSet.add(20000);
		treeSet.add(9000000);
		treeSet.add(30000);
		treeSet.add(40000);
		treeSet.add(500000);
		
		System.out.println("Salaries : " + treeSet);
		System.out.println("Total Salaries : " + treeSet.size());
		
		System.out.println("Contains the salary : " + treeSet.contains(40000));
		
		System.out.println("Lowest Salary    : " + treeSet.first());
		
		System.out.println("Highest Salary : " + treeSet.last());
		
//		below
		System.out.println(treeSet.headSet(40000));
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
//		above
		
		System.out.println(treeSet.tailSet(40000));
	
//		between
		System.out.println(treeSet.subSet(3000, 30000));
		
		System.out.println(treeSet.isEmpty());
		
		System.out.println(treeSet.size());
		
		System.out.println(treeSet.ceiling(10000));
		
		System.out.println(treeSet);
		
		
	}

}
