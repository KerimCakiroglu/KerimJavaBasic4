package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		/*
		 * * Use Scanner, Use AND,OR Operator
		 
		 * 1. Ask the user to enter the height in inches. Person should be classified as one of the following:
		 * • short (under 60 inch)
		 * • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
*/
		
		int height;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your height? ");
		height = scan.nextInt();
		
		// cand1   cond2
		// && --> both of the conditions have to be true
		// || --> only one of them is enough
		
		if (height >0 && height <60) {
			System.out.println("Classified as short");
		}
		else if (height>= 60 && height<72) {
			System.out.println("Classified as medium");
		}
		else if (height>=72) {
			System.out.println("Classified as tall");
			
		}
		else {
			System.out.println("invalid number");
		}
		
		
	}

}
