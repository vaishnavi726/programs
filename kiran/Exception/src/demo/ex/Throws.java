package demo.ex;

public class Throws {
	
	static void display()throws ArithmeticException{
		
		int a=5/0;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		try {
			display();  // if we call the method in main method throws need to added to its method
				
			
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}


	}

}
