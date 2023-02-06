package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {

		// where is the file that i want to read

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		// Read the workbook(the whole excell file)

		Workbook book = new XSSFWorkbook(filePath);

		// Access the sheet that you want
		Sheet sheet = book.getSheet("TestData");

		// Access a certain row
		Row row = sheet.getRow(0);

		//
		// Acces a certain cell

		Cell cell = row.getCell(1);

		// Getting data from the cell
		String info = cell.toString();
		System.out.println(info); // LastName

		// how do u get NY

		// I am on the testData sheet

		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		String cellValue = cell3.toString();
		System.out.println(cellValue);

		// Garfield?? how to get
		String cellCity = sheet.getRow(1).getCell(2).toString();
		System.out.println(cellCity);

		// how to get numerical values

		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);

		// downcast to int
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);

		// can i get same zip code as a string
		String zipCode = sheet.getRow(1).getCell(4).toString();
		System.out.println(zipCode);

	}

}
