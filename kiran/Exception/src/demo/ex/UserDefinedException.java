package demo.ex;

public class UserDefinedException extends Exception{
         // UserDefinedException(String str){
       //   super(str);

          
public static void main(String[] args) throws UserDefinedException {
        	  try{
        	  System.out.println("enter the age:");
        	  java.util.Scanner sc= new java.util.Scanner(System.in);
        	  int age= sc.nextInt();
        	  if(age<18)
        	  {
        	  throw new UserDefinedException("you are not eligible for vote");
        	  }
        	  else
        	  {
        	  System.out.println("you are eligible for vote");
        	  }
        	  }
        	  catch(UserDefinedException u)
        	  {
        	  u.printStackTrace();
        	  }
        	  }
        	  }
        	 
