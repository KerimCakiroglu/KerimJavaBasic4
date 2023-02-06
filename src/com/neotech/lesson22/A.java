package com.neotech.lesson22;

public class A {

	String name = "A";

	void method() {
		System.out.println("This is a method in class A!");
		System.out.println(this.name);

	}

}

class B extends A {
	String name = "B";

	void method() {
		System.out.println("This is a method in class B!");
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

class C extends B {
	String name = "C";

	void method() {
		System.out.println("This is a method in class C !");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
}
