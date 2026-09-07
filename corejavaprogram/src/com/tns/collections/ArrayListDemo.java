package com.tns.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
    ArrayList<String> arrayList = new ArrayList<String>();
    
    arrayList.add("thanvi");
    arrayList.add("sanvi");
    arrayList.add("deeksha");
    arrayList.add("geetha");
    
    System.out.println(arrayList);
    
    System.out.println("Name of first person :" + arrayList.get(0));
    System.out.println("is this person avilable today : " + arrayList.contains("sanvi"));
    
//    no of elements
    System.out.println(arrayList.size());
    
    
    for(String s : arrayList) {
    	System.out.println(s);
    }
	}

}
