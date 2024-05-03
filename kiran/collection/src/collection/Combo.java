package collection;

import java.util.ArrayList;

public class Combo {
	
	public static void main(String[] args) {
		
		ArrayList<String> ai = new ArrayList<>();
		ai.add("A");
		ai.add("B");
		ai.add("C");
		ai.add("D");
		
	//	for(String s :ai) {
		
		for(int k=0; k<ai.size(); k++) { // same as for loop
		
	System.out.println(ai);
			
		//	System.out.println(ai.get(k)); // it will give as ABCD in vertically
		}
	}

}
