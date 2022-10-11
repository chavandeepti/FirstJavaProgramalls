package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println(" URL is opened");
		Thread.sleep(3000);
		
      WebElement capitalfile=driver.findElement(By.xpath("//div[@id='box3']"));
      
	  WebElement countryEle = driver.findElement(By.xpath("//div[@id='box103']"));
	  Actions act= new Actions(driver);
	  
	  act.dragAndDrop(capitalfile, countryEle).perform();
	  
	  //action bulid
	  act.dragAndDrop(capitalfile, countryEle);
	   //action perform
	  act.dragAndDrop(capitalfile, countryEle).build().perform();
	
	  act.click().perform();
		 
		 
		 //Action  --> sele interface
		 
		 Action acInterface =act.click().build();
		 //perform method is of Action interface
		 acInterface.perform();
		 //or
         act.click().build().perform();

	}
}
