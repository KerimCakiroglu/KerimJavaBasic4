package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		
		
		//++increment
		//decrement
		
		int x;
		
		int y = 10;
		
		//POST Increment
		//1.perform x=y
		//2. increment (y=y+1)
		x= y++;
		
		System.out.println(x);
		System.out.println(y);
		
		
		//PRE Increnment
		
		int a;
		int b = 15;
		
		a = ++b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		//Decrement----
		
	
		int c;
		int d =14;
		
	
		
		c = --d;
		
		System.out.println(c);
		System.out.println(d);
		
		//POSTDecrement
		
		int e;
		int f= 14;
		
		e=f--;
		
		System.out.println(e);
		System.out.println(f);
		
		
		
		
		
		
		
		

	}

}
