package EY;

class Student{
	int RollNo;
	String Name;
	char Section;
}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {45,18,7,33,99};
//		
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
		
//		 int arr1[] =new int[10];
		 
		Student std = new Student();
		std.RollNo=18;
		std.Name="Virat Kohli";
		std.Section='B';
		
		Student std1 = new Student();
		std1.RollNo=45;
		std1.Name="Rohit Sharma";
		std1.Section='A';
		
		Student std2 = new Student();
		std2.RollNo=7;
		std2.Name="Dhoni";
		std2.Section='A';
		
		Student stdArr[] = new Student[3];
		
		stdArr[0] = std;
		stdArr[1] = std1;
		stdArr[2] = std2;
		
		for(Student stu : stdArr){
			System.out.println(stu.RollNo + " " + stu.Name + " "+ stu.Section);
		}
		
		
		
		
		
	}

}
