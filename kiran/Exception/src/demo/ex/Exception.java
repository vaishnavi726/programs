package demo.ex;

// in the code any number of exception may occur it will print only first exception
public class Exception {

	public static void main(String[] args) {
		
		try {
		
		int a[] = {1,4};
		
		a[4]=4/0;
		a[3]=6;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(ArithmeticException a) {
			//a.getMessage(); 
			a.printStackTrace();
		}
		
		finally {
			System.out.println("closes the db connections");
		}

	}

}
