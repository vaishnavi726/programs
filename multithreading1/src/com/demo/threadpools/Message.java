package com.demo.threadpools;

public class Message implements Runnable  {
	
	private int message;
	
	public Message(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "[MESSAGE] received" +message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + "[DONE] responding to [MESSAGE]" +message);
		
	}

	private void respondToMessage() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
