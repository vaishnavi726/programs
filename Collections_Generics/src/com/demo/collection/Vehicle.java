package com.demo.collection;

public class Vehicle {
	
	String make;
	String model;
	int price;
	boolean fourWhDrive;
	
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWhDrive=" + fourWhDrive + "]";
	}

	public Vehicle(String make, String model, int price, boolean fourWhDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWhDrive = fourWhDrive;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWhDrive() {
		return fourWhDrive;
	}
	public void setFourWhDrive(boolean fourWhDrive) {
		this.fourWhDrive = fourWhDrive;
	}
	

}
