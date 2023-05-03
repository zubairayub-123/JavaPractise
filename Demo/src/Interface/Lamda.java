package Interface;

@FunctionalInterface
interface Y{
	void show(int i, String name);
}


public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Y y = (i, name) ->
		{
			System.out.println("Displays " + i +" " + name);
		};
		y.show(45, "Rohit");
	}

}
