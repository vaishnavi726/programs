package inheritance;

public class Mobile1 {
	String name;
	int ram;
	double price; 
	
	Mobile1(String name, int ram, double price){ // In inheritance is it necessary to have constructor?
		this.name= name;
		this.ram= ram;
		this.price= price;
	}
	public void playGame() {
		System.out.println("playing the game");
	}
	
	public void makeaCall() {
		System.out.println("ping to her");
	}

}
