package casting;

public class Super1 extends Super {
	
	int x =29;
	int y=90;
	int z = 78;
	
	void m1() {
		int x=99;
		
		System.out.println(this.x);
		System.out.println(x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		 Super1 s = new Super1();
		 s.m1();
	}

}
