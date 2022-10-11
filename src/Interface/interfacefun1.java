package Interface;
				//child class
public class interfacefun1 implements Interfacefun
{

	@Override
	public void checkfun() 
	{
		System.out.println(" check function1");
	}

	@Override
	public void checkfun2() 
	{
		System.out.println("check fun2");
	}
	public static void main(String[] args) 
	{
		interfacefun1 x=new interfacefun1();
		x.checkfun();
		x.checkfun2();
		
		// method overrding
		//child will decide the implementtion
	}
		
}
