package Automationprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframecheckbox 

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
		
        WebElement iframe= driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(iframe);
                
        WebElement iframe1= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(iframe1);
        
        WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();
        
        System.out.println("end of program");

   }
}
