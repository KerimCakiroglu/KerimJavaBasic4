package com.neotech.lesson21;

public class Dog extends Animal {

	// dog specific properties
	String breed;

	// dog specific behaviors

	public void bark() {
		System.out.println("Only dogs barks!");
		System.out.println("Breed is " + breed);
	}

}
