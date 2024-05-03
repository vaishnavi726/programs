package com.main;

import com.entity.Entity;

public class Main {

	public static void main(String[] args) {
		
		Entity e = new Entity();
		e.setAccholdername("vaishnavi");
		e.setAmount(360000);
		e.setBankname("canara");
		System.out.println(e.getAccholdername() + " "+ e.getAmount()+" " +e.getBankname()+" ");
		
		

	}

}
