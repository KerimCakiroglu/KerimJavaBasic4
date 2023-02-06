package com.neotech.lesson18;

public class LocalVariables {

	void method1() {
		// local variables are only visible within the method

		String name = "Gloria";
		int age = 28;

		System.out.println(name);
		System.out.println(age);

	}

	void method2() {
		String name = "Mustafa";
		System.out.println(name);
		// System.out.println();
	}

	public static void main(String[] args) {

		LocalVariables obj1 = new LocalVariables();
		obj1.method1();
		obj1.method2();

		boolean flag = true;

		if (flag) {
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);
		}

		// System.out.println(answer);
		System.out.println(flag);
		// the scope/ lifetime of answer is only if block
		// the scope of the flag is main method

		System.out.println("--------------");

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		// cannot acces the vaue of "i" outside the for loop
		// System.out.println(i);

		System.out.println("----------------");

		int x;

		for (x = 1; x <= 5; x++) {
			System.out.println(x);
		}
		System.out.println(x);

	}
}
