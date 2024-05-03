package demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		for(int i=0;i<10;i++) {
			l.add(i); //using for loop adding 10 elements into array
			
		}
		
		Iterator itr =l.iterator();
		while(itr.hasNext()) { // hasNext() return boolean results
			Integer i =(Integer) itr.next();
	
		
		if(i%2==0) {
			System.out.println(i);
		}
		else {
			itr.remove();
		}
			
		}
		System.out.println(l);
	}

}
