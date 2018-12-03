package com.actitime.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eceldata
{
public static String getData(String filepath,String sheetName,int r,int c)
{
 try
 {
	 FileInputStream file=new FileInputStream(filepath);
	 Workbook wb=WorkbookFactory.create(file);
	 String data=wb.getSheet(sheetName).getRow(r).getCell(c).toString();
	 return data;
 }
 catch(Exception e)
 {
	 return " " ;
 }
}
}
