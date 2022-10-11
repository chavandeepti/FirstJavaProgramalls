package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg5 
{

	@BeforeMethod
	public void setUp()
	{
		System.out.println("brwser-url-loginActivity");
	}
	
	@Test
	public void verfiyLogin()
	{
		System.out.println("valdiation-VerifyLogin");
	}
	
	@Test
	public void verfiyLogOut()
	{
		System.out.println("validation-VerifyLogOut");
	}
	
	@Test
	public void verfiyBagProduct()
	{
		System.out.println("validation-VerifyBagProduct");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("brwser close");
	}
	

}
