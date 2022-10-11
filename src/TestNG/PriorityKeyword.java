package TestNG;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@Test
	public void TestA()
	{
		System.out.println("TestA");
	}
	@Test(priority=1)
	public void TestB()
	{
		System.out.println("TestB");
	}
	@Test(priority=1)
	public void TestC()
	{
		System.out.println("TestC");
	}
	@Test(priority=0)
	public void TestD()
	{
		System.out.println("TestD");
	}
	@Test(priority=-1)
	public void TestE()
	{
		System.out.println("TestE");
	}
}
