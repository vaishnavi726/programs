package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		
		Container<Integer, String> container = new Container(12,"Hello");
		// we can have multiple Container object.
		int var =  container.getItem1();
		String var1 =  container.getItem2();
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("welcome");
		mySet1.add("to");
		mySet1.add("java");
		mySet1.add("Devops");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("Java");
		mySet2.add("python");
		mySet2.add("Devops");
		
		Set <String> resultSet= union(mySet1, mySet2);
		
		/*Iterator iterator = resultSet.iterator(); // In collection we have Iterator to iterate loop
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		Iterator <String> iterator = resultSet.iterator();   // by using generic 
		
		while(iterator.hasNext()) {        
			String value= iterator.next();
			System.out.println(value);
			
		}
			}
	
	
	
	public static <E> Set<E> union(Set<E> set1 ,Set<E> set2) { //generic method
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}

}
