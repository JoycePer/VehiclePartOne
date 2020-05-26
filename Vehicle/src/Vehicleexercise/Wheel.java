package Vehicleexercise;
import java.util.ArrayList; 
	
	class Wheel
	{ 
	    int n=2; 
	  
	     
	    class Data 
	    {
	    	private String brand;
			private double diameter; 
	  
			Data(String brand, double diameter){ 
				this.brand = brand;
				this.diameter = diameter;
			}
	    }      
	  

	public static void main(String args[]) 
	{ 
		// suppose the custom input data 
		String brand[] = {"Renault"}; 
		double diameter[] = {40.50}; 
//					}; 

		// Create an object of the class 
		Wheel frontWheels = new Wheel(); 

		frontWheels.addValues(brand, diameter); 
	} 

	public void addValues(String brand[], double diameter[]) 
	{ 
		// local custom arraylist of data type 
		// Data having (String, double) type 
		// from the class 
		ArrayList<Data> list=new ArrayList<>(); 

		for (int i = 0; i < n; i++) 
		{ 
			// create an object and send values to the 
			// constructor to be saved in the Wheel class 
			list.add(new Data(brand[i], diameter[i])); 
		} 

		// after adding values printing the values to test 
		// the custom arraylist 
		printValues(list); 
	} 

	public void printValues(ArrayList<Data> list) 
	{ 
		// list- the custom arraylist is sent from 
		// previous function 

		for (int i = 0; i < n; i++) 
		{ 
			// the data received from arraylist is of Wheel type 
			// which is custom (String, double) 
			// based on class Wheel

			Data data = list.get(i); 
 
			System.out.println(data.brand+" "+data.diameter);
		} 
	} 
} 
	