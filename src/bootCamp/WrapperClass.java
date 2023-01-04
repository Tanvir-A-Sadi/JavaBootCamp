package bootCamp;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 20;
		int j;
		Integer age = new Integer(i);	// Autoboxing
		System.out.println(age);
		
		j = 10 + age.intValue();		// Unboxing
		System.out.println(j);

	}

}
