package Polymorphism;

class P1{
	 public void show() {
	        System.out.println("show method in class P1");
	    }

}

class P2 extends P1{
	 public void show1() {
	        System.out.println("show method in class P2");
	    }

}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P1 p =new P2();
		p.show();
		
	}

}
