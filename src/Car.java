
public class Car {   // main selection always not needed. 
	
	private String make; // constructor
	private String color;// constructor instantiation
	private int modelYear;// constructor - is also a variable
	private int weight;	
	
	
		
	// stay away from null values. (Will hurt your project.)
	// invoking a method null causes NullpointerException
	// can also cause a NullreferenceException
	
	// getters and setters are methods
	// Getter method: exposes set attributes to other classes
	
	// Setter method: a method that sets up a class method to have an initial value or 	  	   check for invalid values.
	
	// Addition of customizable constructor
	
	public Car ( String color, String make, int modelYear, int weight) {
		this.color = color;
		this.make = make;
		this.modelYear = modelYear;
		this.weight = weight;
		
	}
	
	
	
	


public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getMake() {
	return make;
}



public void setMake(String make) {
	this.make = make;
}



public int getModelYear() {
	return modelYear;
}



public void setModelYear(int modelYear) {
	this.modelYear = modelYear;
}



public int getWeight() {
	return weight;
}



public void setWeight(int weight) {
	int defWeight = 2000;
	if (weight <= 0) {
		this.weight = defWeight;
		
	} else {
		this.weight = weight;
	}
}

public void start ()  {
	
	System.out.println("Starting the car...");
}

public void drive () {
	System.out.println("vroom vroom");
	

}

public void stop () {
	System.out.println("Stopping for gas");
}
 
}
