
public class LicenseProgram {

	public static void main(String[] args) {
	
		//first license
		DriversLicense myLicense = new DriversLicense();
		myLicense.firstName = "Brianna";
		myLicense.lastName = "Goulet";
		myLicense.DOB = "09/27/1993";
		myLicense.height = "5 ft 3 in";
		myLicense.gender = 'F';
		
		//second license
		DriversLicense myLicense2 = new DriversLicense();
		myLicense2.firstName = "Daniela";
		myLicense2.lastName = "Villarreal";
		myLicense2.DOB = "07/11/1997";
		myLicense2.height = "5 ft 6 in";
		myLicense2.gender = 'F';
		
		//third license
		DriversLicense myLicense3 = new DriversLicense();
		myLicense3.firstName = "Kenneth";
		myLicense3.lastName = "Cassady";
		myLicense3.DOB = "01/04/1993";
		myLicense3.height = "6 ft 0 in";
		myLicense3.gender = 'M';
		
		//print out driver info
		System.out.println("Driver name: " + myLicense.getFullName());
		System.out.println("Driver age: " + myLicense.getAge());
		System.out.println();
		System.out.println("Driver name: " + myLicense2.getFullName());
		System.out.println("Driver age: " + myLicense2.getAge());
		System.out.println();
		System.out.println("Driver name: " + myLicense3.getFullName());
		System.out.println("Driver age: " + myLicense3.getAge());
	}

}
