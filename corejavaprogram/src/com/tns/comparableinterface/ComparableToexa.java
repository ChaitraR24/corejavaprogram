package com.tns.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int marks;
	String name;

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	//if we want to sort in String
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}
}

public class ComparableToexa {
public static void main(String[] args) {
	ArrayList<Student> arrayList = new ArrayList<Student>();
	arrayList.add(new Student(90, "Thanvi"));
	arrayList.add(new Student(98, "Sanvi"));
	arrayList.add(new Student(99, "deeksha"));
	
	Collections.sort(arrayList);
	System.out.println(arrayList);
}
}
