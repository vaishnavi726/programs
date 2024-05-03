package collection;

import java.util.ArrayList;
import java.util.List;

class Student {
	
	int rollNo;
	String name;
	String address;
	
	
	Student(int r, String n, String a){
		this.rollNo = r;
		this.name = n;
		this.address = a;
	}
 }
 
 public class AddObjects{
	public static void main(String[] args) {
		
		List<Student> l = new ArrayList<>();
		
		Student a = new Student(1,"A", "101");
		Student a1 = new Student(2,"B", "102");
		Student a2 = new Student(3,"C", "103");
		
		l.add(a);
		l.add(a1);
		l.add(a2);
		
		for(Student o : l) {
			System.out.println(o);
			System.out.println(o.rollNo +" " +o.name+" "+o.address);
		}

	}

}
