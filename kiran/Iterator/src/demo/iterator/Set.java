package demo.iterator;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		
		HashSet h = new HashSet();
		
		h.add("Spring");
		h.add(34);
		h.add('a');
		h.add(89.7);
		
		System.out.println(h);
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(23);
		t.add(78);
		t.add(67);
		t.add(21);
		
		System.out.println(t);
		

		

	}

}
