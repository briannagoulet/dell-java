import java.util.Scanner;

public class RentableProgram {

	public static void main(String[] args) {
		Rentable[] rentalList = new Rentable[10];
		//hotel rooms
		Room room1 = new Room("Best Western", 150.00, "Suite", 2);
		Room room2 = new Room("JW Marriott", 105.45, "Standard room", 1);
		Room room3 = new Room("Days Inn", 98.00, "Standard room", 1);
		//condos
		Condo condo1 = new Condo("Brooks Tower", 1200.00, 4, 2, "mountains");
		Condo condo2 = new Condo("Continental Building", 800.00, 2, 2, "city");
		Condo condo3 = new Condo("Palms Place", 1150.00, 4, 3, "beach");
		Condo condo4 = new Condo("Woodland Hills", 750.00, 2, 1, "mountains");
		//tools
		Tool tool1 = new Tool("Chainsaw", 55.00, "Power Tool", "Medium");
		Tool tool2 = new Tool("Grill/Smoker Combo", 250.00, "Backyard Tools", "Large");
		Tool tool3 = new Tool("Power Washer", 40.00, "Hyrdo Tool", "Small");
		
		//adding rentable items to array
		rentalList[0] = room1;
		rentalList[1] = room2;
		rentalList[2] = room3;
		rentalList[3] = condo1;
		rentalList[4] = condo2;
		rentalList[5] = condo3;
		rentalList[6] = condo4;
		rentalList[7] = tool1;
		rentalList[8] = tool2;
		rentalList[9] = tool3;
		
		//prints a list of all items and descriptions
		for (int i = 0; i < rentalList.length; i++) {
			System.out.println(rentalList[i].getDescription());
		}
		
		
		//prompt user for date info
		Scanner reader = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a number of days: ");
		int days = reader.nextInt();
		System.out.println();
		
		for (int i = 0; i < rentalList.length; i++) {
			System.out.println(rentalList[i].getName() + ", price: $" + rentalList[i].getPrice(days)
					+ " for " + days +" days.");
		}
		
		reader.close();
	}

}
