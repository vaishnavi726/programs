package com.demo.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//creating a thread pool using executor
public class ThreadPoolDemo {

	public static void main(String[] args) {
	
		ExecutorService executor = Executors.newFixedThreadPool(2);// here 2 threads recycle the usage for below threads
		
	    Runnable processor =	new Message(2); // this pool has 2 threads
		executor.execute(processor);
		
		Runnable processor2 =new Message(3); // this pool has 3 threads
        executor.execute(processor2);
        
        Runnable processor3 =new Message(4);// this pool has 4 threads
        executor.execute(processor3);
        
        Runnable processor4 =new Message(4);// this pool has 4 threads
        executor.execute(processor4);
        
        
        executor.shutdown();// It doesn't allow other task to enter into executor for being submitted.
	  //  executor.shutdownNow();
       /* while(!executor.isTerminated()) { // for making a main thread to wait.
	      
	      }*/
        
        //another way of doing main thread to wait
        
        try {
			executor.awaitTermination(2, TimeUnit.SECONDS);  //TimeUnit is class
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("submitted all the tasks......");
	}
	
	
	

}
