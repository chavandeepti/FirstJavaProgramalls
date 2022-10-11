package Automationprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelprogram 
{
	public static void main(String[] args) throws IOException 
	{
		// file adress
		 String path= "C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\ExcelFile.xlsx";
		//file open
		 FileInputStream file = new FileInputStream(path);
		 // workbook read
		 XSSFWorkbook wb = new XSSFWorkbook(file);
		 //sheet read
		XSSFSheet sht=wb.getSheet("dvm");
		// row read
		XSSFRow rw=sht.getRow(0);
		//cell read
		XSSFCell cl=rw.getCell(0);
		//data read
		String result = cl.getStringCellValue();		
	    System.out.println(result);
	    
	    

	
	}
}
