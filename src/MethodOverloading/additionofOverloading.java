package MethodOverloading;

public class additionofOverloading 
{
	//passing 2 arguments and same method name
	public static void addition(int x, int y)
	{
		int a=x;
		int b=y;
		int c =a+b;
		System.out.println("addition of two numbers"+c);	
	}
	//passing 3 argumnets and same method name
	public static void addition(int x,int y, int z)
	{
		int a=x;
		int b=y;
		int c=z;
		int d=a+b+c;
		System.out.println("addition of three numbers "+d);
	}
	public static void main(String[] args) 
	{
		addition(10,20);
		addition(10,20,30);
	}
}
