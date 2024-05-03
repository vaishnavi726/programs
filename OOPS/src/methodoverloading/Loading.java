package methodoverloading;

public class Loading {
	
	public void m1() {
		System.out.println("no argument");
	}
	public void m1(int a) {
		System.out.println("int argument");
	}
	public void m1(float f) {
		System.out.println("float argument");
	}
	
	public static void main(String[] args) {
		Loading l = new Loading();
		l.m1(2);
		l.m1('c');	
		l.m1(10l);
		//l.m1(23.4d); // here it will get the error bcz there is no extension for double
		}

}
