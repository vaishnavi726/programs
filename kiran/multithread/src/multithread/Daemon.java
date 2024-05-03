package multithread;

public class Daemon implements Runnable {

	@Override
	public void run() {
		
		System.out.println("starting the Dameon tread");
		
	}
	
	public static void main(String[] args) {
		
		Daemon d = new Daemon();
		
		Thread t = new Thread(d);
		t.start();
		
		System.out.println(Thread.currentThread().isDaemon()); //main method cannot be converted as Daemon thread.
		System.out.println(t.isDaemon());

		t.setDaemon(true);
		System.out.println(t.isDaemon());
		Thread.currentThread().setDaemon(true);
		 //illegalThreadStateException will occur due to conversion of main thread to Daemon thread.
		
	//since main thread is not a user defined thread.
	}

}
