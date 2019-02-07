
public class Condo implements Rentable {
	
	//attributes
	public double weeklyRate;
	public String name;
	public int beds;
	public int bathrooms;
	public String location; //will be either beach, ski or city
	
	//constructor method
	public Condo(String condoName, double weeklyRate, int beds, int bathrooms, String location) {
		this.weeklyRate = weeklyRate;
		this.name = condoName;
		this.beds = beds;
		this.bathrooms = bathrooms;
		this.location = location;
	}
	
	//interface methods
	public String getDescription() {
		return name + " " + beds + " beds " + bathrooms + " bathrooms in the " + location + ". Weekly rate: $" + weeklyRate;
	}
	//get name method for price method
	public String getName() {
		return name;
	}
	
	public double getDailyRate() {
		return weeklyRate / 7;
	}
	
	public double getPrice(int days) {
		return (weeklyRate / 7) * days;
	}
}
