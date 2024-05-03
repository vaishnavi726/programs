package demo.sw;

public class MainOverloading {
	
	public static void main(int x) {
		int y =10;
		System.out.println(y);
		System.out.println(x);
	}
	
	public static void main(boolean b) {
		
		System.out.println(b);
	}
	
    public static void main(int[] i) {
		
		System.out.println(i);
	}
    
   /* public String toString() {
    	return i;
    }*/

	public static void main(String[] args) {
		
		System.out.println("priniting the overloaded methods");
		main(true);
		main(19);
		main("java");
		main(new int[] {2,3,5,6});
		
	}
	
	public static void main(String s) {
		System.out.println(s);
	}
}
