package multithread;

public class Automation extends Thread {
	
	public static void main(String[] args) {
		
		Automation a = new Automation();
		Thread t = new Thread(a);
		
		t.start();
		
	}

}
