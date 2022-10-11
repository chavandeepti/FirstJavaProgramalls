package MethodOverloading;

public class Methodover
{
	public static void mathod()
	{
		System.out.println("zero arguments");
	}
	
	public static void mathod(int x)
	{
		System.out.println("with arguments");
	}
	
	public static void mathod(char x)
	{
		System.out.println("with character");
	}
	public static void mathod(char x, char z)
	{
		System.out.println("with character double parametrs");
	}
	//combination arguments passs
	public static void mathod(int x, char z)
	{
		System.out.println("double and differnt data type");
	}
	//multiple afrguments pass
	public static void mathod(int a, int b, int c, int d, int e)
	{
		System.out.println("five arguments");
	}
	public static void main(String[] args)
	{
		//satic directly call
		mathod();
		mathod(10);
		mathod('A');
		mathod('Q','B');
		mathod(10, 'R');
		mathod(11,20,30,40,50);
	}
}
