
public class Car extends Vehicle {
	
	private int doors;
	private String type;
	
	public Car() {
	}

	//getters and setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("Number of doors: " + getDoors());
		System.out.println("Car type: " + getType());
	}
}
