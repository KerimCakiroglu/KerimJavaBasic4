package com.neotech.lesson03;

public class ModulusOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=25;
		b=4;
		
		int div = a/b; //6 lost whatever is after decimal point
		
		//remainder -> 25/4 -> 6, remainder = 1
		int remainder = a%b;
		
		System.out.println(div);
		System.out.println(remainder);
		
		//number % 2 = 0 -----> even
		
		double d1 = 3.656;
		double d2 = 4.323;
		
		double d3 = d1/d2;
		
		System.out.println(d3);
		
		int c, d;
		c=13;
		d=5;
		
		
		
		int rem = c%d;
		
		// 13/5 = ----> 2 * 5 = 10 -----> 13- 10= 3
		
		System.out.println(rem);

	}

}
