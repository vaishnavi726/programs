package demo.ex;

public class ThrowExc {
	
	static void validate(int age) {
		if(age < 18) {
			
		//	throw new NullPointerException("not eligible to vote");
			throw new ArithmeticException("not eligible to vote");
		}
		
		else {
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate(12);

	}

}
