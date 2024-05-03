package demo.sw;

public class Stat {
	
	static int i=10;
	int j=23;
	
	// static variable --->instance --->directly
	void demo() {
		System.out.println(i);
		System.out.println(j); // instance var to instnace met -- diercetly
	}
	
		void m1() { // intance me to instance directly
			demo();
			m2();
		}
		
		static void m2() { // static - instance -->directly
			System.out.println("static method call to intance");
		
		}
      
	public static void main(String[] args) {
		Stat s = new Stat();
		s.demo(); // instance to static object 
		System.out.println(i); // static variable -- static --directly
		System.out.println(s.j); //intance var-- static --- obj
		s.m1();
		m2();   //static met - static meth -- directly.
	}

}
