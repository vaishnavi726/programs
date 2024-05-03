package demo.iterator;

import java.util.HashMap;
import java.util.TreeMap;

public class Mapping {

	public static void main(String[] args) {

		HashMap h = new HashMap();
		
	// hashmap follows the key value pair.
		

		h.put("name", "vyshnavi");
		h.put("course", "devops");
		
		System.out.println(h);
		
		h.put("technology", "devops"); // keys cannot e duplicate but values can be duplicate
		
		h.put("course", "pyton"); //if we use same key the old key will be replaced.
		System.out.println(h);
		
		TreeMap t = new TreeMap();
		t.put("name", "vyshnavi");
		t.put("course", "devops");
        t.put("technology", "devops"); 
		t.put("course", "pyton"); 
		System.out.println(t);
	}

}
