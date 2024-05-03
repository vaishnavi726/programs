package multithread;

public class MultiThreadAlive implements Runnable{

	int count;
	@Override
	public void run() {
		
		for(int i =0; i<=10;i++) {
			count++;
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreadAlive m = new MultiThreadAlive();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		System.out.println(t1.isAlive());
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(m.count);
	}
}
