package generics1;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
	    Accountant acc = new Accountant();
	    emp = acc;       // polymorphism
	    
	    //By using generics when we try to assign 
	    
	    ArrayList<Employee> employee = new ArrayList<>(); 
        employee.add(new Employee());
	    ArrayList<Accountant> accountant = new ArrayList<>();
	    accountant.add(new Accountant());
	    
	    ArrayList<HrManager> manager = new ArrayList<>();
	    manager.add(new HrManager());
	  //  employee = accountant;  // can't assign here bcz arraylist of employee adn accountant are different
	    
	    ArrayList<?>employee1 = new ArrayList<>();   //'?' represents the wild card  here it can be of any datatype. 
	    ArrayList<Accountant> accountant1 = new ArrayList<>();
	    employee1=accountant1;
	    
	    ArrayList<? extends Employee> employee2 = new ArrayList<>();// herre extends represents it can be either class/ interface.
	    ArrayList<Accountant> accountant2 = new ArrayList<>(); // here we can't put '?' because String is not the child class of employee. Here '?' represents the childclass
	    employee2 = accountant2;
	    
	    ArrayList<? super Employee> employee3 = new ArrayList<>();
	  //  ArrayList<Accountant> accountant2 = new ArrayList<>(); this is not allowed since accountant is not a super class of employee
	    ArrayList<Object> accountant3 = new ArrayList<>();
	    employee3 = accountant3;
	    
	    //makeEmployeeToWork(employee);
	   //makeEmployeeToWork(accountant);
	    makeHrManagerToWork(manager);
	   }
	
		// TODO Auto-generated method stub
		
	
	/* public static void  makeEmployeeToWork(List <Employee> employee) {
	    	for(Employee emp1 : employee) {
	    		emp1.work();
	
	    	
	    	}
	    }*/
	 /* public static void  makeEmployeeToWork(List <?  extends Employee> employee) { // instead of creating the new method we can call by using extends list.
		  for(Employee emp1 : employee) {  //if employee class has work method
	    		emp1.work();
	
	  }*/
	
	// If employee doen't has work method
	
	/*public static void makeEmployeeToWork(List<? extends Employee> employee) {
		for(Accountant emp : (ArrayList<Accountant>) employee){
			emp.work();
		}*/
	/*  public static void  makeAccountantToWork(List <Accountant> accountant) { 
	    	for(Accountant acc1 : accountant) {
	    		acc1.work();
	    	}
	  }*/
	/*	public static void makeEmployeeToWork(List<? extends Employee> employee) {
			for(HrManager emp : (ArrayList<HrManager>) employee){
				emp.work();
				
			}
	}*/
	public static void  makeHrManagerToWork(List <HrManager> manager) { 
    	for(HrManager man : manager) {
    		man.work();
    	}
	}
}


