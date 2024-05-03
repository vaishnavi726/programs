package demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Students1 {

	public static void main(String[] args) {
		
		List<Students > stu = new ArrayList<>();
		
		Students s = new Students(1, "A", 30.8);
		Students s1 = new Students(2, "B", 78.8);
		Students s2 = new Students(3, "C", 39.8);
		 
		stu.add(s);
		stu.add(s1);
		stu.add(s2);
		
		
		
		for(Students s3: stu) {
			
			System.out.println(s3.rollno +" "+s3.name +" "+s3.percentage);
			
		}
		
	//	LinkedList<employee> e = new LinkedList<>();// here a class need to be created and
		// add objects into it(adding objects into collection)
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Linked elements");
		
		System.out.println(l);
		
		
		Vector v = new Vector();
		v.add(3);
		v.add("sample");
		
		System.out.println(v);
		
		
		Stack s4 = new Stack();
		s4.push(12);
		s4.push('j');
		s4.push("dove");
		
		System.out.println(s4);
		System.out.println(s4.search("dove")); // y the output is 1
		//s4.pop(12);
	//	System.out.println(s4);
		System.out.println(s4.peek()); 
		System.out.println((s4.traverse());  //search method
				
		
		
	}

}
