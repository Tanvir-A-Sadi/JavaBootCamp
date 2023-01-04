package bootCamp;

public class Constructor {
	String name;
	int idNum;
	int age;
	boolean usCitizen;

	// default constructor: this should run automatically when an object is created.
	public Constructor() {
		System.out.println("I am inside default constructor! I have no values to show!");
	}

	public Constructor(String n, int i, int a, boolean u) {
		this.name = n;
		this.idNum = i;
		this.age = a;
		this.usCitizen = u;
		System.out.println("Name = " + name + "\nIdNum = " + idNum + "\nAge " + age + "\nUsCitized = " + usCitizen);

	}
}