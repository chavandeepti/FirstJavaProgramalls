package Interface;

public class velocityimpclass implements Velocityinterface
{

	@Override
	public void method2() 
	{
		System.out.println("method 2-incomplete in imp class");
		
	}
	public static void main(String[] args) 
	{
		velocityimpclass x= new velocityimpclass();
		x.method2();
		
		Velocityinterface.method4();
		
		
		
	}
	

}
