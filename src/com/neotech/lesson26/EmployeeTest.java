package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		// to get a value from the Employee class, I call a getter
		// to set a value in the Employee class, I call a setter
		emp.setName("Mustafa");
		System.out.println(emp.getName());

		emp.setAge(25);
		System.out.println(emp.getAge());

		emp.setSalary(130000);
		System.out.println(emp.getSalary());

	}

}
