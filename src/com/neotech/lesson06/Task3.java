package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
//ask user for the first number
		System.out.println("Enter the first number: ");
		int firstNumber = input.nextInt();
		
		//Ask user for the second number
		System.out.println("Enter the second number");
		int secondNumber = input.nextInt();
		
		
			// Compare two numbers
	
		if (firstNumber > secondNumber) {
		// First number is greater than second number
		System.out.println(firstNumber + " is greater than " + secondNumber);}
		
		else if (firstNumber == secondNumber) {
				// First and second number are equal
				System.out.println(firstNumber + " is equal to " + secondNumber);
			} else {
				// First number is less than second number
				System.out.println(firstNumber + " is less than " + secondNumber);}
		
	

		}}
