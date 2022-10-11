package ArrayProgrmas;

public class ElementsofArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,20,30,40,50,60,70,80};
//					0	1	2	3	4	6	7
		System.out.println("Elements of Array given ");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
			
		}	
		System.out.println();
		System.out.println("elemnts of reverse order");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + ",");
		}
	}
}

  