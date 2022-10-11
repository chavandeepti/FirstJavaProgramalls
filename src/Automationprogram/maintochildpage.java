package Automationprogram;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class maintochildpage 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("https://vctcpune.com/");
		
		//main page adress
//		String mainPageAddress = driver.getWindowHandle();
//		System.out.println("ParentPage address-->"+mainPageAddress);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		
		WebElement startSeleniumPractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		startSeleniumPractice.click();
		
		//child page 
		//switch the selenium from parentPage to child Page
		
		//address of all -> parentPage + childPage
		
		//casting
//		int x = 100;
//		double y= (double)x;
		
		//Set --> List
		//we are geeting random values here.
		//hence we r not using this concept
//		Set<String> allPageAddresses= driver.getWindowHandles();
		
		
		List<String> allPageAddresses = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println("allPageAddresses are->"+allPageAddresses);
		
		//need to switch on childPage
		//hence pass child page address

		driver.switchTo().window(allPageAddresses.get(1));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textBox.sendKeys("Velocity o4th JuneBatch");
	
		System.out.println("end of program");
	}
}

