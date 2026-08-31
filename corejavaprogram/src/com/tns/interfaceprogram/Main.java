package com.tns.interfaceprogram;

interface Payment{
	void pay(double amount);
	void checkStatus();
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
  System.out.println("UPI " + amount + " successfully done");
	}

	@Override
	public void checkStatus() {
  System.out.println("Trasaction is done");
		
	}
	
}

public class Main {
public static void main(String[] args) {
	UPI upi = new UPI();
	upi.pay(300.99);
	upi.checkStatus();
}
}
