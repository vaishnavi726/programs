package methodoverloading; // case-2 in overloading

public class Loading1 {
	
	public void m1(Object o)
	{
		System.out.println("object version");
	}
	
	public void m1(String s) {
		System.out.println("string version");
	}
	
	public static void main(String[] args) {
		Loading1 l1 = new Loading1();
		l1.m1(new Object());
		l1.m1("string object");
		l1.m1(null); // null is applicable of any type but it will give priority to child class.Jvm will have in ambiguity situation
		
	}

}
