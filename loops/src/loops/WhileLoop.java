package loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		while(count <= 100) { // Here it will repeat 'n' tyms condition is always true.
			System.out.println("Iterate the loop:" + count);
			 count+=1; // we are just increasing the count
			
			   if(count == 40) {
				 break;
			 }
		}

	}

}
