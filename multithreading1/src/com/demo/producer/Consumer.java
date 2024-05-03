package com.demo.producer;

import java.util.List;

public class Consumer implements Runnable {
	
	List<Integer> questionList = null;
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void answered() throws InterruptedException {
		synchronized(questionList) {
			while(questionList.isEmpty()) {
		    System.out.println("No question to answer...wting for producer to get questions");
			questionList.wait();
		}
	}
	
	
	synchronized(questionList) {
		Thread.sleep(100);
		System.out.println("answered question:" +questionList.remove(0));
		questionList.notify();
		
	
	}
		
	}

	@Override
	public void run() {
		
		try {
			answered();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
