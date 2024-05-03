package com.demo.sets;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// sorting the elements of hashset and converting hashset into list
public class Application1 {

	public static void main(String[] args) {
		
		/*HashSet<String> hashSet = new HashSet<String>();
		hashSet .add("welcome");
		hashSet .add("here");
		hashSet .add("to");
		hashSet .add("course");
		
		ArrayList<String> words = new ArrayList<String>(hashSet );
		
		Collections.sort(words);
		System.out.println(words);*/
		
		// Lets create the employee class and map with Hash set
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Peter", 45000));
		hashSet.add(new Employee("smiley", 3000));
		hashSet.add(new Employee("ravindra", 2000));
		hashSet.add(new Employee("komal", 4655));
        hashSet.add(new Employee("paul", 4500));
        
        ArrayList<Employee> words = new ArrayList<Employee>(hashSet);

		Collections.sort(words);
		System.out.println(words);


	}
		
	
}
