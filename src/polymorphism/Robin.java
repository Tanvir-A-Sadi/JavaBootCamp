package polymorphism;

public class Robin extends Bird{
	public void sing(String i) {	// if parameter doesn't match it will execute the super calss.
		System.out.println(i);
	}
}
