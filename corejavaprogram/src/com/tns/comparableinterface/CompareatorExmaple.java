package com.tns.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
  
	int age;
	String name;
	
	void display() {
		   System.out.println("Name : " + name  + "Age : " + age);
	   }

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}


class NameCompareatoe implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class AgeCompareator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.age, o2.age);
	}
	
}


public class CompareatorExmaple {
public static void main(String[] args) {
	ArrayList<Person> arrayList = new ArrayList<Person>();
	arrayList.add(new Person(45, "Geetha"));
	arrayList.add(new Person(67, "Ram"));
	arrayList.add(new Person(27, "Deeksha"));
	
	Collections.sort(arrayList,new NameCompareatoe());
	System.out.println("Sorted by Name :");
	for(Person s:arrayList) {
		s.display();
	}
	
	System.out.println("---------------------------------------");
	//sort by age
	Collections.sort(arrayList ,new AgeCompareator());
	System.out.println("Soretd by age");
	for(Person s:arrayList) {
		s.display();
	}
	
}
}
