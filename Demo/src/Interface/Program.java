package Interface;

interface Car{
	void start();
	void move();
	void stop();
}
interface Cars{
	void mileage();
}

class Audi implements Car,Cars{
	public void start() {
		System.out.println("Audi car started");
	}
	public void move() {
		System.out.println("Audi car moves");
	}
	public void stop() {
		System.out.println("Audi car stopped");
	}
	public void mileage() {
		System.out.println("Audi car mileage is 15-20");
	}
}

class Bmw implements Car, Cars{
	public void start() {
		System.out.println("BMW car started");
	}
	public void move() {
		System.out.println("BMW car moves");
	}
	public void stop() {
		System.out.println("BMW car stopped");
	}
	public void mileage() {
		System.out.println("BMW car mileage is 13-18");
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi a = new Audi();
		a.start();
		a.move();
		a.mileage();
		a.stop();
		
		Bmw b = new Bmw();
		b.start();
		b.move();
		b.mileage();
		b.stop();

	}

}
