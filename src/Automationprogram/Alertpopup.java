package Automationprogram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Alertpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		System.out.println("url is opened");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement click1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		click1.click();
		System.out.println("Click1 me ");
		Thread.sleep(4000);
		//alert will come
		
		Alert alt =driver.switchTo().alert();
		
		//ok button clcik
		alt.accept();
		
		WebElement click2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		click2.click();
		System.err.println("Click2 me");
		
		Thread.sleep(4000);
		
		Alert alt1= driver.switchTo().alert();
		alt1.accept();
		
		System.out.println("end of program");
		
		
		
		}
}
