package com.neotech.lesson09;

public class BreakAndContiniue {

	public static void main(String[] args) {
		
		
		for(int i =1; i<=10;i++) {
			//when i becomes 5, break statement will execute 
			//and get out of the loop.
			
			if(i==5) {
				break;
			}
			
			
			System.out.println(i);
		}
		
		
		System.out.println("==============");
		
		
		for (int i =1; i<=10;i++) {
			
			if (i==5) {
				continue; //skip the number
				
			}System.out.println(i);
		}
	}
	
	
}
