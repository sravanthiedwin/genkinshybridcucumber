package com.seleniumutils;
//To get data from specific row and cell this program will work

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
		FileInputStream fil;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		
		public void excelDataconfig(String Xlpath) throws IOException {
			try{
				File fs=new File(Xlpath);
				fil=new FileInputStream(fs);
				workbook=new XSSFWorkbook(fil);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		}
		
				
		public void getCelldata(String Sheetname,int a) throws IOException {
			sheet=workbook.getSheet(Sheetname);
			int rowcount=sheet.getLastRowNum();
			int columncount=sheet.getRow(0).getLastCellNum();
			
			String value=sheet.getRow(a).getCell(0).getStringCellValue();
			String value1=sheet.getRow(a).getCell(1).getStringCellValue();
			
			workbook.close();
			fil.close();
			}
		}



