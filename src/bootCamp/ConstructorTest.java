package bootCamp;

public class ConstructorTest {

	public static void main(String[] args) {
		Constructor employee1 = new Constructor(); // creates an instance of Constructor class
		Constructor employee2 = new Constructor("Sadi", 123, 30, false);
		System.out.println("\n" + employee1);
		System.out.println(employee2);
	}

}