package abstraction;
				//child class		//parent class
public class concreteclass extends abstractclass
{
	public void method2()
	{
		System.out.println("complte method");
	}
	
	// main
	public static void main(String[] args) 
	{
		//object create
		concreteclass x= new concreteclass();
		//complte method calling
		x.method1();
		//incomplte method calling-beacuze abstract keyword used
		x.method2();
		
		//static complete
		abstractclass.method4();
		
	}
}
