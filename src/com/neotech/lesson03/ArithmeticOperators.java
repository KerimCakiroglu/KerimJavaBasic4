package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// type name = value;
		// type + name; ----> declarations
		int num1, num2;
		
		//initialization
		num1 = 27;
		num2 = 5;
		
		
		// data type - name - = - value (calculation)
		int sum = num1 + num2; //adition
		int div = num1 / num2; // division
		int mult = num1 * num2; //mutiplication
		int sub = num1 - num2; //subtraction
		
		System.out.println("Sum : " + sum);
		System.out.println("Div: " + div);
		System.out.println("Mutl: "+ mult );
		System.out.println("Sub: " + sub);
		
		
		double d1, d2;
		d1 = 27;
		d2 = 5;
		
		double div_doubles = d1/d2;
		System.out.println(div_doubles);
		
		double div_int = num1/num2; //The result of that is int
		System.out.println(div_int); //not correct answer
		

		
	}

}
