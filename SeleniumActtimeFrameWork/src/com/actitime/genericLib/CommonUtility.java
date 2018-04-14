package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonUtility {
  public String getExcelData(String sheetnum , int rownum, int cellnum) throws Throwable{
	  FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	  Workbook  wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(sheetnum);
	  Row row = sh.getRow(rownum);
	  String data = row.getCell(cellnum).getStringCellValue();
	return data;
	  
  }
  public Properties getpropertiesData() throws Throwable{
	  FileInputStream fis = new FileInputStream("./data/TestData.properties");
	  Properties pro = new Properties();
	  pro.load(fis);
	return pro;
		
		  
	  }
  
}
