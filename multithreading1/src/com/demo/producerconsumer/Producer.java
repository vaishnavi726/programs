package com.demo.producerconsumer;
// rememnber the example of resurant producer is preparing food for consumer that is carried by waiter
//producer who is cooking food
import java.util.List;

public class Producer implements Runnable{
	
	List<Integer> questionList = null;  //QuestionList is a shared resource of consumer and producer class
	final int LIMIT =5; //list of questions limit we can't read more than 5 questions at a time
    private int QuestionNo;
   
  
    public Producer(List<Integer> questionList) {
		//super();
		this.questionList = questionList;
	}
	
	public void readQuestion(int QuestionNo) throws InterruptedException { //producer is having list of items
		synchronized(questionList) { // questionList is object whivh is shared resource
		while(questionList.size() == LIMIT) {
			System.out.println("questions are pilied up waiting for answers");
			questionList.wait();
		}
		}
		
		synchronized(questionList) {  // this synchronized block is to add new questions to list
			System.out.println("New Question: " +QuestionNo);
			questionList.add(QuestionNo);
			Thread.sleep(100);
			questionList.notify(); // notify method is used to notify that new questions added to list
//notifyAll() is used to notify all the threads which are in wait state.Notify and notifyall methods should be in synchronized block only	
		}
	}
		
	@Override
	public void run() {
		
		while(true) { //this loop is used to iterate the block multiple times
			try {
				readQuestion(QuestionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
			
		}
		
	}
	
	


