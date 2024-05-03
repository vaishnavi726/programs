package demo.sw;

public class Abstract1 extends Abstract{

	void add(int x, int y) {
		int z = x+y;
		System.out.println("add two numbers:" +z);
	}

	public static void main(String[] args) {
		
		Abstract1 a = new Abstract1();
		a.add(34,89);

	}

}
