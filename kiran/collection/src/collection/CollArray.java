package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollArray {

	public static void main(String[] args) {
		
		List<String> al1 = new ArrayList<>();
		al1.add("vedha");
		al1.add("pavan");
		al1.add("navneeth");
		al1.add("suman");
		
		
		List<String> al2 = new ArrayList<>();
		al2.add("rekha");
		al2.add("monica");
		al2.clear(); // clearing values from list upto here
		al2.add("chinmayi");
		al2.add("madhavi");
		al2.add("bhanu");
		al2.addAll(al1); // adding list1 into list2
		
		for(String s:al1){
		System.out.println(s);
		}
		
		System.out.println("\n");
		
		for(String s1:al2){
			System.out.println(s1);
		}
		al2.addAll(1, al1); // adding specific index
		al2.clear(); // removing all elements from list al2
		System.out.println("\n");
		
		for(String s2:al2){
		System.out.println(s2);
		}
		System.out.println(al1.equals(al2));
		
		// number of elements and order of elements should be same for equals
		
		System.out.println(al1.isEmpty());
		//list al1 is not empty, so it returns false
		List<String> al3= new ArrayList<>();
		System.out.println(al3.isEmpty());
		//list al3 is empty so it returns of true

		al3.add("first value");
		al3.add("second value");
		al3.add("third value");
		al3.add("fourth value");
		al3.add("first value");
		
		System.out.println(al3.indexOf("first value"));
		System.out.println(al3.lastIndexOf("first value"));
		System.out.println(al3.contains("second value"));
		System.out.println(al3.indexOf("first value"));
		System.out.println(al3.indexOf("fifth value"));
		
		al3.remove(3);
		//removing element at specified index
		System.out.println(al3);
		al3.remove("second value");
		
		// removing specified element from list
		System.out.println(al3);
		al3.set(2, "last value");
		//replacing a specified value
		System.out.println(al3);
		al1.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(al1);
		al1.add("all");
		al1.add("All");
		al1.sort(Comparator.naturalOrder());
		System.out.println(al1);
		System.out.println(al1.subList(1, 4));
		}
	}
