package EY;

import java.util.Scanner;
//class Student
//{
//	int studentId;
//	String studentFirstName;
//	String studentLastName;
//
//	void addDetails(int id,String firstName,String lastName)
//	{	
//		studentId=id;
//		studentFirstName=firstName;
//		studentLastName=lastName;
//
//	}
//	void printDetails()
//	{
//		System.out.println(studentId);
//		System.out.println(studentFirstName);
//		System.out.println(studentLastName);
//	}
//
//}
class Hello
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id");
		int id=sc.nextInt();
		System.out.println("Enter the student first name");
		String fname=sc.next();
		System.out.println("Enter the student last name");
		String lname=sc.next();

		Student std = new Student();
//		std.addDetails(id,fname,lname);
//		std.printDetails();
			
	}
}