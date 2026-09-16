package com.tns.steramapi;

import java.util.Arrays;
import java.util.List;

class Products{
	private String name;
	private long price;
	public Products(String name, long price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
}

public class Test12 {
public static void main(String[] args) {
	List<Products> prod = Arrays.asList(new Products("TV", 50000),
			new Products("AC", 20000),
			new Products("Mobile", 300000));
	long c2 =prod.stream().filter(p1->p1.getPrice()>50000).count();
	System.out.println(c2 + " item is grater than 50000" );
	
	
	
}
}
