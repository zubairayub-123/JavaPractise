package EY;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("rohit");
		
		sb.append(" Sharma"); // append will add value to sb object
		
		sb.insert(0, "virat "); // insert the data based on index
	
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		String s1 = sb.toString();
		
		System.out.println(s1);
		
	}

}
