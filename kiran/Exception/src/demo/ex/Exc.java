package demo.ex;

public class Exc {
  public static void main(String[] args) {
	
	   int i=0, j=90;
	   try {
	   
	   System.out.println(j/i);
	   }
	   catch(Exception e) {
		   e.printStackTrace(); //this method gives by which the error raised in which line
		   
		   System.out.println("handling the exception"+"  "+ (i/j));
		   System.out.println(e.getMessage()); //get message gives only the exact error
		   
		   
	   }
	   finally {
		   System.out.println("finally block always executes....");
	   }
  }
}