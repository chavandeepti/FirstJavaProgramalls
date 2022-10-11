package ZerodhaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginZerodha 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("MP6449");
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("Aaisaheb@1234");
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement login;
	
	public void loginbutton()
	{
		login.click();
	}
////

	@FindBy(xpath="//input[@label='PIN']")
	private WebElement pin;
	
	public void sendpin()
	{
		pin.sendKeys("123456");
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement continue1;
	
	public void continuebutton()
	{
		continue1.click();
	}
	public LoginZerodha(WebDriver driver)
	{
		this.driver=driver;
	
	PageFactory.initElements(driver,this);
	}
}

