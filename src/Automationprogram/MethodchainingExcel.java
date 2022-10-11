package Automationprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodchainingExcel 
{
	public static void main(String[] args) throws IOException 
	{
		 String path= "C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\ExcelFile.xlsx";
			//file open
			 FileInputStream file = new FileInputStream(path);
			 // workbook read
			 XSSFWorkbook wb = new XSSFWorkbook(file);
			 //sheet read
//			XSSFSheet sht=wb.getSheet("dvm");
			
			//name user
//			XSSFRow	rw=	sht.getRow(0);
//			XSSFCell cl=rw.getCell(0);
//			String username=cl.getStringCellValue();
//			System.out.println("username is ->"+username);
	
	
			// method chaining
		String username=wb.getSheet("dvm").getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);
		
		String password=wb.getSheet("dvm").getRow(1).getCell(0).getStringCellValue();
		System.out.println(password);
		
		//numric value
		
		double result= wb.getSheet("dvm").getRow(1).getCell(1).getNumericCellValue();
		int res=(int)result;
		System.out.println(res);
			
	
	
	
	}
}
