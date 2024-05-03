package cloneable;
/*interface Cloneable{
	
}*/

public class Student implements Cloneable {
	
	int rollNumber;
	String name;
	
	Student(int rollno, String n){
		this.rollNumber= rollno;
		this.name = n;
		}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) {
		try {
		Student s1 = new Student(10,"vaishnavi");
		Student s2 =(Student)s1.clone();
		
		System.out.println(s1.rollNumber + " " +s1.name);
		System.out.println(s2.rollNumber + " " +s2.name);
	}
		catch(CloneNotSupportedException c) {}
			
		}

}
