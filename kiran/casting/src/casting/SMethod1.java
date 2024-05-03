package casting;

public class SMethod1 extends SMethod {
	
	public void add() {
		int x=90, y=10;
		
		System.out.println(x-y);
		
		super.add();
		//this.add();
		
	}
	
	public static void main(String[] args) {
		 
		SMethod1 s = new SMethod1();
		s.add();
	
	}

}
