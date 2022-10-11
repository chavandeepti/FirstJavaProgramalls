package oopconcept;

public class parentclass 
{
	int a =100;
	
	// non satic
	public void method1()
	{
		System.out.println("ParentClass-method1-non static");
	}
	public static void main(String[] args)
	{
		//non static ahe ..so object create krava laganr
		//normal way elements calling
		parentclass x=new parentclass();
		x.method1();
	}
}
