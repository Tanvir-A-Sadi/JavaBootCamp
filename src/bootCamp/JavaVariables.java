package bootCamp;

public class JavaVariables {

	public static void main(String[] args) {
		// Variables declared
		String name; // stores character of strings
		int age; // stores an integer value - 32 bits
		byte b; // stores a byte value -8 bits
		short s; // stores a short value - 16 bits
		long l; // stores a long value - 64 bits
		float f; // stores a decimal value - 32 bits
		double d; // stores a decimal value - 64 bits
		boolean citizen; // Stores a true or false vale - 16 bits
		
		// Variables initialized
		name = "Sadi";
		age = 30;
		b = 120;
		s = 256;
		l = 37929284673023l;
		f = 3.14159f;
		d = 3.14159223333333333;
		citizen = true;
		
		// Print output
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
		System.out.println("Boolean: " + citizen);
	}

}
