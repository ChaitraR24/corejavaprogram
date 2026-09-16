package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class Test11 {
public static void main(String[] args) {
	List<Customer> cu = Arrays.asList(new Customer("Riya", "Mumbai"),
			new Customer("Anum", "USA"),
			new Customer("Radha", "Banglore"),
			new Customer("anu", "Banglore"));
	
	 cu.stream().filter(c1->c1.getCity().equals("Banglore")).forEach(c1->System.out.println(c1.getName() + " " + c1.getCity()));
	
}
}
