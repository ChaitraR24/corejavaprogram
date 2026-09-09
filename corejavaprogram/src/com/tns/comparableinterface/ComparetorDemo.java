package com.tns.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book{
	int price;
	String bname;
	public Book(int price, String bname) {
		super();
		this.price = price;
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", bname=" + bname + "]";
	}
	
}

class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int result = o1.bname.compareTo(o2.bname);
		
		//if bname is same sort by price
		if(result==0) {
			result=o1.price-o2.price;
		}
		return result;
	}
	
}

public class ComparetorDemo {
public static void main(String[] args) {
	ArrayList<Book> arrayList = new ArrayList<Book>();
	arrayList.add(new Book(345, "java"));
	arrayList.add(new Book(345, "java advance"));
	
	Collections.sort(arrayList,new BookComparator());
	System.out.println(arrayList);
	
}
}
