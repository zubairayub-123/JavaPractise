package EY;

class Book{
	
	static String name ="Billionaire";
	static int pages = 666;
	static double price = 750.34;
	
	 static public void display() {
		System.out.println(name + " -> " + pages + " -> " + price);
	}
	 

	
}
class Book1{
	String names;
	static int volumes;
	
	 public void display1() {
			System.out.println(names + " -> " + volumes);
		}
	 
	 static{
		 volumes = 4;
		 System.out.println("It is a static block");
	 }
	 {
		 System.out.println("It is a init block");
	 }

}

public class StaticDemo {

	public static void main(String[] args) {
		
		
		
		Book1 b = new Book1();
		b.names = "Good Deeds";
//		b.volumes = 9;
		
		b.display1();
		
		Book1 b1 = new Book1();
		b1.names = "Bad Deeds";
//		b1.volumes = 5;
		
		Book.display();
		b1.display1();
		
//		System.out.println(b.name);
//		System.out.println(b.volumes);
	}

}
