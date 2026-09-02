package com.tns.multithreadingprogram;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse id : " + Thread.currentThread().getId());
	}
}

class Onenote extends Thread{
	public void run() {
		System.out.println("Onenote id : " + Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome id :" + Thread.currentThread().getId());
	}
}

public class ExtendedThreadClass {
public static void main(String[] args) {
	Eclipse eclipse = new Eclipse();
	eclipse.start();
	
	Onenote onenote = new Onenote();
	onenote.start();
	
	Chrome chrome = new Chrome();
	chrome.start();
	
	for(int i =1;i<=4;i++) {
		System.out.println("Main thread id :" + Thread.currentThread().getId());
	}
}
}
