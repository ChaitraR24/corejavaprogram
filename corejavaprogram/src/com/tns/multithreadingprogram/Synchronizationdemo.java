package com.tns.multithreadingprogram;

class Account{
	int balance = 100;
	synchronized void deposite(int amount) {
		System.out.println(Thread.currentThread().getName() + "is depositing amount : " + amount);
		
		int currentBalance = balance;
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		balance = currentBalance + amount;
		
		System.out.println(Thread.currentThread().getName() + " completed Balance = " + balance);
	}
}

class DepositeTask implements Runnable{
 
	Account account;
	
	public DepositeTask(Account account) {
		this.account=account;
	}
	
	@Override
	public void run() {
	 account.deposite(700);
	}
	
}

public class Synchronizationdemo {
public static void main(String[] args) {
	Account account = new Account();
	DepositeTask depositeTask = new DepositeTask(account);
	
	Thread thread = new Thread(depositeTask,"thread-1");
	Thread thread2 = new Thread(depositeTask,"thread-2");
	
	thread.start();
	thread2.start();
}
}
