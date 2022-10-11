package Numberofprogrmas;

public class prime {

	public static void main(String[] args)
	{
//display prime number
		
		int n=7;
		int a=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				a = a+1;
			}
		}
		if(a==0)
		{
			System.out.println(" prime number is " + n);
		}
		else
		{
			System.out.println("Not prime number is " + n);
		}
		
		// 1- 100 prime number
		
//		for(int i=1;i<=100;i++)		// number ki value 1 se start hogi
//		{
//			int temp=0;
//			for(int j=2; j<i-1;j++) 
//			{
//				if(i%j==0)				// then check krega ki j value ke sath divisble he kya nhi
//				{							// agar hey to temp ki value incremnet hogi			
//				temp=temp+1;
//				}								// agar value incremment nhi hoi to
//			}
//			if(temp==0)					
//			{
//				System.out.println(i);				// number ko print krvayga
//			}
//		}
		
		
		
		 
	}
}
