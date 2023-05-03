package Abstraction;

abstract class Vehicle{
	// abstract class will have abstract and non-abstract methods
	public abstract void mileage();
	
	public abstract void model();
	
	public void show() {
		System.out.println("It is a abstract vehicle class");
	}	
}

class Bike extends Vehicle{
	// Non abstract-class will not support abstract methods
	public void mileage() {
		System.out.println("Bike will give 50kmpl");
	}
	
	public void model() {
		System.out.println("Bike model is 2020");
	}
}

class Car extends Vehicle{
	public void mileage() {
		System.out.println("Car will give 25kmpl");
	}
	
	public void model() {
		System.out.println("Car model is 2022");
	}
}


public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Bike();
		b.show();
		b.model();
		b.mileage();
		
		Car c = new Car();
		c.show();
		c.model();
		c.mileage();
	}

}
