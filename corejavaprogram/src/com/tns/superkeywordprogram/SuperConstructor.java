package com.tns.superkeywordprogram;

class Person{
	String name;
	
	Person(String name){
		this.name=name;
		System.out.println("Person Constructor");
	}
}

class Student extends Person {
	int rollno;
	Student(String name,int rollno) {
		super(name); 
		this.rollno=rollno;
		System.out.println("Student Constructor");
	}
	
	void display() {
		System.out.println("Name : " + name) ;
		System.out.println("Roll Number : "+ rollno);
	}
	
}

public class SuperConstructor {
public static void main(String[] args) {
	Student student = new Student("tanvi",102);
	student.display();
	
}
}
