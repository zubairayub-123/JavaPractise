package Interface;

@FunctionalInterface
interface Z{
	int add(int i, int j);
}
public class Lamda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Z z = (i,j) -> i+j;
		int result = z.add(5, 3);
		System.out.println(result);
	}

}
