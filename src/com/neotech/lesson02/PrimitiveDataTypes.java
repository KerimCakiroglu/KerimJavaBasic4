package com.neotech.lesson02;

public class PrimitiveDataTypes {
	
	public static void main(String[]args) { 
		
		byte hakan = 9; //The range is -128 to 127, total of 256 different value
		
		//complier will give error
		//byte baris = 145;
		
		short hakan2 = 2457; // range -32768 to 32767
		
		//complier will give an error beacues of decimal number
		//short var4 = 35.6;
		
		int viktor = 23497234; // the range -2billion to 2billion
		int esat = 3; //yes i can store small number in an int
		
		// if the number bigger than2 billion we have to use long
		// if the number bigger than 2billion we have to use L at the end
		long elionBankBalance = 9230432905204320L ;
		
		System.out.println(elionBankBalance);
		
		
		//to store decimal numbers we use float or double
		float rahime = 23.456F; // you must use F or f at the end
		
		double rahime2 = 23.456; // you DON'T need F at the end
		
		System.out.println(rahime);
		System.out.println(rahime2);
		
		//to store a single character we use char
		char var3 = 'P';
		char var4 = '%';
		char var5 = 'p';
		char var6 = ' '; //this is the space
		
		//complier will give an error
		// char var7 = 'gg';
		
		// to store boolean
		boolean ahmet = false;
		
		
		
		
		
		
		
		
		
		
	}

}
