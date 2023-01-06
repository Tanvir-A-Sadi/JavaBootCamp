package arrayPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayTwoDimenstion {

	public static void main(String[] args) throws IOException {
		int numRows, numColumns;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		numRows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		numColumns = scanner.nextInt();
		
		int [][] anArray = new int [numRows] [numColumns];
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				System.out.println("Enter row " + (i+1) + " Column " + (j+1) + ": ");
					anArray[i][j] = scanner.nextInt();	
				}
			}
		
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				System.out.print(anArray[i][j] + " ");
				}
			System.out.println();
			}
		FileWriter writer = new FileWriter("/Users/Tanvi/Desktop/2DArray.txt");
		for (int i = 0; i < numRows; i ++) {
			for (int j = 0; j < numColumns; j++) {
				writer.write(anArray[i][j] +" ");
			}
			System.out.println("\n");

		}
		writer.close();
		scanner.close();
	}	
}
