package ConstructorOverloading;

public class constOver
{
	int a;
	int b;
	public constOver()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public constOver(int x)
	{
		int a=100;
		int b=300;
		System.out.println(a+b);
	}
	public constOver(int x, int y)
	{
		a=x;
		b=y;
	System.out.println(a+b);
	}
	public constOver(char z, int x)
	{
		char a='a';
		a=10;
		System.out.println("differnt arguments");
	}
	public static void main(String[] args) 
	{
		constOver x=new constOver();
		constOver y=new constOver(10);
		constOver z=new constOver(10,20);
		constOver r=new constOver('B',10);
	}

}
