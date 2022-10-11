package Automationprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    //single data fetch
        WebElement result=driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
        	String Celldata=result.getText();
        	System.out.println(Celldata);
        	
        	
        List<WebElement> theaders=driver.findElements(By.xpath("//table//tbody//tr//th"));
        System.out.println("total numbers are->"+theaders.size());
        
        for(int i=0;i<theaders.size(); i++)
        {
        	System.out.println(theaders.get(i).getText());
        }
        
        List<WebElement> allcelldata= driver.findElements(By.xpath("//table//tbody//tr//td"));
         System.out.println("totalcells are->"+allcelldata);  
         for(int i=0; i<allcelldata.size();i++)
         {
        	 WebElement cell=allcelldata.get(i);
        	String celldata=cell.getText();
        	System.out.println(celldata);
         }
	
	}
}
