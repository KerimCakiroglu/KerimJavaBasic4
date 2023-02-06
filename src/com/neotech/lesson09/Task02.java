package com.neotech.lesson09;

public class Task02 {

	public static void main(String[] args) {

//		Print numbers from 1 to 100 in 1 line with space
//		Print numbers from 100 to 1
//		Print even numbers from 20 to 1 (2 ways)
//		Print odd numbers between 20 and 50 (2 ways)

		System.out.println("Print numbers from 1 to 100 in 1 line with space");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("Print numbers from 100 to 1");
		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}
		System.out.println();

		System.out.println("======================");

		System.out.println("Print even numbers from 20 to 1 (2 ways)");

		System.out.println("First way");

		for (int a = 20; a >= 1; a--) {

			if (a % 2 == 0) {
				System.out.print(a + " ");
			}

		}
		System.out.println();

		System.out.println("======================");

		System.out.println("Print even numbers from 20 to 1 (2 ways)");

		System.out.println("Second way");
		
	for (int a = 20;  a>=1;a-=2) {
		System.out.print(a+" ");
	}
		
		System.out.println();
		
		
		
		
		
		
		

		System.out.println("======================");

		System.out.println("Print odd numbers between 20 and 50 (2 ways)");

		for (int z = 20; z < 50; z++) {
			if (z % 2 == 1) {
				System.out.print(z + " ");
			}
		}

		System.out.println();

		System.out.println("======================");
		System.out.println("======================");

		System.out.println("Print odd numbers between 20 and 50 (2 ways)");

		System.out.println("Second way");
		
		
		for (int v =21; v<=50; v+=2) {
			System.out.print(v+" ");
			
		}
		
		
		
		System.out.println();
	}
}
