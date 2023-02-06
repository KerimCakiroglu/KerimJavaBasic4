package com.neotech.lesson22;

public class Car {

	String make, model;

	Car() {
		System.out.println("Car Default Constructor");
	}

	Car(String make, String model) {
		this.make = make;
		this.model = model;

	}

	void driving() {
		System.out.println("Car is driving!");
	}

}
