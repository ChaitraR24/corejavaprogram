package com.tns.abstractionprogram;

abstract class Delivery {
	abstract double calculatecharge(double distance);
	
//	concrete method
	
	void showDelivery() {
		System.out.println("Delivery sewrvice selected....");
	}
}

class BikeDelivery extends Delivery{
	@Override
	double  calculatecharge(double distance) {
		return distance * 10;
	}
}

class DroneDelivery extends Delivery{
	@Override
	double  calculatecharge(double distance) {
		return distance * 20;
	}
}

public class AbstrctionDemo {
public static void main(String[] args) {
	BikeDelivery bikeDelivery = new BikeDelivery();
	System.out.println(bikeDelivery.calculatecharge(6));
	
	DroneDelivery droneDelivery = new DroneDelivery();
	System.out.println(droneDelivery.calculatecharge(10));
}
}
