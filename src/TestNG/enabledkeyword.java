package TestNG;

import org.testng.annotations.Test;

public class enabledkeyword
{
	@Test(priority=3)
	public void testA()
	{
		System.out.println("TestA");
	}
	@Test(priority=2,invocationCount=0)
	public void testB()
	{
		System.out.println("TestB");
	}
	@Test(priority=1,enabled=false)
	public void testc()
	{
		System.out.println("TestC");
	}
}
