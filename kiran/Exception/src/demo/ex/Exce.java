package demo.ex;

public class Exce {

	public static void main(String[] args) {
		
		int a=0,b=90;
		
		try {
		System.out.println(b/a);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
         
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
