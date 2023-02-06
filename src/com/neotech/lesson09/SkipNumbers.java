package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {

		//print number 1 to 10 --- skip 3,6 and 9 
		
		for (int i = 1; i<=10;i++) {
			
			if (i==3||i==6||i==9) {
				continue;
				
			}
			
			
			System.out.println(i);
		}
		
		
		
		
		//print numbers from 20 to 30 -- skip 23 to 28
		
		for (int m = 20; m <= 30; m++) {
		if (m >= 23 && m <= 28) {
							continue;
						}
			System.out.println(m);
					}
		
		
	}

}
