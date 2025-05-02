package classes;

import java.io.Serializable;

public class Electric_Car extends Car implements Serializable{
	
	int batterySize;
	String batteryType;
	
	
	
	

	public Electric_Car(String make, String Model, int year, int weight, String color, int batterySize, String batteryType) {
		super(make, Model, year, weight, color);
		this.batterySize = batterySize;
		this.batteryType = batteryType;
	}





	@Override
	public String toString() {
		return super.toString() + " Battery Size: " + batterySize + " Battery Type: " + batteryType;				
	}
	
}
