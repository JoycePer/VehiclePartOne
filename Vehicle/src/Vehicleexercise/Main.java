package Vehicleexercise;
import javax.swing.JOptionPane;

public class Main {
			public static void main(String[]args) {
				Vehicle obj = new Car(null, null, null);
				obj.writeplate(JOptionPane.showInputDialog("Write the number of your vehicle"));
				obj.writebrand (JOptionPane.showInputDialog("Write the brand of your vehicle"));
				obj.writecolor (JOptionPane.showInputDialog("Write the color of your vehicle"));
				
				
				
				//obj.addwheels()??;//
				
				System.out.println("Your car has the number " +obj.tellplate()+ " and the brand " 
				+obj.tellbrand()+" and is " +obj.tellcolor());// + "and the brand of the front wheels" + obj.tellBrandFrontWheels());
		
}
}
