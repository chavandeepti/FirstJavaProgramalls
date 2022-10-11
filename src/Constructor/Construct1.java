package Constructor;

public class Construct1 
{
	int x;  // varible decalration
	int y;
	
	public Construct1()
	{
		x=10;  // intialize the value
		System.out.println(x);
		y=20;
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		//calling of constructor
//		Construct1();  //not possible
		
		//create object
		
		//const call-->object call--object syntax
		Construct1 p=new Construct1();
		
		
	}
}
