package oops1;

public class Animal {
	String name;
	String species;
	int height;
	
	public Animal(String name, String species, int height) {
		this.name =name;
		this.species=species;
		this.height= height;
	}
	
	public void doAction() {
		System.out.println("name of animal:" +name);
		System.out.println("species of animal:" +species);
	}
	
	public void doingAction() {
		System.out.println("height of animal:" +height);
	}
	

}
