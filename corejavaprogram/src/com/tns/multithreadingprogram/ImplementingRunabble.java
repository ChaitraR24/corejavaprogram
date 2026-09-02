package com.tns.multithreadingprogram;

class Whatsup implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Eclipse id : " + Thread.currentThread().getId());
		}
		
	}
	
}

public class ImplementingRunabble {

	public static void main(String[] args) {
		Whatsup whatsup = new Whatsup();
		Thread thread = new Thread(whatsup);
		thread.start();
		System.out.println("Main id : " + Thread.currentThread().getId());
	}

}
