package Automationprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
        driver.get("https://text-compare.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        WebElement text1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		text1.sendKeys("Hi deepti");
		 Actions act =new Actions(driver);
		 
		 //Select All
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
//		 Thread.sleep(2000);
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("c");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
//		 Thread.sleep(2000);
		 
//		 driver.get("https://text-compare.com");
		WebElement text2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		text2.click();
		Thread.sleep(2000);
		
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("v");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
//		 Thread.sleep(2000);
		 WebElement compare =driver.findElement(By.xpath("//div[text()='Compare!']"));
		 compare.click();
		 
		 WebElement result = driver.findElement(By.xpath("//span[@class='messageForUser']"));
		 String actualResult= result.getText();
		 
		 String expectedResult = "The two texts are identical!";
		 if(expectedResult.equals(actualResult))
			{
				System.out.println("TC is passed");
			}
			else
			{
				System.out.println("TC is failed");
			}

	}
	
}
