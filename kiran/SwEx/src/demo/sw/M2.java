package demo.sw;

public class M2 implements Inter {
	
	public void m1() {
		System.out.println("executing m1 method");
	}

	
	public static void main(String[] args) {
		
		M2 m = new M2();
		m.m1();
		
		System.out.println(m.x);
	}
}
