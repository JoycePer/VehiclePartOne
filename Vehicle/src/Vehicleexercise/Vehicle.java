package Vehicleexercise;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	//here we need the abstract method that will be implemented in all the other subclasses (car and bikes) but which can be override
	//public abstract void addWheels()?;//
	public abstract void writeplate(String string);
	public abstract void writebrand(String string);
	public abstract void writecolor(String string);

	protected abstract String tellplate();
	protected abstract String tellbrand();
	protected abstract String tellcolor();
	
	
	
	
} 


