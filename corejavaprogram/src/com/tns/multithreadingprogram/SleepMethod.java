package com.tns.multithreadingprogram;

class Sleep extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("sleep id :" + Thread.currentThread().getId());
			
			try {
				sleep(2000);
			} catch (InterruptedException n) {
				System.out.println(n.getMessage());	
				} finally {
					System.out.println("final block");
				}
		}	
	
	}

}

public class SleepMethod {
	public static void main(String[] args) {
		Sleep sleep = new Sleep();
		sleep.start();
		
	}
}
