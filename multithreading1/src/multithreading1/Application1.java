package multithreading1;

//multiple threads are executing simultaneously.

public class Application1 {

	public static void main(String[] args) {
		
		System.out.println("starting thread1");
		//ImplementingTask task = new ImplementingTask("Thread-A"); //Thread-A is the added to rename a thread
	//	Thread th1 = new Thread(new ImplementingTask("Thread-A")); short cut of line 8
		//task.run(); //run the runnable interface
		
		//another way of creating thread by using anonymous class
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				//Thread.currentThread().setName(this.name); ignore
				for(int i=0;i<=100;i++) {
					System.out.println("printing numbers:" +i+ "***" +Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				}
			}
			
		});
		th1.start();
		
		
		System.out.println("starting thread2");
		//ImplementingTask task1 = new ImplementingTask("Thread-B");
		//Thread th2 = new Thread(new ImplementingTask("Thread-B")); shortcut of line 35
//		task1.run();// to run the runnable interface
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<=100;i++) {
					System.out.println("printing numbers:" +i+ "***" +Thread.currentThread().getName());
					try
					{
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		});
		th2.start();
	}

}
//class ImplementingTask extends Thread{    
class ImplementingTask implements Runnable{
	String name; // to change the name of the thread
	
	public ImplementingTask(String name) { // constructor
		this.name= name;
	}
	public synchronized void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0;i<=100;i++) {
			System.out.println("printing numbers:" +i+ "***" +Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}