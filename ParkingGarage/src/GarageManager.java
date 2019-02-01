
public class GarageManager {

	public static void main(String[] args) {
	
		//create a few parking garages with different capacities
		
		//Garage 1
		ParkingGarage garage1 = new ParkingGarage(10);
		ParkingGarage garage2 = new ParkingGarage(15);
		
		//create a few cars and park and unpark them
		
		//Car 1
			Car car1 = new Car();
			car1.color = "Black";
			car1.licenseNum = "AA23A78";
			car1.make = "Hyundai";
			car1.model = "Elantra";
			
		//Car 2
			Car car2 = new Car();
			car2.color = "Red";
			car2.licenseNum = "B2750DC";
			car2.make = "Volkswagon";
			car2.model = "Beetle";
			
		//Car 3
			Car car3 = new Car();
			car3.color = "White";
			car3.licenseNum = "RDF3247";
			car3.make = "Honda";
			car3.model = "CR-V";
			
		//Car 4
			Car car4 = new Car();
			car4.color = "Black";
			car4.licenseNum = "DIG3284";
			car4.make = "Nissan";
			car4.model = "Altima";
			
		//Car 5
			Car car5 = new Car();
			car5.color = "Blue";
			car5.licenseNum = "FRW3470";
			car5.make = "Hyundai";
			car5.model = "Accent";

		//Car 6
			Car car6 = new Car();
			car6.color = "Grey";
			car6.licenseNum = "FPL3847";
			car6.make = "Ford";
			car6.model = "F-150";
			
		//Car 7
			Car car7 = new Car();
			car7.color = "Blue";
			car7.licenseNum = "PFE1208";
			car7.make = "Toyota";
			car7.model = "Yaris";
			
		//Car 8
			Car car8 = new Car();
			car8.color = "Tan";
			car8.licenseNum = "TDY2091";
			car8.make = "Volvo";
			car8.model = "CX-40";

		//park and vacate car spaces
		garage1.park(car1, 0);
		garage1.park(car2, 2);
		garage1.park(car5, 2);
		garage1.park(car3, 22);
		garage1.vacate(5);
		garage1.printInventory();
		
		garage2.park(car4, 3);
		garage2.park(car5, 9);
		garage2.park(car6, 7);
		garage2.vacate(7);
		garage2.printInventory();
	}

}
