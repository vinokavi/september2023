package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper  {
//excel location method--------------like screenshots
	//private void readData(String fileName) {
	//File f = new File("C:\Users\ADMIN\eclipse-workspace\MavenPackage\ExcelSheets\ "+fileName+" .xlsx")
//	}
	
	//sheetName,int rowNo,int cellNo,String cellValue
	
//1.write in a new File
	
	public static void writeInNewFile(String fileName,String sheetName , int rowNo, int cellNo, String cellValue ) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		Workbook bk = new XSSFWorkbook();
		Sheet sh = bk.createSheet(sheetName);
		
		Row r = sh.createRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(cellValue);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		bk.write(fout);
	}
//2.Write in New Row	
	public static void writeInNewRow(String fileName,String sheetName,int rowNo,int cellNo,String cellValue ) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fin);
		
		Sheet sh = bk.getSheet(sheetName);
		
	    Row r = sh.createRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(cellValue);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		bk.write(fout);
	}
	
	
//3.Write in New Sheet---------existing file
	public static void writeInNewSheet(String fileName,String sheetName,int rowNo,int cellNo,String cellValue ) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		
		FileInputStream fn = new FileInputStream(f);	
		
		Workbook bk = new XSSFWorkbook(fn);
		
		Sheet sh = bk.createSheet(sheetName);
		
		Row r = sh.createRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(cellValue);
		
		FileOutputStream fout = new FileOutputStream(f);
		
		bk.write(fout);
	}
		
//4.Write a New Cell----------existing file	
	
	public static void writeNewCell(String fileName,String sheetName,int rowNo,int cellNo,String cellValue ) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fin);
		
		Sheet sh = bk.getSheet(sheetName);
	
	    Row r = sh.getRow(rowNo);
	
	    Cell c = r.createCell(cellNo);
	
	    c.setCellValue(cellValue);
	
	FileOutputStream fout = new FileOutputStream(f);
	
	bk.write(fout);
	
	}
	
	
	
//5.	
	public static String readData(String sheetName , int rowNo , int cellNo, String fileName ) throws IOException {

File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		
		
		FileInputStream fin = new FileInputStream(f);
		
		
		Workbook bk = new XSSFWorkbook(fin);

	    Sheet sh = bk.getSheet(sheetName);
		
		Row r =sh.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int type = c.getCellType();
		
		String input = "";
		
		if (type ==1) {
			
			input = c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM-dd,yyyy");
			 input = sim.format(da);
		}
		
		else {
			
			double d = c.getNumericCellValue();
			long l = (long)d;
			input = String.valueOf(l);
		}
		
		return input;
		
		
	}
	
	//here string execution processed.so we gave String to rplace void in mainmethod.
	//if date execution processed----------int will replace void in mainmethod
	//long
	
	//among these 3----------if,elseif,else-----one will execute for sure.
		
	


//6.Updated----Cell value----[set cell value]

	
	public static void updatedCellValue(String fileName,String sheetName ,int rowNo,int cellNo,String value) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenPackage\\ExcelSheets\\"+fileName+".xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook bk = new XSSFWorkbook(fin);
		
		Sheet sh = bk.getSheet(sheetName);
		
		Row r = sh.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		String stringCellValue = c.getStringCellValue();
		
		c.setCellValue(value);
		
		//or
		
		//we use if ,else if statement instead of[setcellvalue]
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

































