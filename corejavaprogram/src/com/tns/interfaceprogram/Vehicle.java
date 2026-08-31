package com.tns.interfaceprogram;



interface GPS{
	void trackLocation();
	void calculateRoute(double speed,int distance);
}

interface VehicleSafety{
	boolean detectCollision(boolean collision);
	void applyEmergencyBrake();
}

class SmartVehicle implements GPS,VehicleSafety{
 
	private String vehicleNumber;
	private String model;
	private double speed;
	private String location;
	
	public SmartVehicle(String vehicleNumber, String model, double speed, String location) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.speed = speed;
		this.location = location;
	}

	@Override
	public boolean detectCollision(boolean collision) {
	  if(collision) {
		  System.out.println("collision is dtected");
	  }
	  return collision;
		
	}

	@Override
	public void applyEmergencyBrake() {
		System.out.println("Emergeny braking system is on....");
		
	}

	@Override
	public void trackLocation() {
		System.out.println("Tracing loxcation...." + location );
		
	}

	@Override
	public void calculateRoute(double speed,int distance) {
	  System.out.println("calcuktaing the route..");
	  System.out.println("speed : " + speed);
	  System.out.println("distance : " + distance);
		
	}
	
	public void warning(double speed) {
		if(speed>100) {
			System.out.println("Please avoid rash dravwing....");
		}
	}
	
	
	public void safteyStatus() {
		if(speed>200) {
			System.out.println("bad");
		}else {
			System.out.println("good");
		}
	}
	
}


public class Vehicle {
public static void main(String[] args) {
	
	double speed = 300;
	SmartVehicle smartVehicle = new SmartVehicle("KA201", "BMW", speed, "Banglore");
	if(smartVehicle.detectCollision(false)) {
		smartVehicle.applyEmergencyBrake();
		smartVehicle.warning(speed);
		smartVehicle.safteyStatus();
	} else {
		smartVehicle.calculateRoute(speed,89);
		smartVehicle.trackLocation();
		smartVehicle.warning(speed);
		smartVehicle.safteyStatus();

	}
}
}
