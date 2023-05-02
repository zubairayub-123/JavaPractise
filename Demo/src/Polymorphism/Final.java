package Polymorphism;

class F1{
	//final method (final methods can be overloaded but not override)
	public static final void show() {
		System.out.println("It is a final method in calss F1");
	}
	
	public static final void show(int a) {
		System.out.println("It is a final method in calss F1");
	}
	
}

class F2 extends F1{
	// Final method  is not possible in overriding
	//bcoz final members can be inherited but can't modified
//	public static final void show() {
//		System.out.println("It is a final method in calss F1");
//	}
//	
}

// final with class
// final class can't be inherited


public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//final variable
		final int i =10;
		System.out.println(i);
		
//		i=11;  // It gives error bcoz we cant re-intialize final variables
		
		
		F1.show();
		F1.show(45);
		
	}

}
