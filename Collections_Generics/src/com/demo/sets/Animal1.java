package com.demo.sets;

import java.util.Objects;

public class Animal1 {
	
	String name;
	int weight;
	
	public  Animal1(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal1 [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal1 other = (Animal1) obj;
		return Objects.equals(name, other.name) && weight == other.weight;
	}
	
	

}
