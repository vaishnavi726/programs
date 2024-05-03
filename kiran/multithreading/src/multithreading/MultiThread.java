package multithreading;

public class MultiThread implements Runnable{
	
	String name;
	
	MultiThread(String name){
		this.name = name;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" " +i);
		}
	}
	
	public static void main(String[] args) {
		
		MultiThread m1 = new MultiThread("Thread1");
		MultiThread m2 = new MultiThread("Thread2");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		
	}

}
