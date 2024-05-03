package multithreading;

public class MultiSync implements Runnable {

	int count;
	@Override
	public synchronized void run() {
		
		for(int i=1;i<=10000;i++) {
			count++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MultiSync m = new MultiSync();
		
		
		Thread t = new Thread(m);
		Thread t1 = new Thread(m);
		
		t.start();
		t1.start();
		
		t1.join();  // join method throws exception
		t.join();
		
		System.out.println(m.count);
		
	
		
		
		
	}

}
