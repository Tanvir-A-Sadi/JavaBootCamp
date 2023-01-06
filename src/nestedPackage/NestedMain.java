package nestedPackage;

public class NestedMain {

	public static void main(String[] args) {
		NestedClass a = new NestedClass();
		NestedClass.InnerClass i = a.new InnerClass();
		System.out.println(a.i + " " + i.i);
		

	}

}
