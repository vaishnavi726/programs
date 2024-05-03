package oops;

public class ElectronicItems1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectronicItems items= new ElectronicItems(1, "lenovo","black", 500.5);
		ElectronicItems item1 = new ElectronicItems(2,"HP","grey",800.6);
		
		/*items.doingAction();
		item1.doingAction();*/
		
		items.doAction();
		item1.doAction();

	}

}
