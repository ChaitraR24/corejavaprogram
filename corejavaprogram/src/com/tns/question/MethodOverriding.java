package com.tns.question;

class Vehicle {
	void start() {
		System.out.println("Vehicle is staring....");
	}
}

class Car extends Vehicle{
	void start() {
		System.out.println("car stars with a key");
	}
}

class Bike extends Vehicle{
	void start() {
		System.out.println("Bike starts with a selt-start");
	}
}

public class MethodOverriding {
public static void main(String[] args) {
	Vehicle vehicle = new Car();
	vehicle.start();
	
	vehicle = new Bike();
	vehicle.start();
}
}
