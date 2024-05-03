package multithread;

public class MultiSyncDemo implements Runnable{
	
	int count;

	@Override
	public synchronized void run() {
		
		
		for(int i=0;i<=100;i++) {
			count ++;
		}
		
	}
public static void main(String[] args) throws InterruptedException {
	
	MultiSyncDemo m = new MultiSyncDemo();
	
	Thread t1 = new Thread(m);
	Thread t2 = new Thread(m);
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println(m.count);
	
	
}
}
