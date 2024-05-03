package multithread;

public class MultiThreadPriority implements Runnable{

	
	int count;
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			count++;
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MultiThreadPriority m = new MultiThreadPriority();
		
		Thread t = new Thread();
		Thread t1 = new Thread();
		
		t.start();
		t1.start();
		
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t.join();
		System.out.println(t.isAlive());
		
		
	}
	
	

}
