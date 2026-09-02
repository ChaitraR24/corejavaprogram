package com.tns.multithreadingprogram;

class MyTask extends Thread{
	public void run() {
		System.err.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getId());
	}
}



public class PriorityDemo {
	public static void main(String[] args) {
	MyTask myTask = new MyTask();
	MyTask myTask2 = new MyTask();
	MyTask myTask3 = new MyTask();
	
	myTask.setName("Background Task");
	myTask2.setName("Normal Task");
	myTask3.setName("Important Task");
	
	myTask.setPriority(10);
	myTask2.setPriority(7);
	myTask3.setPriority(3);
	
	myTask.start();
	myTask2.start();
	myTask3.start();

	}

}
