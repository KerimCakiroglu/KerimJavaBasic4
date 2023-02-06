package com.neotech.lesson07;

public class LogicalNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ! (NOT) reserves the value of boolean variable
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
		
		//not only in front of a boolean variables, it can work with any boolean expression
		
		System.out.println(!(6<5));
		
		boolean cold =false;
		
		if (!cold) {
			System.out.println("It is cold");
		}
		
		
		
		int x=12;
		if (x==12) {
			System.out.println("X is 12");
		}
		else {
			System.out.println("X is NOT 12");
		}
		
		if (x != 12 ) {
			System.out.println("X is NOT 12");
		}
		
		else  {
			System.out.println("x is equal 12");
		}
		
		//we can write it like this !=
				//!= is the opposite of ==
				if (x != 12) //x is not equal to 12
				{
					System.out.println("x is NOT 12");
				}
		
		
		
		
		
		
		
		
	}

}
