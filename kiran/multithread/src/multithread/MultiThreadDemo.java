package multithread;

public class MultiThreadDemo implements Runnable {

	String name;
	
	
	public MultiThreadDemo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println("implenting run method");
		
		for(int i=1;i<=10;i++) {
			System.out.println("name"+ " "+i);
		}
		
	}
	
	public static void main(String[] args) {
		
		MultiThreadDemo m = new MultiThreadDemo("Thread 1");
		MultiThreadDemo m1 = new MultiThreadDemo("Thread 0");
		Thread t = new Thread(m);
		Thread t1 = new Thread(m1);
		t.start();
		t1.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("name1" +" "+i);
		}
	}
	
	

		
		
	

}
