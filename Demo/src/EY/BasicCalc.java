package EY;

public class BasicCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvCalc c = new AdvCalc();
		System.out.println(c.add(10, 5));
		System.out.println(c.sub(10, 5));
		System.out.println(c.mul(10, 5));
		System.out.println(c.div(10, 3));
		c.display();

	}

}
