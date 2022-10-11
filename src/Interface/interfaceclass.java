package Interface;

public interface interfaceclass
{
	//its not class
	//it is not possible satic and non satic method
//	complete method -not poassible
	
//	public void method1()
//	{
//		System.out.println("complete method not possible");
//	}
//	
	// incomplet method
  public abstract void method1();
	//incomplete -abstract
	//not necessary
	//by nature- public , abstrct used
	
void method2();
	
	//main method
	 public static void main(String[] args) 
	 {
		 //calling method1 and method2 like static
		// method1(); //not possible
		// method2();//not possible
		 
		 //call nonstatic method
		// interfaceclass x= new interfaceclass();
	}
}
