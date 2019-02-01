
public abstract class Vehicle {

	//Attributes
	private String licenseNum;
	private String make;
	private String model;
	private String price;
	private int spot;
	
	//set methods
	public void setLicenseNum(String licenseNum) {
			this.licenseNum = licenseNum;
		}
	public void setMake(String make) {
			this.make = make;
		}
	public void setModel(String model) {
			this.model = model;
		}
	public void setPrice(String price) {
			this.price = price;
		}
		
	//get methods
	public String getLicenseNum() {
		return licenseNum;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getPrice() {
		return price;
	}
	//print Description method
	public void printDescription() {
		System.out.println("License num: " + licenseNum);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}	
}

