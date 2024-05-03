package demo.producer;

import java.util.ArrayList;
import java.util.List;



public class App {
	
	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList<>();
		
		 Thread t1 = new Thread(new Producer2(questionList));
		Thread t2= new Thread(new Consumer2(questionList));
		
		t1.start();
		t2.start();
	}

}
