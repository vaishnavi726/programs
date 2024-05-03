package multithread;

public class MultiThreadSleep implements Runnable {
	
	String name;
	
	public MultiThreadSleep(String n) {
		 this.name = n;

	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name +":"+i);
		}
	}
	
	public static void main(String[] args) {
		
		MultiThreadSleep m = new MultiThreadSleep("Thread-1");
		MultiThreadSleep m1 = new MultiThreadSleep("Thread-0");
		
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		
		t.start();
		t1.start();
		
		for(int i=1; i<=10;i++) {
			System.out.println("main:" +i);
		}
		
	}
	
	
	

}
