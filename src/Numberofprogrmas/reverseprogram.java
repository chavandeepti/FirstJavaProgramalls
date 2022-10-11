package Numberofprogrmas;

public class reverseprogram 
{
	public static void main(String[] args) 
	{
		int n= 13589;
		int rev=0;
		 while(n!=0)
		 {
			 int rem=0;
			 rem= n%10;
			 rev=(rev*10)+rem;
			 n=n/10;
		 }
		 System.out.println(rev);
	}
}
