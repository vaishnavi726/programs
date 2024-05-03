package demo.sw;

public class StudentCon {
	
	int age;
	String name;
	static String college ="NIT";
	
	
	public StudentCon(int a, String n) {
		this.age = a;
		this.name = n;
	}
	
	//to change the data of the static variable
	
	static void change() {
		college ="ABITS";
	}
	
	
	void display() {
		System.out.println("age is" +age +" " + "name is: " +name +" " +"college: " +college);
		
		
	}
	
	public static void main(String[] args) {
		StudentCon s = new StudentCon(1,"A");
		StudentCon s1 = new StudentCon(2,"B");
		StudentCon s2 = new StudentCon(3,"V");
		
		change();
		
		s.display();
		s1.display();
		s2.display();
        
		
		
	}
	

}
