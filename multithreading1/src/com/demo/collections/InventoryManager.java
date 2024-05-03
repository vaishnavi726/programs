package com.demo.collections;
//concurrentModifictionException can be recovered by using synchronization and it can also be done in other way as below
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	List<Product> solidProductList = new CopyOnWriteArrayList<Product>();
	List<Product> purchase = new ArrayList<Product>();
	
	public void populateProductList() {
		for(int i=0;i<100;i++) {
			Product product = new Product(i, "test_product_" + i);
			solidProductList.add(product);
			System.out.println("added: " +product);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //its optional here we are making control flow to slow down for certain period
		}
	}
	
	public void displaySolidProducts() {
		for(Product prod: solidProductList) {
			System.out.println("printing the solid product:" +prod);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
