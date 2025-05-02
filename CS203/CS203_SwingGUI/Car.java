package classes;

import java.io.Serializable;

public class Car implements Serializable{
	
	String make;
	String Model;
	int year;
	int weight;
	
	String color;
	
	
	public Car(String make, String Model, int year, int weight, String color) {
		this.make = make;
		this.Model = Model;
		this.year = year;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Make: " + make + " Model: " + Model + " Color: " + color + " year: " + year + " Weight: " + weight;				
	}
	
	
	

}
