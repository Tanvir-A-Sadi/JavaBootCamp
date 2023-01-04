package bootCamp;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // opens the scanner.
		System.out.println("Enter a number: ");
		int i = scanner.nextInt(); //Takes the next int value from the keyboard and stores into i
		System.out.println("You have entered " + i);	
		scanner.close();		// closes the scanner
		
		
		

	}

}
