package bootCamp;

import java.util.Scanner;

public class SwitchMethod {

	public static void main(String[] args) {
		int day; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		day = scanner.nextInt();
		
		switch(day) {
		case 1: 
			System.out.println("Today is Sunday!");
			break;	// breaks out of the switch method.
		case 2: 
			System.out.println("Today is Monday!");
			break;
		case 3: 
			System.out.println("Today is Tuesday!");
			break;
		case 4: 
			System.out.println("Today is Wednesday!");
			break;
		case 5: 
			System.out.println("Today is Thursday!");
			break;
		case 6: 
			System.out.println("Today is Friday!");
			break;
		case 7: 
			System.out.println("Today is Saturday!");
			break;
		default: 
			System.out.println("Please Enter a valid number.");
		}		

	}

}
