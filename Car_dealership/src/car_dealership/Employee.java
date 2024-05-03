package car_dealership;

public class Employee 
{
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			
			processTranscation(cust, vehicle);
		}else {
			System.out.println("customer need more money to purchase the vehicle:" +vehicle);
		}
		
		
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("run credit history for customer");
		System.out.println("customer has been approved to purchase the vehicle ");
	}
	
	public void processTranscation(Customer cust, Vehicle vehicle) {
		System.out.println("customer has purchased the vehicle:" +vehicle +
				"for the price:" + vehicle.getPrice());
	}

}



