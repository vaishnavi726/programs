package java_basic;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[25];
		numbers[0]=34;
		numbers[3]=4;
		numbers[4]=6;
		System.out.println(numbers[3]);
		//System.out.println(numbers[100]); ..>array indexout of bounds exception
		
		short[] s = new short[30];
		s[0]=24;
		s[4]=45;
		System.out.println(s[4]);
		
		//String [] words= new String[] {"welcome","to", "java"};// oneway
		String [] words = new String[100];// 2nd way 
		words[3]="learning";
		words[1]="java";
		words[2]="course";
		System.out.println(words[0]);
	}

}
