package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.firstName = "Kerim";
		s1.lastName = "Cakiroglu";
		s1.school = "Neotech";
		s1.gender = 'M';
		s1.studenId = 1212;
		s1.grade = 'A';

		s1.study();
		s1.doHomework();

		System.out.println("===========================");

		s2.firstName = "Mert";
		s2.lastName = "Ucmer";
		s2.school = "Neotech Academy";
		s2.studenId = 1211;
		s2.grade = 'B';
		s2.gender = 'M';

		s2.doHomework();
		s2.study();

	}

}
