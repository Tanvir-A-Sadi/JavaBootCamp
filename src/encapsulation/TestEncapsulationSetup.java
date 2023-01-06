package encapsulation;

public class TestEncapsulationSetup {

	public static void main(String[] args) {
		EncapsulationSetup sadi = new EncapsulationSetup();
		sadi.setName("Tanvir Sadi");
		sadi.setAge(30);
		
		System.out.println("Name: " + sadi.getName());
		System.out.println("He is " + sadi.getAge() + " years old!");

	}

}
