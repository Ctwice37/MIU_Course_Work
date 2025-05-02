package classes;

import java.io.Serializable;

public class Gas_Car extends Car implements Serializable{
	
	int tankSize;
	String fuelType;
	
	
	
	
	public Gas_Car(String Make, String Model, int year, int weight, String color, String fuelType, int tankSize) {
		super(Make, Model, year, weight, color);
		this.tankSize = tankSize;
		this.fuelType = fuelType;
	}




	@Override
	public String toString() {
		return super.toString() + " Tank Size: " + tankSize + " Fuel Type: " + fuelType;				
	}
	



	
	

}
