package oops;

public class ElectronicItems {
	int id;
	String brandName;
	String color;
	double storage;
	
	public ElectronicItems(int id, String brandName, String color,double storage) {
		this.id=id;
		this.brandName=brandName;
		this.color=color;
		this.storage=storage;
	}
	public void doingAction() {
		System.out.println("id is:" +id);
		System.out.println("brandName is:" +brandName);
		System.out.println("color is:" +color);
		System.out.println("storage is:" +storage);
	}
	
	public void doAction() {
		System.out.println("id is:" +id);
	}
	
	
}
