package Automationprogram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
         driver.get("https://vctcpune.com/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");
//		
//		js.executeScript("window.scrollBy(1000,0)");
//		
//		js.executeScript("window.scrollBy(-1000, 0)");
//		

	}
}
