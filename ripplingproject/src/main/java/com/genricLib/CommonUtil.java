package com.genricLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class CommonUtil {
	public String getData(String Sheetnum,int RowNum,int ColNum) throws Throwable  {
		String path = "./src/test/resources/data/TestData.xlsx";
		//get the location of the xmls file
				
		FileInputStream fls = new FileInputStream(path);
				//open workbook in read
				Workbook wb = WorkbookFactory.create(fls);
				//get the control of sheet2
				Sheet sh = wb.getSheet(Sheetnum);
				//get the control in sheet 3 in row
				Row row = sh.getRow(RowNum);
				//read date from 2,3,4 col
				String data = row.getCell(ColNum).getStringCellValue();
				return data;
	}
		
	 public Properties getdropdataObj() throws Throwable{
		String path = "./src/test/resources/data/testdata.properties";
		FileInputStream fls1 = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fls1);
		
		return prop;
		
	}	
}
