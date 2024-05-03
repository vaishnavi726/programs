package demo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(67);
		a.add(89);
		a.add(78);
		
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		Collections.swap(a, 1,2); // index position starts with 1
		System.out.println(a);
		
		
		
	}

}
