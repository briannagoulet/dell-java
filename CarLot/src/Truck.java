
public class Truck extends Vehicle {

	private int bedSize;
	public Truck() {
		
	}
	
	public void setBedSize(int bedSize) {
		this.bedSize = bedSize;
	}
	
	public int getBedSize() {
		return bedSize;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("Bed size: " + getBedSize());
	}
}
