package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		// Find the largest among 3 numbers

		// declaring three doublesw

		double a, b, c;

		Scanner scan = new Scanner(System.in);

		System.err.println("Enter three numbers:");

		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		// usinf nested if

		// logic:
		// if a>b
		// if a>c
		// a is the largest
		// it means c is larger than a ---> c is the largest
		// else -- meaning a<b
		// if b>c
		// bid the largest

		if (a > b) {

			if (a > c) {

				System.out.println(a + " is the largest number!");
			} else // a<c and beacuse a>b ---> c>a>b
			{
				System.out.println(c + "is the largest number!");
			}

		} else // a<b
		{
			if (b > c) { // b>a and b>c
				System.out.println(b + " is largest number!");

			} else // b<c ----> c>b>a
			{
				System.out.println(c + " is largest number!");
			}
		}
		
		
		
		
		System.out.println(" ========using comparison operators =====");
		
		
		
		if (a>b && a>c) { //a is the largest 
			System.out.println(a+ " is largest number!");
		}
		else if ( b>a && b>c)// b is the largest
		{
			System.out.println(b+" is the largest number!");
		}
		else //c is the largest
		{System.out.println(c+" is the largest number!");}
		
		
		

	}

}
