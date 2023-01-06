
public class stringManipulation {

	public static void main(String[] args) {
		String name = "Tanvir %s Sadi";
		String middleName = "Ahmed";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("Sadi"));
		System.out.printf(name, middleName);

	}

}
