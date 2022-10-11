package Arrayconcept;

public class secondlargestnumber 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,9,11,15,3};
		int temp;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]<a[j])
	    		{
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
		    }
	    	
	    }
	    System.out.println("second largest number is "+a[1]);
	}
}
