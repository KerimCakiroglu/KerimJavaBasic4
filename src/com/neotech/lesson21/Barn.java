package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.size = "Big";
		a.color = "Brown";
		a.age = 5;

		a.sleep();
		a.eat();
		a.displayInfo();

		System.out.println("----------");

		Dog d = new Dog();
		d.size = "Medium";
		d.color = "Black";
		d.age = 2;
		d.breed = "Husky"; // specific to Dog obj

		d.eat();
		d.sleep();
		d.displayInfo();
		d.bark(); // specific to Dog obj

		System.out.println("-------------");

		Cat c = new Cat();
		c.size = "Small";
		c.color = "White";
		c.weight = 15;

		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();

		System.out.println("----------");
		Puppy p = new Puppy();
		p.size = "Tiny"; // coming from Animal
		p.age = 1;// coming from Animal
		p.breed = "Jack Russell"; // coming from Dog
		p.hasPoppyTraining = false; // this belong to Puppy

		p.eat();
		p.sleep();
		p.displayInfo();

	}

}
