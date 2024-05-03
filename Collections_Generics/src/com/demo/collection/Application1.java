package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
	List<Double> number  = new ArrayList<Double>();
	//	ArrayList<Double> number  = new ArrayList<Double>();
		number.add(2.34);
		number.add(2.35);
		number.add(2.36);
		number.add(2.37);
		
		for(int i = 0; i<number.size(); i++) {
			System.out.println(number.get(i));
			
		}
		
		for(Double count : number) {
			System.out.println((count));
		}
		
		//ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
		List<Vehicle> vehicle = new ArrayList<Vehicle>(); // Mention as List bcz items in vehicle are list
		Vehicle vehicle2 = new Vehicle("Toyota", "Camery",45, true);
		vehicle.add(new Vehicle("Honda", "accord",34, false));
		vehicle.add(vehicle2);
		vehicle.add(new Vehicle("Jeep","wrangler",56, true ));
		/*for(Vehicle car : vehicle) {
			System.out.println(car.getMake());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
		}*/
		printElements(vehicle); // this can be used instead of above for loop
		printElements(number);
	}
	public static void printElements(List someList) {
		for(int i = 0; i<someList.size(); i++) {
			System.out.println(someList.get(i));
			
		}
	}

}
