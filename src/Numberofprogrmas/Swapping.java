package Numberofprogrmas;

public class Swapping 
{
	public static void main(String[] args) 
	{
		// 1. swapping of two numbers with third variable
//		int a= 10;
//		int b= 20;
//		int c;
//		c=a;//c=10
//		a=b;//20
//		System.out.println("a after swapping-"+a);
//		b=c;//10
//		System.out.println("b after sawpping-"+b);
		
	
	//2.swapping of two numbers without third variable
	
	int a=10;
	int b =20;
	
	a=a+b;//10+20=30
	b=a-b;//30-20=10
	System.out.println("b after swapping- "+b);
	a= a-b;    //30-10 = 20
	System.out.println("a after swaping- "+a);

	}
	
	
}
