package com.neotech.lesson24;

public class FinalKeyword {

	public static String str = "Hello";

	public static final String str2 = "Bye";

	public final double PI = 3.1415926; // PI always have this value

	public static void main(String[] args) {

		str = "Hi";

	}

// final method cannot be overridden
	public final void hello() {
		System.out.println("Hello, i am a final method");
	}

	// yes i can overload a final method
	public final void hello(String name) {
		System.out.println("Hello " + name);
	}

}

class SubClass extends FinalKeyword {
//	@Override
//	public void hello () {
//		
//	}

	// not overriding!! Method signatura is different:just another method
	public void hello(int num) {

	}
}