package com.jobready.threading;

public class Application {
	
	public static void main(String[] args) {
		
		System.out.println("Starting thread1");
		Task1 taskRunner = new Task1();
		taskRunner.start();
		
		System.out.println("Starting thread1");
		Task1 task2 = new Task1();
		task2.start();
	}
}
		
class Task1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i++) {
			System.out.println("print numbers:" +i);
		  
		}
		
		
	}
		
		
	}	