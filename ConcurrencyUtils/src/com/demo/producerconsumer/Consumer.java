package com.demo.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	BlockingQueue<Integer> queueQuestion;
	public Consumer(BlockingQueue<Integer> queueQuestion) {
		this.queueQuestion=queueQuestion;
	}

	@Override
	public void run() {
		while(true) {
	try {
		Thread.sleep(1000);
		System.out.println("Answered:" +queueQuestion.take()); //retreives and remove the head of the queue
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}

}
