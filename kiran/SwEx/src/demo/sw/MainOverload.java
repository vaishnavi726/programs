package demo.sw;

 class MainOver{
	 
	 public static void main(int[] args) {
		 System.out.println("int array");
		 }
	 
	 public static void main(int args) {
		 System.out.println("int parameters");
	 }
	 
	/* public static void main(String[] args) {
		 main(new int[] {4,5,6,7});
		 main(67);
	}*/
	 }
	
 public class MainOverload{
	 
	 public static void main(String[] args) {
		 MainOver m = new mainOver();
		 m.main(new int[] {4,5,6,7});
		m. main(67);
	}

	 

	 
 }