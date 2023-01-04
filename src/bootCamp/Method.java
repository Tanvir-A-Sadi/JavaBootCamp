package bootCamp;

public class Method {

	public static void main(String[] args) {
		int age = getAge(); // calls getAge() method and stores the value in age variable.
		System.out.println("This is from the main method.");		
		System.out.println("I am " + age + " years old!");

	}
	
	public static int getAge(){
		int a = 30;
		return a;		// returns value in a
	}

}
