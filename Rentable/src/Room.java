
public class Room implements Rentable{
	public double dailyRate;
	public String name;
	public String roomType;
	public int beds;
	
	public Room(String roomName, double dailyRate, String roomType, int beds) {
		this.dailyRate = dailyRate;
		this.name = roomName;
		this.roomType = roomType;
		this.beds = beds;
	}
	
	//need get name method for price method
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return name + " " + roomType + " " + beds + " beds. Daily rate: $" + dailyRate;
	}
	
	public double getDailyRate() {
		return dailyRate;
	}
	
	public double getPrice(int days) {
		return dailyRate * days;
	}
}
