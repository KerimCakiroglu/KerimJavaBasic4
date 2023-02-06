package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {

	boolean teachesApChemistry;

	public void doesExperiment() {
		System.out.println(fullName + " does CHEMISTRY experiments");
		System.out.println(fullName + " teaches AP Chemistry: " + teachesApChemistry);
	}

	public static void main(String[] args) {

		ChemistryTeacher ct = new ChemistryTeacher();
		ct.fullName = "Walter White";
		ct.major = "Chemistry";
		ct.teachesApChemistry = true;

		ct.teaches();
		ct.doesExperiment();

	}
}
