
public class CarLot {

	//attributes
	//use this one to count how many cars in the lot
	public static int carCount;
	public String name;
	public Vehicle[] listOfVehicles;
	
	//constructor method
	public CarLot(int capacity) {
		listOfVehicles = new Vehicle[capacity];
	}
	
	//set methods
	public void setName(String name) {
		this.name = name;
	}
	
	//add vehicle method
	public void addVehicle(Vehicle vehicle, int spot) {
		try { if (!(listOfVehicles[spot] == null)) {
			System.out.println("Cannot place vehicle in spot " + spot + " because it is taken."); }
			else listOfVehicles[spot] = vehicle;
		} catch(Exception e) {
			System.out.println("Cannot place vehicle in spot " + spot + " because it does not exist.");
			} 
	}
	
	//print inventory method
	public void printInventory() {
		carCount = 0;
		System.out.println("Lot name: " + name);
		for (int i = 0; i < listOfVehicles.length; i++) {
			if (!(listOfVehicles[i] == null)) {
			carCount++;
			listOfVehicles[i].printDescription();
			System.out.println();
		} 
		}
		System.out.println("Number of cars in lot: " + carCount);
		System.out.println();
	}
}
