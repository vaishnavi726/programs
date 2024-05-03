package demo.ex;

public class ArrExc {
	
	public static void main(String[] args) {
		
		System.out.println("first line");
		
	//	int a[] = {1,2,3,4,5};
	 int a[] = new int[4];
		a[0] = 23;
		a[1]=56;
		a[2]=45;
		a[3]=46;
		try {
		a[4] = 34;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage()); // shows the exact error.
		 System.out.println(ae.toString()); //toString method gives the reason for 
			//the exception
			
		}
		
		finally {
			System.out.println("used to close the DB connections opened in try block");
			System.out.println("last line");
		}
		
	}

}
