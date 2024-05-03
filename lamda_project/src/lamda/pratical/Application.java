package lamda.pratical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "black", 223000),
				new Car("splender", "civic", "red", 232000),
				new Car("Toyato", "Lancer", "blue", 25000),
				new Car("Toyato", "civic", "black", 450000),
				new Car("Jeep", "wranglar", "white", 300000));
	    //  printCarPrice(cars, 9000000, 20000);
	   //   carColor(cars,"blue");
		
		
		/*System.out.println("printing the car price between 18000 and 22000");
	    printCars(cars, new CarCondition() {
			
			public boolean test(Car c) {
				return c.getPrice() >=18000 && c.getPrice() <=22000;
			
			}
		});
		
	    System.out.println("printing the cars that are blue");
	    printCars(cars, new CarCondition() {
	    	public boolean test(Car c) {
	    		return c.getColor().equals("Blue");
	    	}
	    	
	    });
	}*/
	
	Function<Car, String> priceAndColor = (c) -> "Price =" +c.getPrice()+ " color =" +c.getColor();
		String stringCar = priceAndColor.apply(cars.get(0));
     	System.out.println(stringCar);
	}
	/*System.out.println("printing the cars between 18000 to 22000");
	printCars( cars, (c) -> c.getPrice() >=18000 && c.getPrice() <=22000);
	
	System.out.println("printing the blue color");
	printCars( cars, (c) -> c.getColor().equals("Blue"));
	}*/
	
	
//public static void printCars(List<Car> cars, Condition<Car> condition) {
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
	for(Car c:cars) {
		//if(condition.test(c)) {
		if(predicate.test(c)) {
			c.printCar();
		}
	}
}

/*public static void printCarPrice(List<Car> cars, int high, int low) {
	for(Car c: cars) {
		if(low <= c.getPrice() && c.getPrice() <= high) {
			c.printCar();
		}
	}
	
}


public static void carColor(List<Car> cars, String color) {
	for(Car c:cars) {
		if(c.getColor().equals(color)) {
			c.printCar();
		}
	}
}
*/}

//functionInterface

/*interface CarCondition{
	public boolean test(Car c);
}*/

interface Condition<T>{
	public boolean test(T t);
}

