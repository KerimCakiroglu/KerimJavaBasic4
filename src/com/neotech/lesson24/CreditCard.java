package com.neotech.lesson24;

public class CreditCard {

	double balance;
	double interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}

	public void calculate() {
		interest = 5;
		System.out.println("Interest rate is " + interest + "%");
	}

}

class AX extends CreditCard {
	AX(double balance) {
		super(balance);
	}

	@Override
	public void calculate() {
		if (balance < 5000) {
			interest = 10;
		} else {
			interest = 20;
		}
		System.out.println("AX Interest rate is " + interest + "%");
	}
}

class Visa extends CreditCard {

	public Visa(double balance) {
		super(balance);

	}

	@Override
	public void calculate() {
		if (balance < 10000) {
			interest = 15;
		} else {
			interest = 30;
		}
		System.out.println("Visa Interest rate is " + interest + "%");
	}

	public void cashBack() {
		System.out.println("Visa CC gives you %3 CashBack");
	}
}
