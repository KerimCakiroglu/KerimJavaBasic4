package com.neotech.lesson04;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
		// Casting or Converting
		// byte->short -> int -> long -> float -> double
		
		double d1 = 3.7; //no casting/coversion
		System.out.println(d1);
		
		double d2 = 6; // casting is happpening
		System.out.println(d2); // casting is happening
		
		// widening, implict casting, automatically
		int num1 = 5;// casting happening
		double d3 = num1;
		System.out.println(d3);
		
		
		//complier is complaining
		//type mismatch: cannot convert from double to int
		// int num2 = 6.3;
		
		
		//narrowing, explicit casting, should be done manually
		int num2 = (int) 6.3; //I tell Java, I want to store it as an int
		System.out.println(num2);
		
		byte b1 = (byte)3453; //I tell Java, I take the responsibility
		System.out.println(b1);
		
		System.out.println("--------------------");
		
		int i2 = 45;
		byte b2 = (byte) i2; // I may or may not lose data
		System.out.println(b2);//I did Not lose data, 
		
		//narrowing
		long l1 =17;
		int number1 = (int) l1; // I did NOT lose data
		
		
		//narrowing
		//We are trying to fit something big into the small container
		long l2 =923423658769L;
		int number2 =(int)l2;
		System.out.println(number2); // I DID lose data
		
		// Widening, implecit casting, automaticallyint
		int number5 = 247;
		float f1 = (float) number5;// I can specify, but I dont need
		float f2 = number5;// Even if T dont specfy, it will cast/convert
		
		System.out.println(f1);
		System.out.println(f2);
		
		
		
		
		
		
		
		
		
		
	}

}
