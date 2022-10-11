package Numberofprogrmas;

public class palindrom {
	
	public static void main(String[] args) {
		
		int rem=0;
		int rev=0;
		int temp;
		int n=151;  // user defined number to be checked for palindrome 
		temp=n;
                    //		reversed integer is stored in variable 
		while(n!=0)
		{
			rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
		}
		if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
		
	}

}
