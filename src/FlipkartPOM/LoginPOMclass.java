package FlipkartPOM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{
	// driver declared
	private WebDriver driver;
	
	//element find
	@FindBy(xpath="//a[@class='_1_3w1N']")
	WebElement loginpage;
//	Alert alt =driver.switchTo().alert();
	
	//ok button clcik
//		alt.loginpage();
	
	//create method
	public void sendlogin()
	{
		loginpage.click();
	}
	
	@FindBy(xpath="//input[@class='_-8IX_2- VJZDxU']")
	WebElement username;

	public void sendusername()
	{
		username.sendKeys("8123297611");
	}
	
	@FindBy(xpath="//input[@class='_-8IX_2- _3mctLh VJZDxU']")
	WebElement password;

	public void sendpassword()
	{
		username.sendKeys("Deepti@18");
	}
	
	@FindBy(xpath="//input[@class='_-8IX_2- _3mctLh VJZDxU']")
	WebElement buttonlogin;

	public void buttonlogin()
	{
		buttonlogin.click();
	}
	 //create constructor
	  public LoginPOMclass(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
}
