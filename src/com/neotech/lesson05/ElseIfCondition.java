package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		
		double d1 = 15.5;
		double d2 =15.2; //What is this called? 
		
		//d1>d2 -->same as saying d2<d1
		//d1==d2
		//d1<d2
		
		if (d1>d2) { System.out.println("Nuber "+ d1 + " is larger than "+ d2);

	}
		else if (d1<d2) {System.out.println("Number " + d1 +" is equal to "+d2 );}
		
		else {System.out.println("Numbers are equal.");}
		
		
		int  a =5;
		
		int b=7;
		
		
	//possible situations:
	//1. a==b
		//2.a<b same as b>a
		// 3. b<a same as a> b
		
		
		
		//else if is used for exclusive options: meaning, if one of them is true
		//then all the others are false

		
		if (a==b) {System.out.println("Number "+ a + "is equal to " + b);}
		
		else  if (a<b) {System.out.println("Number " + a + " is less than " + b);}
		
		else  {System.out.println(" Number " + a + " is larger than " + b);}
		
		
		
		
		
		// if we have 
				//1. a == b
				//2. a != b
				
//      if (a == b)
//       {
//					
//				}
//				else //a != b 
//				{
//					
//				}
		
		

}}
