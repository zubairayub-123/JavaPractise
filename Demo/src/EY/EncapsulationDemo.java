package EY;

class Bank{
	private String name;
	private long AccNo;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAcc(long AccNo) {
		this.AccNo=AccNo;
	}
	
	public String getName() {
		return name;
	}
	
	public long getAcc() {
		return AccNo;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b= new Bank();
		
		b.setName("Ayub");
		b.setAcc(1234567890);
		
		System.out.println(b.getName());
		System.out.println(b.getAcc());

	}

}
