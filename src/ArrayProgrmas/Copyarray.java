package ArrayProgrmas;

public class Copyarray 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= new int [arr1.length];
			for(int i=0; i<arr1.length;i++)
			{
				arr2[i]=arr1[i];
			}
			System.out.println("Elements of new array: ");  
	        for (int i = 0; i < arr2.length; i++) 
	        {   
	           System.out.print(arr2[i] + " "); 
	        }
	}
}
