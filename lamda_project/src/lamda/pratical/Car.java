package lamda.pratical;

import java.util.List;

public class Car {
	
	String name, model, color;
	int price;
	
	public Car(String name, String model, String color, int price) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printCar() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
	

}
