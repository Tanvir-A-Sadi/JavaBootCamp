package bootCamp;

public class NestedIf {

	public static void main(String[] args) {
		int i = 45;
		if (i >= 18) {
			System.out.println("You are an adult");
			if(i > 65) {
				System.out.println("You are a senior!");
			}
			else if (i > 40) {
				System.out.println("You are almost an older person");
			}
			else {
				System.out.println("You are still young!");
			}
		}
		else {
			System.out.println("You are not an adult.");
		}
	}

}
