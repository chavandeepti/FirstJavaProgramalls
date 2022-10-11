package Automationprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe 
{
	public static void main(String[] args) 
	{
		//path configuration
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//browser opning
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//switch to iframe
		
        WebElement iframe= driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(iframe);
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        dropdown.click();
        
        Select s=new Select(dropdown);
        s.selectByValue("big baby cat");
        System.out.println("end of program");
	}
}
