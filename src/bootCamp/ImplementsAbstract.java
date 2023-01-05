package bootCamp;

import java.util.Scanner;

public class ImplementsAbstract extends AbstractClass {
		public ImplementsAbstract() {
		System.out.println("Please enter a brand name: ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		scanner.close();
	}
	@Override
	public void brandName() {
		System.out.println("Brand: " + name);
		System.out.println("Price: $" + price);
		
	}
	
	

}
