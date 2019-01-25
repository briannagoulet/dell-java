
public class Car {
	
	//Attributes
	public String color;
	public String licenseNum;
	public String make;
	public String model;
	public int spot;


	//constructor method
	public Car() {
	
	}
	
	//set methods
	public void setColor(String color) {
		this.color = color;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	//get methods
	public String getColor() {
		return color;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
}