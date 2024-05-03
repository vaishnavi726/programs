package com.demo.producer;


import java.util.List;

public class Producer1 implements Runnable {
	

	List<Integer> questionList = null;
	final int LIMIT =5;
	private int questionNo;
	
	public Producer1(List<Integer> questionList) {
		this.questionList = questionList;
		
	}
	
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized(questionList) { //synch is used because questionList is common
		while(questionList.size() == LIMIT) {
			System.out.println("Questions have piled up.. waiting for answers");
			questionList.wait();
		}
	}
		
		synchronized(questionList) { // to add the new questions
			System.out.println("New Question:" +questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
			
		}

		
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			readQuestion(questionNo++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
