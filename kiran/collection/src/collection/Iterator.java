package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
    
    ArrayList<String> ai = new ArrayList<>();  
    ai.add("F");
    ai.add("G");
	ListIterator<String> itr =ai.listIterator();
	System.out.println("forward direction");
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("\n");
	System.out.println("in reverse direction");
	
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	
	System.out.println("\n");
	
	Iterator<String> litr = ai.iterator();
	
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	System.out.println("\n");
	
	
	List<String> a1 = new ArrayList<>();

	a1.add("hyderabad");
	a1.add("is beautiful city");
	
	a1.forEach(a2 -> {
		System.out.println(a2);
	});
	
	System.out.println("\n");
	
	//printing values by using forEachRemaining method
	
	Iterator<String> itt = a1.iterator();

	a1.forEachRemaining(a3 -> {
		System.out.println(a3);
	});
	
	
	}
	}