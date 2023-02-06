package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {
		// Also know as (aka) shorthand operator

		int num = 100; // store 100 into a container
		num = num + 100; // add 100 to the value inside the container
		System.out.println(num);

		num = num + 100; 
		System.out.println(num); //300
		
		
		//we can use compund/shorthand operator
		num +=60; // add 60 to the container
		System.out.println(num);
		
		
		//long way
		//num = num -10
		
		//short way
		num -= 10;
		System.out.println(num); //350
		

		
		//num= num/7;
		num /=7;
		System.out.println(num); //50
//num = *2
		num *=2;
		System.out.println(num); //100
		
		//Modulus operator. 100 mod 9 = 1
		num %= 9; 
		System.out.println(num); //1
		// The remainder is 1
		
		//English = remainder
		//Spanish = resto
		//Turkish = kalan
		//Azeri = Qaliq
		
		//How it is calculated? Ask you kids in middle school
		
		
		
		
		
		
		
		
		
	}

}
