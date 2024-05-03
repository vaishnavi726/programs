package com.demo.Application2;

public class Application2 {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);  //for thread 0
		worker1.start();
		
		Worker worker2 = new Worker(sequence);   //for thread 1
		worker2.start();
		
		for(int i=0;i<=100;i++) {
		System.out.println(sequence.getNext());
		}
	}

}
class Worker extends Thread{
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() + "got value:" +sequence.getNext());
//getNext()- is used to get the next value and current thread refers
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}