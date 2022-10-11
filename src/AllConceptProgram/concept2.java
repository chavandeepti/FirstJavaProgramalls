package AllConceptProgram;

public class concept2 
{
	String name;
	int rollNo;
	int mobileNo;
	String emailID;
	String batchNo;
	
	public concept2()
	{	
		System.out.println("Name is- "+name
			+"roll no is- "+rollNo
			+"mobile no is - "+mobileNo
			+"emailId is- "+emailID
	        +"batchNo is- "+batchNo);
	}
	
	public concept2(int x) 
	{
		
		System.out.println("Name is- "+name
		          +" rollNo is- "+rollNo
		           +" mobileNo is- "+mobileNo
		           +" emailId is- "+emailID
		           +" batchNo is- "+batchNo);
	}
	public static void main(String[] args)
	{
		concept2 R=new concept2();
		concept2 Q=new concept2(2);
		
	}


}
