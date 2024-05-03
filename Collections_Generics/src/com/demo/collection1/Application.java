package com.demo.collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// adding the list of one arrayList to other ArrayList
public class Application {

	public static void main(String[] args) {
		
		//ArrayList <String> name = new ArrayList<String>();
		HashSet <String> name = new HashSet<String>();
		name.add("add");
		name.add("elements");
		name.add("into");
		name.add("an array");
		name.add("Below are the list of words");
	    name.add("Below are the list of words");
		name.add("Below are the list of words");
		
		
		List <String> name1 = new ArrayList<String>(name); // It is used to convert hash set into list
		
		ArrayList <String> words = new ArrayList<String>();
		words.add("Below are the list of words");
		
		name.retainAll(words);
		//name.addAll(words);
		//name.removeAll(words);
		//name.clear();
		// boolean value = name.isEmpty();
		//System.out.println(name.contains("elements"));
		System.out.println(name);
		
	
	}

}
