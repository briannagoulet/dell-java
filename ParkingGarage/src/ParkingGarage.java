
public class ParkingGarage {

	//Attributes
	public Car[] carsArray;
	
	//constructor method
	public ParkingGarage(int capacity) {
		carsArray = new Car[capacity];
	}
	
	//method to add car to parking spot
	public void park(Car car, int spot) {
		try { if (!(carsArray[spot] == null)) {
			System.out.println("Cannot place car in spot " + spot + " because it is taken."); }
			else carsArray[spot] = car;
		} catch(Exception e) {
			System.out.println("Cannot place car in spot " + spot + " because it does not exist.");
			} 

	}
	
	//method to remove car from spot
	public void vacate(int spot) {
		if (carsArray[spot] == null) {
			System.out.println("Cannot remove car from spot " + spot + " because this parking spot is empty.");
		}
		else if (!(carsArray[spot] == null)) {
			carsArray[spot] = null;
		} 
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

