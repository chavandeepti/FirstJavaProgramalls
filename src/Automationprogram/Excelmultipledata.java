package Automationprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelmultipledata 
{
	public static void main(String[] args) throws IOException 
	{
	    String path= "C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\ExcelFile.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
	   	XSSFSheet sht=wb.getSheet("dvm");
		
	   	//ROw data and  clumn
	   	//R-0-3 and c-0-1
	   	
//	   	for(int i=0;i<=3;i++)
//	   	{
//	   		for(int j=0;j<=1;j++)
//	   		{
//	   			XSSFRow rw=sht.getRow(i);
//	   			XSSFCell cl=rw.getCell(j);
//	   			String res=cl.getStringCellValue();
//	   		    System.out.println("result is->"+res);
//	   		}
//	   	}
	   	
		for(int i=0;i<=3;i++)
	   	{
	   		for(int j=0;j<=3;j++)
	   		{
	   			XSSFRowNum rw=sht.getLastRowNum(i);
	   			XSSFCellNum cl=rw.getLastCellNum(j);
	   			String res=cl.getStringCellValue();
	   		    System.out.println("result is->"+res);
	   		}
	   	}
	}
}
