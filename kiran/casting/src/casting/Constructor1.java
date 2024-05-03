package casting;

public class Constructor1 extends Constructor {
	
	Constructor1(){
		
		super();
		System.out.println("child class constructor executed");
		
	}
	
	public static void main(String[] args) {
		
		Constructor1 c = new Constructor1();
	
	}
	
	
}
