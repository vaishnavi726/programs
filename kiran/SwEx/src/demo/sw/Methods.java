package demo.sw;

public class Methods {
	
	//without return type without parameters
	
	void walk() {
		System.out.println("walking");
	}
	
	//with return type without parameters
	
	String display() {
		String name = "message";
		return name;
	}
	
	//without return type with parameters
	
	void move(String action) {
	System.out.println(action);
	}
	
	//with return type with parameters
	
	boolean response(String content) {
		String s1 = "response";
		return true;
	}
	
	
	
	//without return type with parameters
	
	void sum(int a, int b) {
		System.out.println((a+b));
	}
	
	
	//with return type with parameters
	
	String emptyJar( String quantlity) {
		String quality="good";
	   return quality;
	}

	public static void main(String[] args) {
		
		Methods m1 = new Methods();
		m1.walk();
		System.out.println(m1.display());
        m1.move("moving");
       System.out.println(m1.response("respond back"));	
       m1.sum(2, 3);
      System.out.println( m1.emptyJar("liquid"));
      }

}
