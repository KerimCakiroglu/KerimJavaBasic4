package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		int time = 8;
		
		if (time <9) {
			//begin of if body
			System.out.println("Good Evening");
		}
		
		
		//in case you do not think properly of the stopping condition,
		//then you risk going into an infinite loop
		
		while (time<12) {
			//begining of while body
			System.out.println(time);
			time ++;
			
		}//ending of while body
		
		
		System.out.println("==========================================");
		
		
		//How to print number from {20 -30{ ?
		int a = 20;
		
		
		while ( a<30 ) {
			
		//	System.out.println("Condition: " + (a<30));
			
			System.out.println(a);
			a++;
		}
		
		System.out.println("=================");
		
		
		int b = 5;
		
		while (b<25) {
			System.out.print(b+" ");
			++b;
			
		}
		
		
		
		System.out.println("==============================");
		
		
		
		// how can we print number 10 to 1?
		
		int c =10;
		
		while (c>=1) {
			System.out.print(c+ " ");
			c--;
			
		}
		
		
		System.out.println("==========================");
		
		
		
			int e =50;
		
		while (e>=1) {
			if (e%2==0) {
				System.out.print(e+ " ");
			}
			
			e--;
		}
		
		
	}

}
