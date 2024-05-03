package multithread;
// converting to Daemon thread before the start method
public class Daemon1 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("starting Deamon thread");
		
	}
	
	public static void main(String[] args) {
		 
		Daemon1 d = new Daemon1();
		
		Thread t = new Thread(d);
		 t.setDaemon(false);
		 t.start();
		 
		 System.out.println(t.isDaemon());
	}

}
