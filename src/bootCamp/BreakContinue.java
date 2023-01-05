package bootCamp;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < 7; i++)
		{
			if (i == day)
				continue; 	// ignores the current iteration
			if (i == 6)
				break;		// breaks out of the loop
			System.out.println("Day: " + (i+1));
			
		}		
	}
}
	

