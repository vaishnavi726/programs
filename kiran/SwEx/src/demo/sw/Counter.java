package demo.sw;

public class Counter {
	
	static int count = 10;
	
	
	Counter(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		Counter c1 = new Counter();
	}
}



