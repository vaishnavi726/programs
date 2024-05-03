package com.demo.producerconsumer;

//consumer is the waiter who serves to customers
import java.util.List;

public class Consumer implements Runnable {
	
	
	List<Integer>questionList = null;
	
	public Consumer(List<Integer>questionList) {
		this.questionList=questionList;
	}
	
	public void answerQuestion1() throws InterruptedException {
		synchronized(questionList) {
		while(questionList.isEmpty()) {
			System.out.println("No questions to answer...waiting for the producer to post question");
			questionList.wait();
		}
	}

	
	synchronized(questionList) {
		Thread.sleep(5000);
		System.out.println("Answered Question:" +questionList.remove(0)); // it removes the 0th index question to add new question

		questionList.notify(); //it will notify the producer that all the questions are answered
	}
		
	}
	
	@Override
	public void run() {
       while(true) {
		try {
			answerQuestion1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		}
			
		
	}
		
	}


