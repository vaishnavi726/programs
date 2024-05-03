package com.demo.io;

 class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {  // close method is the default for Autocloseable 
		System.out.println("closing");
		
	}
}



public class Test2 {

	public static void main(String[] args) {
		try(MyClass c = new MyClass();){
		
		} catch (Exception e) {
			System.out.println("end of the statement");
			
		}finally {
			System.out.println("code gets executed");
		}
	}

}
