package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean goodWithNumbers;

	public void teachesMath() {
		System.out.println(fullName + " teaches Math!");
	}

	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher();
		mt.fullName = "Elion L.";
		mt.major = "Math";
		mt.goodWithNumbers = true;

		mt.teaches();
		mt.teachesMath();
	}
}
