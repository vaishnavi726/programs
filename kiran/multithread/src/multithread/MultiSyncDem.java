package multithread;

public class MultiSyncDem implements Runnable{
	
	int count;

	@Override
	public synchronized void run() {
		
		for(int i=0;i<=10;i++) {
			count++;
		}
		
	}

	 public static void main(String[] args) throws InterruptedException {
		
		 MultiSyncDem m = new MultiSyncDem();
		// MultiSyncDem m1 = new MultiSyncDem();
		 
		 Thread t = new Thread(m);
		// Thread t1 = new Thread(m1);
		 Thread t1 = new Thread(m);
		 
		 t.start();
		 t1.start();
		 
		 System.out.println(t.getName());
		 System.out.println(t1.getName());
		 
		 t.setName("Thread-0"); // we can set the names to thread
		 t1.setName("Thread-1");
		 System.out.println(t.getName());
		 System.out.println(t1.getName());
		 
		 System.out.println(t.getPriority()); // by default priority is 5
		 System.out.println(t1.getPriority());
		 
		 t.setPriority(1);
		 System.out.println(t.getPriority());
		 t1.setPriority(10);
		 System.out.println(t1.getPriority());
		 
		 t.join();
		 t1.join();
		 
		 System.out.println(m.count);
		 System.out.println(t.isAlive());
	}
}


