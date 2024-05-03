package com.demo.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> queueQuestion;
	int questionNo;
	public Producer(BlockingQueue<Integer> queueQuestion) {
		this.queueQuestion=queueQuestion;
	}

	

	@Override
	public void run() {
		while(true) {
		try {
			synchronized(this) {
			//queueQuestion.put(questionNo++);
			//queueQuestion.put(getNextQuestion());
			   int nextQuestion= questionNo++;
				System.out.println("get next question: " +nextQuestion);
				queueQuestion.put(nextQuestion);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
	
	/*private synchronized int getNextQuestion() { instead of this synchronized block we can use on above synchronization
		int nextQuestion = questionNo++;
		System.out.println("got new question:" +nextQuestion);
		return nextQuestion;
	}*/


