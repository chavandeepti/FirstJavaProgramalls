package ArrayProgrmas;

public class ArrayEven 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,5,6,7,8};
		System.out.println("Even numbers are");
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i]%2==0)
			{
				
			System.out.println(arr[i]);
			}
		}
		System.out.println("odd numbers are");
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i]%2!=0)
			{
			
			System.out.println(arr[i]);
			}
		}
	}
}
