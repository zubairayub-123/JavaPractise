package EY;

class EmpDetails{
	
	int empId;
	String Name;
	String Designation;
	
	void getDetails(int id, String fname, String role) {
		empId=id;
		Name=fname;
		Designation=role;
	}
	void showDetails() {
		System.out.println("The employee Id is " + empId + " and name is " + Name + " and Designation is " + Designation);
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDetails emp = new EmpDetails();
		emp.getDetails(18, "virat", "kohli");
		emp.showDetails();
		
	}

}
