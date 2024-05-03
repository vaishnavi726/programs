package cloneable;

import java.util.ArrayList;
import java.util.Collections;

public  class Student1 implements Comparable <Student1> {
	int rollno;
	String name;
	
	Student1(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		
	}
	public int compareTo(Student1 s) {
		if(rollno > s.rollno) {
			return 1;
		}
		else if(rollno < s.rollno){
			return -1;
		}
		else {
			return 0;
			
		}
		
	}
	public class TestSort1{
		public static void main(String[] args) {
			ArrayList<Student1> a = new ArrayList<Student1>();
			a.add(new Student1(1, "vyshu"));
			a.add(new Student1(7, "soumya"));
			a.add(new Student1(5, "niharika"));
			a.add(new Student1(4, "shyamu"));
			Collections.sort(a);
			for(Student1 s:a) {
				System.out.println(s.rollno +" "+s.name);
			}
			
		}
	}

	

}
