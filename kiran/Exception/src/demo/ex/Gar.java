package demo.ex;

// concept of finalize() method
public class Gar {
	
	static String s1;

	public static void main(String[] args) {
		
		
		String s = "java";
		s.concat("learner");
		
		System.out.println(s);  // learner is not adde because of no object creation.
		//hence it cleaned by garbage collector.
		
		System.out.println(s1.trim());
	}

}
