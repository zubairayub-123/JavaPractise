package Interface;

@FunctionalInterface
interface A{
	// The annotation functional interface allows only one abstract method
	void show();
}
public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A() 
		{
			public void show() {
				System.out.println("Display");
			}
		};
		a.show();
	}

}
