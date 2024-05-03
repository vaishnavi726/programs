package com.demo.producer;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList<>();
		
		 Thread t1 = new Thread(new Producer1(questionList));
		Thread t2= new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
		
		

	}

}
