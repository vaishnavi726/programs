package demo.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
		
		//List a = new ArrayList(); //this allows any datatype
		List <String> ai = new ArrayList<>(); //it allows only string data
		
		ai.add("Java");
		//ai.add(89);
		//ai.add(45);
		ai.add("learner");
		ai.add("be joyful");
		ai.add("brave");
		ai.add("");
		ai.add("confident");
		System.out.println(ai);
		
		ai.remove(2);
		System.out.println(ai);
		System.out.println(ai);
		
	//	ai.clear();
		

	}

}
