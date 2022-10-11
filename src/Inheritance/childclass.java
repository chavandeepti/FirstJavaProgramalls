package Inheritance;

public class childclass extends parentclass
{
	public static void main(String[] args) 
	{
		////parents element called by parent object only
//		parentclass x=new parentclass();
//		x.method1();
		
		//inheritance way
		//child class object
				//child is going to use those parent properties
		
		childclass z= new childclass();
		System.out.println(z.a);
		z.method1();
	}

}
