package EY;

class Mobile{
	Mobile(){
		super();
		System.out.println("It is a Mobile Class");
	}
}

class OnePlus extends Mobile{
	OnePlus(){
		super();
		System.out.println("It is a OnePlus Class");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnePlus p = new OnePlus();
		
//		Mobile m = new Mobile();
		
	}

}
