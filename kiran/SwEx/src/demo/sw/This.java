package demo.sw;

public class This {
	
	int x =10;
	
	public void add(int x) {
		System.out.println("this is the local variable:" +x);
		System.out.println("this is global variable:"+this.x); // here x represents the global variable
	}

	
	public static void main(String[] args) {
		
		This t = new This();
		t.add(25);
	}
}
