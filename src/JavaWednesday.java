
public class JavaWednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car ("Red", "Jaguar", 2024, 2000);// Version 2 uses definitions of Car.java
		
		//new keyword creates a space in memory for the object
		
		myCar.start();// Calls the start method from Car
		myCar.setWeight(3000);
		
		//myCar.color = "Blue";// Version 1
		//myCar.make = "Tacoma";
		
		System.out.println("My Car is a " + myCar.getColor() + " " + myCar.getMake() + " " + myCar.getModelYear());
		System.out.println(myCar.getWeight());
	}

}
//industry standard to have classes public and attributes private.
//getters and setters are used to access private attributes


