package Vehicleexercise;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Car extends Vehicle { //child class from vehicle

	public Car(String plate, String brand, String color) { // constructor of child class
		super(plate, brand, color); // call the parameters of the abstract class
	}
	
	/*public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception { //calling the abstract method to add the wheels
		//meaning that in the abstract method there should be a List<Wheel>frontWheels and a List<Wheel>backWheels//
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception { 
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}*/
	
	//adding all the getters and setters to ask (in the main method) more details about the car
	public void writeplate(String platecar) {
		plate=platecar;
	}
	public void writebrand(String brandcar) {
		brand=brandcar;
	}
	public void writecolor(String colorcar) {
		color=colorcar;
	}
	

	public String tellplate() {
		return plate;
	}
	public String tellbrand() {
		return brand;
	}
	public String tellcolor() {
		return color;
	}


}