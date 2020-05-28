package com.seleniumutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	 XSSFRow row;
   File src;
	
	public Object[][] readData(String excelPath, String sheetName) throws IOException {
		//ReadData(string excelpath,String sheetname),so that we can pass that in our testcase.
	    try { 
	     File src=new File(excelPath);
	     FileInputStream finput = new FileInputStream(src);
	     workbook = new XSSFWorkbook(finput);
	     sheet= workbook.getSheet(sheetName);
	    
	     
	    }
	    catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	    int rowcount = sheet.getLastRowNum();//gets rowcount
	    
		 int cellcount =sheet.getRow(0).getLastCellNum();
	    
		 Object[][] data = new Object[rowcount][cellcount] ;
	    	    
	     for(int i=1; i<=rowcount ; i++)
	     {
	    	 for( int j =0 ;j<cellcount ;j++)
	         { 
	    		 cell = sheet.getRow(i).getCell(j); 
	             if(cell.getCellType()==CellType.STRING) {
	            	 data[i-1][j] = cell.getStringCellValue(); 
	             } else if(cell.getCellType()!=CellType.STRING) {
	            	 cell.setCellType(CellType.STRING);
	            	 data[i-1][j] = cell.getStringCellValue(); 
	             }
	    		

}
	    	 }
	     return data;
	     }
}
