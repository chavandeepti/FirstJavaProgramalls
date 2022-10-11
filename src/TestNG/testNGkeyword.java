package TestNG;

import org.testng.annotations.Test;

public class testNGkeyword 
{
	@Test(priority=2)
	public void TestA()
	{
		System.out.println("testA");
	}
	@Test(priority=1)
	public void TestB()
	{
		System.out.println("TestB");
	}
}
