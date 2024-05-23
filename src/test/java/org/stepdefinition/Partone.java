package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Partone {
	public static void main(String[] args) throws IOException {
		// 1.Excel sheet path set
		File f = new File("D:\\dv\\Datadriven2\\Excel\\Createdfiles.xlsx");

		// 2.to read the file
		FileInputStream fis = new FileInputStream(f);

		// 3.to read the .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);

		// 4.get sheet from workbook
		Sheet sheet = wb.getSheet("write");

		// 5.get row from sheet
		Row r = sheet.getRow(4);

		// 6.get cell from row
		Cell c = r.getCell(2);

		System.out.println(c);
	}
}
