package com.service;

import java.util.List;

import com.entity.Entity;

public interface Service {
	
	List<Entity> getBank();  
	
	Entity addBank(Entity entity);
	Entity updateBank(Entity entity);
	
	

	
}
