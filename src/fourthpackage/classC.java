package fourthpackage;

import thirdpackage.classA;

public class classC 
{
  public static void main(String[] args) 
  {
	  System.out.println(classA.a);
	  classA.method1();
      
	  classA x = new classA();
		classA.out.println(x.b);
      x.method2();

      //not working bcz proteted access 
}
}
