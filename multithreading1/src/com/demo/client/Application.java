package com.demo.client;
//one thread is writing and other thread is reading the collections data

import com.demo.collections.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager inventory = new InventoryManager();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				inventory.populateProductList();
			 }
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				inventory.displaySolidProducts();
				
			}
		});
		t1.start();
		Thread.sleep(4000);
	//	t1.join(); // main thread will wait t1 to join to start
		t2.start();

	}

}
