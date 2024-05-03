package oops;

public class Human {
	int age;
    String action;
    String name;
    double height;
   //public  Human(int age, String action, String name, double height){  // constructor
    public Human() {
    	age=10;
    	action="dance";
    	name="john";
    	height =5.6;
    	
    }
    
	public void speak() {
		System.out.println("My age is:" +age);
		System.out.println("My name  is:" +name );
	    System.out.println("My height is:" +height);
		System.out.println("My action: " +action);
	}
	public void laugh() {
		System.out.println("They are:" +action);
	}


}
