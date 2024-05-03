package demo.producer;

import java.util.List;

public class Producer2 implements Runnable {
	
	List <Integer> questionList = null;
	final int LIMIT=5;
	private int questionNo;
	
	Producer2(List <Integer> questionList){
		this.questionList = questionList;
	}
	
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized(questionList) {
			while(questionList.size()==LIMIT) {
				System.out.println("all the questions are piled up waiting for answers");
				questionList.wait();
				
			}
		}
		
		synchronized(questionList) {
			System.out.println("New Question:" +questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
			
		}
		
		
		
	}
	

	

	@Override
	public void run() {
		try {
			readQuestion(questionNo++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
