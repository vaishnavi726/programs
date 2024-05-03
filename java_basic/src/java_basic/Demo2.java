package java_basic;

public class Demo2 {
	public int a, b;
	//public void  add(int a, int b) {
	public static void   add(int a, int b) {
		int c= a+b;
		System.out.println("addition of numbers:" +c);
		
	}
	public static void main(String[] args) {
		//Demo2 d2= new Demo2();
		Demo2.add(2,3);
	}

}
