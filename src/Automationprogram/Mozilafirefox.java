package Automationprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilafirefox 
{
	 public static void main(String [] args)
	 {
		 System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	    	driver.get("https://www.google.com/");

	 }
}
