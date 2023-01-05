package bootCamp;

public class ImplementCellPhoneInterface implements CellphoneInterface{
	public void makesCalls() {
		System.out.println("bring bring bring!");
	}
	public void sendsTexts() {
		System.out.println("text text text!");
	}
	public void display() {
		System.out.println("Phone: " + name);
		System.out.println("Storage: " + storageSpace);
		System.out.println("Price: " + price);
	}
}
