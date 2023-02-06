package com.neotech.lesson06;

public class LogicalAnd {

	public static void main(String[] args) {
		
		//Declare a number
		// if number is between 1-1- --> number is small
		//if number is between 11-100 --> number us medium
		//if number is between 101-1000 --> number is large
		
		//declare a number
		int number = 1728;
		
		//check the number is between 1 and 10
		
		if (number >= 1 && number <=10) {
			System.out.println("It is a small number");
		}
		else if (number >= 11 && number <=100) {
			System.out.println("It is a medium number");
		}
		else if (number >= 101 && number <=1000) {
			System.out.println("This is a large number");
		}
		else {
			System.out.println(number + " is out of range");
		}
		
		

	}

}
