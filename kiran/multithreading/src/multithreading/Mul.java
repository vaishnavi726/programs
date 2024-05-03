package multithreading;

public class Mul extends Thread {
	
	public void run() {
		System.out.println("run method gets executes");
	}

	public static void main(String[] args) {
		
		System.out.println("starting a thread");
		Mul m = new Mul();
		//Thread t = new Thread();
		m.start();
		
	}

}
