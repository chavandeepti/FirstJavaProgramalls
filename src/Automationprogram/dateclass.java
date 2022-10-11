package Automationprogram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclass 
{
	public static void main(String[] args) 
	{
		Date d= new Date();
		System.out.println(d);
		
		DateFormat d1= new SimpleDateFormat("MM-dd-yy & hh-mm-ss");
		String date =d1.format(d);
		System.out.println(date);
	}
}
