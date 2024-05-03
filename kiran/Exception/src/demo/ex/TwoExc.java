package demo.ex;

public class TwoExc {

	public static void main(String[] args) {
		
		
		int a[] = {3,5,6};
		
		try {
		a[3]=4;
		}
	
		catch(ArrayIndexOutOfBoundsException ai) {
		
			ai.printStackTrace();
		}
		
		
		finally
		{
			System.out.println("executes the last line");
		}

	}

}
