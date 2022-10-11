package firstpackage;

public class StudentDataPrint {
	
	public static void main(String[] args) {
		
		//student data print
//		studentName = Rahul';    -->String
//	    studentRollNumber = 116; -->byte,short,int,long
//		studentMobileNumber=9850441230; -->int,long
//		studentEmailId = abc123@gmail.com; -->String
//		studentBloodGroup = A;  -->char
//		isCoronaTestPositive -->true/false -->boolean
		
		 String studentName = "Kishori chavan";
		 int studentRollNumber = 116;
		 long studentMobileNumber=9850441230L;
		 String studentEmailId= "abc123@gmail.com";
		 char studentBloodGroup = 'A';
		 boolean isCoronaTestPositive= false;
		 
		 
		System.out.println("Student name is = " +studentName );
	    System.out.println("student Roll number is = " +studentRollNumber  );
		System.out.println("student MobileNumber is =" +studentMobileNumber);
		System.out.println("studentEmailId is =" +studentEmailId);
		System.out.println("studentBloodGroup= " +studentBloodGroup);
		System.out.println("isCoronaTestPositive=" +isCoronaTestPositive);
		
	}

}
