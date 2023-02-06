package com.neotech.lesson25;

public class Computer {

	String brand;

	Computer(String brand) {
		this.brand = brand;

	}

	public void run() {
		System.out.println(brand + " computer can run the system");
	}

}

class Apple extends Computer {

	Apple(String brand) {
		super(brand);

	}

	// override the run() method
	public void run() {
		System.out.println(brand + " computer runs faster");
	}

	public void safe() {
		System.out.println(brand + " is very safe");
	}
}

class Lenovo extends Computer {

	Lenovo(String brand) {
		super(brand);

	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs even faster");
	}

	public void save() {
		System.out.println(brand + " computer saves alot of data");
	}

}

class HP extends Computer {

	String color;

	HP(String brand, String color) {
		super(brand);
		this.color = color;

	}

	@Override
	public void run() {
		System.out.println(brand + " computer runs slow");
	}

	public void save() {
		System.out.println(brand + " computer does not have big storage! ");
	}

}

class Dell extends Computer {

	public Dell(String brand) {
		super(brand);

	}

	// Lets not override the run () method

}