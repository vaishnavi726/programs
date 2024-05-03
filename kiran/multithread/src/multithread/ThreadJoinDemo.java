package multithread;

public class ThreadJoinDemo implements Runnable{

	
	String name;
	
	ThreadJoinDemo(String n){
		this.name = n;
	}
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name +":" +i);
			
			
		}
		
		
	}

	public static void main(String[] args) {
		ThreadJoinDemo t = new ThreadJoinDemo("Thread-1");
		ThreadJoinDemo t1 = new ThreadJoinDemo("Thread-0");
		
		Thread td = new Thread(t);
		Thread td1 = new Thread(t1);
		
		td.start();
		
		try {
			td.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		td1.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main:" +i);
		}

	}
}
