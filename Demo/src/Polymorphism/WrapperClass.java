package Polymorphism;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AutoBoxing
		int a=18;
		Integer i = Integer.valueOf(a);// converting in to Integer Explicitly
		Integer j=a; // Autoboxing compiler will convert Implicitly
//		System.out.println(a);
//		System.out.println(i);
//		System.out.println(j);
//		
		//UnBoxing
		
		Character c = new Character('y');
		char x =c;
		char z = c.charValue();
		System.out.println(c);
		System.out.println(x);
		System.out.println(z);
		
	}

}
