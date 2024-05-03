package com.demo.files;

import com.demo.exceptions.FooExceptionCreated;

public class MyUtils {
	//public int subtract10fromnumber(int number) throws Exception {
	public int subtract10fromnumber(int number) throws FooExceptionCreated {
		if(number  < 10) {
		//throw new Exception("The number passed was less  thn 10");
	    throw new FooExceptionCreated("The number passed was less  thn 10");
	}
		return number -10;
	}
	
	//creating our own exception class
	
	/*public class FooExceptionCreated extends Exception{
		public FooExceptionCreated(String message) {
			super(message);
		}
	
	}*/
}

