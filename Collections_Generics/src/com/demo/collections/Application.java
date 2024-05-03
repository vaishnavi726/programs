package com.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
	public static void main(String[] args) {
		
		//ArrayList words = new ArrayList();
		ArrayList <String>words = new ArrayList<String>();
		words.add("make a word");
		words.add("listen");
		words.add("joy");
		words.remove(0);
		/*words.add(20);
		words.add(24);
		words.add(2.3);
		words.add('V');
		
		//System.out.println(words.get(3));
		/*String item1 = (String)words.get(0);
		int item2 = (int)words.get(3);
		System.out.println(item1 + " " + item2);*/
		/*String item = words.get(1);
		System.out.println(item);*/
		System.out.println(words.get(1));
		
		LinkedList<Integer> number = new LinkedList<Integer>();
		number.add(1);
		number.add(34);
		number.add(45);
		number.add(89);
		number.remove(2);
		number.add(45);		for(int n :number) {
			System.out.println(n);
		}
		
		
	}

}
