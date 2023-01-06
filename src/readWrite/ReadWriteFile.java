package readWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Tanvi/Desktop/info.txt");
		Scanner scanner = new Scanner(file);
		String fileContent = "";
		
		while(scanner.hasNextLine()) {
			fileContent = fileContent.concat(scanner.nextLine() + "\n");
			FileWriter writer = new FileWriter("/Users/Tanvi/Desktop/infoFinal.txt");
			writer.write(fileContent);
			writer.close();
		}
		scanner.close();
	}

}
