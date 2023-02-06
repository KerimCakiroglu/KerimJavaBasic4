package com.neotech.lesson18;

public class InstanceVariablesDemo {

	public static void main(String[] args) {

		InstanceVariables obj1 = new InstanceVariables();

		System.out.println(obj1.name);

		System.out.println("--------------");

		InstanceVariables obj2 = new InstanceVariables();

		obj2.name = "Sedat";
		System.out.println(obj2.name);

		System.out.println("------------");

		System.out.println(obj1.name);
	}

}
