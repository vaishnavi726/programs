package com.demo.Application2;

public class Sequence {
	
	private int value=0;

	public synchronized int getNext() {  //removes the duplicates reduction of code by adding synch to the method
	 // synchronized(this){  //Synch is used to make thread safe using automicity (It will give the unique values using synchronized)
			value++;
			return value;
	  }
		
	

}

