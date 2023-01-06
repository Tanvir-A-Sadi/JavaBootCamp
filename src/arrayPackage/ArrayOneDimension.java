package arrayPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayOneDimension {

	public static void main(String[] args) throws IOException {
		int size;
		int [] anArray;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of value you wish to enter:");
		size = scanner.nextInt();
		
		anArray = new int [size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter value " + (i+1) + ": ");
			anArray[i] = scanner.nextInt();
			}
	
		FileWriter writer = new FileWriter("/Users/Tanvi/Desktop/NewArray.txt");
		writer.write("-------------New Table---------------\n");
		for (int i = 0; i < size; i++) {
			writer.write(anArray[i] + "\n");
		}
		writer.close();
		scanner.close();
	}
}
