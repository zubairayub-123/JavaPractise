package Abstraction;

class A{
	public void display() {
		System.out.println("It is a class A method");
	}
	
	class B{
		public void display1() {
			System.out.println("It is a class B method");
		}
	}
}

class C{
	public void display2() {
		System.out.println("It is a class C method");
	}
	
	static class D{
		public void display3() {
			System.out.println("It is a class D method");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.display();
		
		A.B obj1 = obj.new B();
		obj1.display1();
		
		C obj2 = new C();
		obj2.display2();
		
		C.D obj3 = new C.D();
		obj3.display3();

	}

}
