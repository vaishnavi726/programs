package demo.ex;

public class Throws1 {
	
//	static void display() {
		/*try {
		int b = 9/0;
		System.out.println(b);
	}
		catch(ArithmeticException a) {
			a.printStackTrace();}
		}*/

	public static void main(String[] args) {
		try {
			int b = 9/0;
			System.out.println(b);
		}
			catch(ArithmeticException a) {
				a.printStackTrace();
			}

	}

}
