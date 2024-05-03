package inheritance;

public class Iphone extends SmartPhone{
	
	Iphone(String name, int  ram, double price ) {
	super(name, ram, price);
	}
	
	public void ultimatepixcel() {
		System.out.println("captured the beautiful pic");
		
	}

}
