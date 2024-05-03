package demo.sw;

public class Sw {

	public static void main(String[] args) {
		
		String s = "welcome";
		
		switch(s) 
		{ 
		case "welcome" : System.out.println("day is 1");
		break; //if we don't mention break it will execute all statements
		
		case "to" : System.out.println("day is 2");
		break;
		
		case "program" : System.out.println("day is 3");
		break;
		
		default: System.out.println("invalid day");
		     
		}

	}

}
