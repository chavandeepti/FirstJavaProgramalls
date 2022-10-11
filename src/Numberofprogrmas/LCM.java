package Numberofprogrmas;

public class LCM
{
	public static void main(String[] args)
	{
		int n1=10,n2=30;
		int h=1,l;
		int i;
		for(i=1;i<=n1;i++)
		{
			if(n1 % i==0 && n2 % i==0)
				h=i;			
		}
		l=(n1*n2)/h;
		System.out.println("LCM is-"+l);
		
	}

}
