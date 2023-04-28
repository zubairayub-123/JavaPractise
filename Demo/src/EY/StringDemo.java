package EY;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "rahul";
		
		System.out.println(name.hashCode());
		
		name = name + "456";

        System.out.println(name.hashCode());
        
        String s1 = new String("nkdebug");
        String s2 = new String("nkdebug");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        System.out.println( s1.charAt(3));
        System.out.println( s1.substring(4));

        String s3 = "nkdebug";
        String s4 = "nkdebug";
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));

		
		

	}

}
