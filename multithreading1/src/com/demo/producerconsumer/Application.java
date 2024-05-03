package com.demo.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		List<Integer>questionList = new ArrayList<Integer>(); // menu of items
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Producer(questionList));
		
		t1.start();
		t2.start();
		
		

	}

}
