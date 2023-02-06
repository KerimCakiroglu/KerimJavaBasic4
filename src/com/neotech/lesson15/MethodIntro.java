package com.neotech.lesson15;

public class MethodIntro {

	void greet() {

		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Bye!");

	}

	void greet2(String name) {
		System.out.println("Hello " + name);
		System.out.println("How are you?");
		System.out.println("bye " + name);
	}

	public static void main(String[] args) {

		MethodIntro obj = new MethodIntro();

		obj.greet();

		System.out.println("=============");

		obj.greet2("Emine");

		System.out.println("==============");

		String name = "Vane";
		obj.greet2(name);

	}

}
