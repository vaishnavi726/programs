package oops1;

public class Zoo {
	
	public static void main(String[] args) {
		
		 Animal animal = new Animal("Lion","wild", 4); 
		 Animal animal1 = new Animal("Cow","Domestic ", 6);
		 
		
		animal.doAction();
		animal.doingAction();
		animal1.doAction();
		animal1.doingAction();
	}

}
