package loops;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="abcdefghijklmnopqrstuvwxyz";
		//for(int i =0; i < a.length()-1; i++) {
		//	System.out.println("i:" +i);
			//System.out.println("char:" + a.charAt(i));
			
			for(int i =a.length()-1; i>=0; i--) {
				System.out.println("char:" + a.charAt(i));
			}
			
		}

	}


