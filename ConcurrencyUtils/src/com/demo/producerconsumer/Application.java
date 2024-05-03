package com.demo.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queueQuestion = new ArrayBlockingQueue<Integer>(5);
		Thread t1 = new Thread(new Producer(queueQuestion));
		Thread t2 = new Thread(new Consumer(queueQuestion));
		
		t1.start();
		t2.start();

	}

}
