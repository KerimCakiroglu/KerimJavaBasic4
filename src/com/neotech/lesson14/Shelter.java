package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {

		Dog dog1 = new Dog();

		dog1.breed = "French Bulldog";
		dog1.size = "Small";
		dog1.color = "Blue";
		dog1.age = 3;

		dog1.run();
		dog1.eat();
		dog1.bark();

		System.out.println("=============");

		Dog dog2 = new Dog();

		dog2.breed = "Golden R ";
		dog2.size = "Large";
		dog2.color = "Brown";
		dog2.age = 9;

		dog2.run();
		dog2.eat();
		dog2.bark();

		System.out.println("=============");

		Dog dog3 = new Dog();

		dog3.breed = "Akita";
		dog3.size = "Medium";
		dog3.color = "Brown";
		dog3.age = 3;

		dog3.run();
		dog3.eat();
		dog3.bark();

		System.out.println("=============");

	}

}
