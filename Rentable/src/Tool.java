
public class Tool implements Rentable {
	
	//attributes
	public double hourlyRate;
	public String name;
	public String type;
	public String size; //S, M or L
	
	//constructor method
	public Tool(String toolName, double hourlyRate, String type, String size) {
		this.hourlyRate = hourlyRate;
		this.name = toolName;
		this.type = type;
		this.size = size;
	}
	
	//interface methods
	public String getDescription() {
		return name + ", type: " + type + ", size: "+ size + ", hourly rate: $" + hourlyRate;
	}
	
	public double getDailyRate() {
		return hourlyRate * 24;
	}
	
	public double getPrice(int days) {
		return (hourlyRate * 24) * days;
	}
	
	//get name method for price method
	public String getName() {
		return name;
	}
}
