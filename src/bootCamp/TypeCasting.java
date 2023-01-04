package bootCamp;

/*
 * 		Data Types in Java - Following orders
 * 		Byte - 8 bits
 * 		Short - 16 bits
 * 		Char - 8 bits
 * 		int - 32 bits
 * 		long - 64 bits
 * 		float - 32 bits
 * 		double - 64 bits
 * Type Casting needed in java to store one value to another. 
 * It is possible to store a value smaller(in byte) in size to fit into a datatype
 * that is larger in size. However, it is not possible to to store a largerr value into a 
 * data type with less space. 
 */

public class TypeCasting {

	public static void main(String[] args) {
		double gpa = 3.14159;
		int age = 30;
		gpa = age;		// Converts the value to a decimal value and stores into gpa
		System.out.println(gpa);
		
		double pie = 3.14159;
		int foot = 12;
		foot = (int) pie;		// Converts the value to a int value and stores into foot
		System.out.println(foot);
	}

}
