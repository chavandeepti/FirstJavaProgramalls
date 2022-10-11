package Numberofprogrmas;

public class fibonacciseries {
	public static void main(String[] args) 
	
	{
		int n=10;
		int n1=0;
		int n2=1;
		System.out.println("Fibonacci Series 10 is");
		for(int i=1; i<=n; i++)
			
		{
			int n3 = n1+n2;
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = n3;
		}
		
	}
		
	}

