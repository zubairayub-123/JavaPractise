package Polymorphism;

class Vivo {
	public void v5() {
		System.out.println("V5 from vivo");
	}
}
class Oppo extends Vivo {
	public void p5() {
		System.out.println("p5 from oppo");
	}
}
class Realme extends Vivo{
	public void pro7() {
		System.out.println("pro7 from Realme");
	}
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//upcasting
		Vivo v = new Oppo();
		v.v5();
		
		//downcasting
		Oppo o = (Oppo)v;
		o.v5();
		o.p5();
	
	}

}
