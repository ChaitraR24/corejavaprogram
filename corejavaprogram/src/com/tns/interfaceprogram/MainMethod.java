package com.tns.interfaceprogram;

interface OrderService{
	boolean validateOrder(double amount);
	void processPayment(double amount);
	void genarateInvoice(String orderId,double amount);
	void updateOrderStatus(String orderId,String status);
}

class OnlineOrder implements OrderService{
   
	private String customerName;
	private String oredrId;
	
	
	
	public OnlineOrder(String customerName, String oredrId) {
		super();
		this.customerName = customerName;
		this.oredrId = oredrId;
	}

	
	@Override
	public boolean validateOrder(double amount) {
	 if(amount>0) {
		 System.out.println("online validation sucessfully done");
		 return true;
	 }
	 System.out.println("Invalid order...");
		return false;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("processoin paymnet : " + amount);
		System.out.println("payment successfully done....");
		
	}

	@Override
	public void genarateInvoice(String orderId, double amount) {
	  System.out.println("Inovice genrated...");
	  System.out.println("order Id: " + orderId);
	  System.out.println("Amount : " + amount);
		
	}

	@Override
	public void updateOrderStatus(String orderId, String status) {
		System.out.println("order: " + orderId  + "  status updatred :  " + status);
		
	}
	
}

public class MainMethod {
public static void main(String[] args) {
	OnlineOrder onlineOrder = new OnlineOrder("Thanvi","ORD1001" );
	double amount = 900;
	if(onlineOrder.validateOrder(amount)) {
		onlineOrder.processPayment(amount);
		onlineOrder.genarateInvoice("ORD1001", amount);
		onlineOrder.updateOrderStatus("ORD1001","confirmed");
	}
}
}
