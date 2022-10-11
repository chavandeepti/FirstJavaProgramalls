package AllConceptProgram;

public class AllconceptShort 
{
	String name;
	int rollNo;
	int mobileNo;
	String emailID;
	
	//common data declare n initialize at a time only
		static String batchNo = "04thJune";
		// first constructor //non satic 
		public AllconceptShort()
		{
			name ="RAHUL";
			rollNo=122;
			mobileNo=123456;
			emailID="rahul123@gmail.com";          
		}
		// second constructor // non satic
		public AllconceptShort(int x)
		{
			name ="Akshay";
			rollNo=125;
			mobileNo=456789;
			emailID="akshay123@gmail.com";	
		}
		// method decleare
		//method for data print purpose
		
		public void printStudentData()
		{
			System.out.println("Name is- "+name
			           +" rollNo is- "+rollNo
			           +" mobileNo is- "+mobileNo
			           +" emailId is- "+emailID
			           +" batchNo is- "+batchNo); 
		}
		

		public static void main(String[] args) 
		{
			AllconceptShort R=new AllconceptShort();
			R.printStudentData();
			 
			AllconceptShort Q=new AllconceptShort(10);
			Q.printStudentData();
		}

}
