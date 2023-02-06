package com.neotech.lesson21;

public class USA {

	String state, stateCapital;

	// constructor
	public USA(String state, String stateCapital) {

		this.state = state;
		this.stateCapital = stateCapital;

	}

	public USA() {

	}

	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);
	}

	public void displayInfo() {
		this.displayState();
		this.displayStateCapital(); // compiler will add this key word
	}

	public static void main(String[] args) {

		USA us1 = new USA("New Jersey", "Trenton");

		us1.displayInfo();

		System.out.println("----------");

		USA st2 = new USA("Delaware", "Dover");

		st2.displayInfo();

		System.out.println("----------");

		USA st3 = new USA();

	}

}
