package inheritance;

public class SmartPhone extends Mobile1 {
	    SmartPhone(String name, int ram, double price){
		super(name, ram, price);
		
	}
	
	public void extraFeatures() {
		System.out.println("This mobile will have extra features");
	}
	

}
