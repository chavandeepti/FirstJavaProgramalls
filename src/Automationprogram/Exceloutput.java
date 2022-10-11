package Automationprogram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloutput 
{

	public static void main(String[] args) throws IOException
	{
		 String path= "C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\ExcelFilesoutput.xlsx";
			//file open
		   try
		   {
			   FileOutputStream file = new FileOutputStream(path);
				 
			      file.write(65);
				 //sheet read
			      file.close();
				 System.out.println("Writing on Excel file Finished ...");
		   }
				 catch(Exception e)
				 {
					 System.out.println(e);
				 }
		   }
			 
	}


