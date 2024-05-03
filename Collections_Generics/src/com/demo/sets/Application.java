package com.demo.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet <Integer> value = new HashSet <Integer>();
		value.add(23);
		value.add(89);
		value.add(78);
		value.add(23);
		value.add(89);
		
		for(Integer a : value) {
			System.out.println(a);
			
		}
		HashSet <Animal1> animals = new HashSet <Animal1>();// in this senarico it is allowing  duplicates because of hashcode is different
		
		Animal1 animal1 = new Animal1("Dog", 23);
		Animal1 animal2 = new Animal1("Lion", 32);
		Animal1 animal3 = new Animal1("Tiger", 45);
		Animal1 animal4 = new Animal1("Tiger", 45);
		
		animals.add(new Animal1("Zebra", 67));
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		System.out.println(animal3.equals(animal4)); 
		
		System.out.println(animal3.hashCode());
		System.out.println(animal4.hashCode());
		for(Animal1 ani : animals) {
			System.out.println(ani);
		}
	}

}
