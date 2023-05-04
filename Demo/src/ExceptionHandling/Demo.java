package ExceptionHandling;

class Demo1{
	public void show() {
		System.out.println("It is a method show");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		int ar[] = new int[3];
		
		Demo1 d = new Demo1();
		d = null;
		
		try {
//			int b = a/0;
//			int c = ar[4];
			d.show();
		}
		catch(ArithmeticException e) {
			System.out.println("Bad code"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Bad code of array index"+ e);
		}
		catch(NullPointerException e) {
			System.out.println("Bad code of null pointer"+ e);
		}
		finally {
			System.out.println("This block always execute");
		}
		
		

	}

}
