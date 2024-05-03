package multithreading;

public class Mul1 implements Runnable {
	
	public void run() {
		System.out.println("implementing runnable interface");
		
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		Mul1 m = new Mul1();
		m.run();

	}

}
