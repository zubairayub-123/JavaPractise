package Abstraction;

class Apple{
	
	public void show() {
		System.out.println("It is a Grapes class method");
		display("ayub");
	}
	
	public void display(String name) {
		System.out.println("It is a class method with name");
		System.out.println(name);
	}
}

class PineApple{
	public void show1() {
		System.out.println("It is a PineApple class method");
		
		Apple b = new Apple();
		b.show();
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PineApple p = new PineApple();
		p.show1();
	}

}
