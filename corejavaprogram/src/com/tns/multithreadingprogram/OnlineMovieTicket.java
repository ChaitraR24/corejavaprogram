package com.tns.multithreadingprogram;

class TickectCounter{
	int ticket = 5;
	synchronized void booktickets(int number) {
		if(ticket>=number) {
			System.out.println(Thread.currentThread().getName() + "is booking : " + number + " tickets");
			
			int avilable = ticket;
			
			try {
			  Thread.sleep(3000);
			} catch (Exception e) {
		      System.out.println(e);
			}
			
			ticket = avilable-number;
			
			System.out.println(Thread.currentThread().getName() + " : Booking complted");
		} else {
			System.out.println(Thread.currentThread().getName() + " : Not enough tickets");
		}
	}
}

class MovieTicket implements Runnable{
    TickectCounter tickectCounter;
    
    public MovieTicket(TickectCounter tickectCounter) {
		this.tickectCounter=tickectCounter;
	}
	@Override
	public void run() {
		tickectCounter.booktickets(4);
	}
	
}

public class OnlineMovieTicket {
public static void main(String[] args) {
	TickectCounter tickectCounter = new TickectCounter();
	MovieTicket movieTicket = new  MovieTicket(tickectCounter);
	Thread thread = new Thread(movieTicket,"customer-1");
	Thread thread2 = new Thread(movieTicket,"custer-2");
	
	thread.start();
	thread2.start();
}
}
