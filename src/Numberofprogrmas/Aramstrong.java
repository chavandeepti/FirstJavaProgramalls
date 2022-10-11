package Numberofprogrmas;

public class Aramstrong 
{
	public static void main(String[] args) 
	{
		int no = 370;
		int temp = no;
		
		int rev=0;
		int rem=0;
		
		while(no!=0)
		{
			rem=no%10;
			rev=rev+rem*rem*rem;
			no=no/10;
		}
	
		if(temp == rev) 
			System.out.println("Armstrong number is = "+rev);
		else
			System.out.println("Not Armstrong number is = "+rev);
		
	}
}	
