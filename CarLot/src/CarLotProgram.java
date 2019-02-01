
public class CarLotProgram {

	public static void main(String[] args) {
		
		//create 2 parking lots
		CarLot lot1 = new CarLot(10);
		lot1.name = "Lot 1";
		CarLot lot2 = new CarLot(5);
		lot2.name = "Lot 2";
		
		//create many vehicles
		
		Car car1 = new Car();
		car1.setLicenseNum("FHE4383");
		car1.setMake("Toyota");
		car1.setModel("Corolla");
		car1.setType("Sedan");
		car1.setPrice("$20,000");
		car1.setDoors(4);
		
		Car car2 = new Car();
		car2.setLicenseNum("BSK2176");
		car2.setMake("Nissan");
		car2.setModel("Altima");
		car2.setType("Coupe");
		car2.setDoors(2);
		car2.setPrice("$27,000");
		
		Car car3 = new Car();
		car3.setLicenseNum("QUBE392");
		car3.setMake("Ford");
		car3.setModel("Mustang");
		car3.setType("Convertible");
		car3.setDoors(2);
		car3.setPrice("$14,000");
		
		Car car4 = new Car();
		car4.setLicenseNum("FPL2152");
		car4.setMake("Hyundai");
		car4.setModel("Santa Fe");
		car4.setType("SUV");
		car4.setDoors(4);
		car4.setPrice("$9,000");
		
		Car car5 = new Car();
		car5.setLicenseNum("HVR2899");
		car5.setMake("Audi");
		car5.setModel("CX9");
		car5.setType("SUV");
		car5.setDoors(4);
		car5.setPrice("$34,000");
		
		Truck truck1 = new Truck();
		truck1.setLicenseNum("CRW1954");
		truck1.setMake("Ford");
		truck1.setModel("F-150");
		truck1.setBedSize(28);
		truck1.setPrice("$21,000");
		
		Truck truck2 = new Truck();
		truck2.setLicenseNum("PBN0823");
		truck2.setMake("Ford");
		truck2.setModel("F-250");
		truck2.setBedSize(35);
		truck2.setPrice("$19,000");
		
		Truck truck3 = new Truck();
		truck3.setLicenseNum("IDS0927");
		truck3.setMake("Toyota");
		truck3.setModel("Tundra");
		truck3.setBedSize(29);
		truck3.setPrice("$18,000");

		//park cars in lots and print lot info
		lot1.addVehicle(truck1, 3);
		lot1.addVehicle(truck2, 7);
		lot1.addVehicle(car2, 5);
		lot2.addVehicle(car3, 1);
		lot2.addVehicle(car1, 4);
		lot2.addVehicle(truck3, 5);
		lot1.printInventory();
		lot2.printInventory();
	}

}
