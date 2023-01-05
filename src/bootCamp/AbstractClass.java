package bootCamp;

abstract class AbstractClass {
	String name;
	int price = 10;
	
	public void fillUp()
	{
		System.out.println("Bottle is filled up.");
	}
	public void sellBotlles() {
		System.out.println("Bottles sold!");
	}
	public abstract void brandName();

}
