package ArrayProgrmas;

public class Largestandsmallest 
{
	public static void main(String[] args) 
	{
//		int [] arr= {22,20,45,500,60,70};
//		int max=0;
//		System.out.println("The Given Array is:");
//		for(int i=0;i<arr.length; i++)
//		{
////		 Compare elements of array with max
//			if(arr[i] > max)
//			{
//				max=arr[i];
//			}
//			System.out.println(arr[i]);
//		}
//		System.out.println("The Largest Number is:" + max);	
//		
//		
		
		// smallest
		
		int [] arr= {22,20,45,500,60,70};
		//Initialize min with first element of array.  
		int min=arr[0];
//		System.out.println("The Given Array is:");
		for(int i=0;i<arr.length; i++)
		{
			 //Compare elements of array with min 
			if(arr[i] < min)
			{
				min=arr[i];
			}
//			System.out.println(arr[i]);
		}
		System.out.println("The smallest Number is:" + min);
	}
}
