package casting;

public class chlidclass extends parentclass
{
	public void method3()
	{
		System.out.println("method3-childclass");
	}
	public void method4()
	{
		System.out.println("method4-childeclass");
	}
	public static void main(String[] args) 
	{
		// normal way calling
//		parentclass x=new parentclass();
//		x.method1();
//		x.method2();
//		
//		chlidclass y=new chlidclass();
//		y.method3();
//		y.method4();
		
		//Inheritacance way
		//child class object-inheritacce always

		chlidclass x=new chlidclass();
		x.method1();//parentclass
		x.method2();//parentclass
		
		x.method3();//childclass
		x.method4();//childclass
		
		//upcasting will happen only for parent class methods only
				//not of the child class
		
		// upcasting way
		parentclass z=new chlidclass();
		z.method1();//parentclass
		z.method2();//parentclass
		
		z.method3();//childclass-not possible
		z.method4();//childclass-not possible
		
				

		
		
		
		
	}
}
