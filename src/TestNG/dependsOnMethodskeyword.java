package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodskeyword 
{

	@Test()
	public void loginTest()
	{
		System.out.println("loginTest");
		//syntax to fail the TC
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"loginTest"})
	public void addToCartTest()
	{
		System.out.println("addToCartTest");
	}

	@Test()
	public void loginTest1()
	{
		System.out.println("loginTest");
		//syntax to fail the TC
		Assert.assertTrue(true);  //Pass
		Assert.assertTrue(false); //fail
		
		Assert.assertFalse(false); //pass
		Assert.assertFalse(true); //fail
	}

	
}
