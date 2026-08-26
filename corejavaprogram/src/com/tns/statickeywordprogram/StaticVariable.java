package com.tns.statickeywordprogram;

class Employee{
	int id;
	String name;
	static String company = "TNS";

	 Employee(int id,String name) {
		this.name=name;
		this.id=id;
	}
	 void display() {
		 System.out.println("Employee Details are: ");
		 System.out.println("id : " + id + "Name : " + name + "Company Name : " + company);
	 }
	
}

public class StaticVariable {
public static void main(String[] args) {
	Employee employee1 = new Employee(101, "Tanvi");
	Employee employee2 = new Employee(102, "Sanvi");
    Employee employee3 = new Employee(104, "Deeksha");
    employee1.display();
    employee2.display();
    employee3.display();
}
}
