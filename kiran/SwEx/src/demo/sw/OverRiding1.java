package demo.sw;

public class OverRiding1 extends OverRiding {
	
	public  void action() {
		System.out.println("having fun");
	}
	

	public static void main(String[] args) {
		
		OverRiding1 r = new OverRiding1();
		r.action();

	}

}
