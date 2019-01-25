
public class ParkingGarage {

	//Attributes
	public Car[] carsArray;
	//public int capacity;
	//public int spot;
	
	//constructor method
	public ParkingGarage(int capacity) {
		carsArray = new Car[capacity];
	}
	
	//method to add car to parking spot
	public void park(Car car, int spot) {
		carsArray[spot] = car;
	}
	
	//method to remove car from spot
	public void vacate(int spot) {
		carsArray[spot] = null;
		
	}
	
	//method to print the list of all cars and descriptions
	//should include stall number and color, license, make and model
	public void printInventory() {
		for (int i = 0; i < carsArray.length; i++) {
			if (!(carsArray[i] == null)) {
			System.out.println("Spot number: " + i);
			System.out.println("Car color: " + carsArray[i].color);
			System.out.println("Car make: " + carsArray[i].make);
			System.out.println("Car model: " + carsArray[i].model);
			System.out.println("License plate: " + carsArray[i].licenseNum);
			System.out.println();
		} 
		}
	}
	
}

