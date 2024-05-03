package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust = new Customer("Nelson", "Banglore@ White", 12000); // using constructor
		/*cust.name="Nelson";     
		cust.address="Banglore@ White";
		cust.cashOnHand =12000;*/
		
		/*cust.setName("Nelson");
		cust.setAddress("Banglore@ White"); // using getter and setter methods
		cust.setCashOnHand(12000);*/
		
		//Vehicle vehicle = new Vehicle("Honda", "Accord", 150000); // using constructor
		Vehicle vehicle = new Vehicle("BMW", "M3", 150000);
		/*vehicle.setMake("Honda");
		vehicle.setModel("Accord");       // using constructor we can reduce getter and setters
		vehicle.setPrice(15000);*/
		
		Employee emp = new Employee();
		
		cust.purchase(vehicle, emp, true);
		
		Vehicle car = new Vehicle("BMW", "M3", 150000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);

	}

}
