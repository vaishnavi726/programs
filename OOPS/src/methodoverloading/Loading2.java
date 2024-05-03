package methodoverloading;

class Animal{
	
}

class Monkey extends Animal{
	
}

public class Loading2 {
	
	public void m1(Animal a) {
		System.out.println("animal version");
	}
	
	public void m1(Monkey m) {
		System.out.println("monkey version");
	}
	public static void main(String[] args) {
	
		Loading2 l2 = new Loading2();
		Animal a = new Animal();
		l2.m1(a);
		Monkey m = new Monkey();
		l2.m1(m);
		Animal a1 = new Monkey(); // it will give priority based on reference type
		l2.m1(a1);
	}

}
