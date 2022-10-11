package Numberofprogrmas;

public class gcd // grestest  value for divisble by two numbers by common
{
	public static void main(String[] args) 
	{
		int n1=10;
		int n2= 8;
		int gcd=1;
		for(int i=1; i<=n1 && i<=n2 ;i++)  //1,2,3,4,5,6,7,8
			{
			if(n1%i==0 && n2%i==0)//gcd= 2
			{
				gcd=i;						
			}
		}
		System.out.println("gcd of n1 and n2 is"  +gcd);
		
	}
}
