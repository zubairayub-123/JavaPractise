package MultiThreading;

class Y{
	
}
//Runnable is a functional interface
class A implements Runnable{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Hi");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable{
	// thread class have run method
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//class C{
//	 static int initialVal;
//	    public static void increase() {
//	        initialVal = initialVal+1;
//	    }
//}


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj1 = new A();		
		Runnable obj2 = new B();
		
//		obj2.setPriority(Thread.MAX_PRIORITY);
		//Anonymous class
		
		Runnable obj3 = ()-> {
				// TODO Auto-generated method stub
				for(int i=0; i<10;i++) {
					System.out.println("Welcome");
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		
		
		
		// start method can access only the run method 
		//Runnable doesn't have start method
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		
		t1.start();
		t2.start();
		t3.start();
//		obj1.start();
//		obj2.start();
	}

}
