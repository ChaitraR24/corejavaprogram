package com.tns.abstractionprogram;

abstract class Notification{
	abstract void sendMessage(String message);
}

class EmailNotification extends Notification{

	@Override
	void sendMessage(String message) {
	
		String email = "tanvi@gmail.com";
		System.out.println("sending email...");
		System.out.println("To : " + email);
		System.out.println("Message " + message);
		int mesaagelength = message.length();
		System.out.println("message length : " + mesaagelength);
	}
	
}

public class NotificationDemo {
public static void main(String[] args) {
	EmailNotification emailNotification = new EmailNotification();
	emailNotification.sendMessage("Your project is approved...");
}
}
