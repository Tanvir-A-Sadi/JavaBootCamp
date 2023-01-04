package bootCamp;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 0; i < 5; i++) {
			int j = r.nextInt(100);	// generates random number from 0 to 99;
			System.out.println(j);
		}
		System.err.println();
		for (int i = 0; i < 5; i++) {
			int j = r.nextInt(90, 100);	// generates random number from 90 to 99;
			System.out.println(j);
		}

	}

}
