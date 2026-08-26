package com.tns.ploymorphisum;

import java.time.temporal.TemporalAmount;

class BankAccount{
	void calculateinterste(double amount) {
		System.out.println("Calaculating standerd bank interst");
		System.out.println("Amount : " +amount);
	}
}

class SavingAccount extends BankAccount{
@Override
void calculateinterste(double amount) {
	double interest = amount * 0.04;
	System.out.println("Saving Account");
	System.out.println("Pricipal : " + amount);
	System.out.println("Interest : "+ interest);
}
}

class FixedDeposite extends BankAccount{
	@Override
	void calculateinterste(double amount) {
		double interest = amount * 0.07;
		System.out.println("Fixed Deposite");
		System.out.println("prinipal : " + amount);
		System.out.println("interste" +interest);
	}
}

class CurrentAccount extends BankAccount{
	@Override
	void calculateinterste(double amount) {
		System.out.println("current account");
		System.out.println("no interste priveded");
	}
}

public class MethodOverriding {
public static void main(String[] args) {
	BankAccount bankAccount = new SavingAccount();
	bankAccount.calculateinterste(7000);
	bankAccount = new FixedDeposite();
	bankAccount.calculateinterste(5000);
	bankAccount = new CurrentAccount();
	bankAccount.calculateinterste(1999);
}
}
