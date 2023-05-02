package EY;

class A{
	A(){
		 System.out.println("It is a constructor");
	}
	public void show() {
		System.out.println("It is a method");
	}
}

public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new A().show(); // calling method with anonymous object
	}

}
