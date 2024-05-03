package demo.producer;

import java.util.List;

public class Consumer2 implements Runnable{
	
	List<Integer> questionList = null;
	
	
	
	public Consumer2(List<Integer> questionList) {
		// TODO Auto-generated constructor stub
		
		this.questionList=questionList;
	}

	public void answer() throws InterruptedException {
		synchronized(questionList) {
			while(questionList.isEmpty()) {
		System.out.println("answered all the questions... waiting for the questions");
		    questionList.wait();
			}
		}
		
		synchronized(questionList) {
			Thread.sleep(100);
			System.out.println("New Question:" +questionList.remove(0));
			questionList.notify();
		}
		
	}

	@Override
	public void run() {
		
		 try {
			answer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
