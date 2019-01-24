
public class DriversLicense {
	
	//Attributes
	public String firstName;
	public String lastName;
	public String DOB;
	public char gender;
	public String height;
	public int age;

	//get method returns the current value of attribute
	//set method 
	
//Constructor method
public DriversLicense() {
	
}

//set methods
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public void setHeight(String height) {
	this.height = height;
}

public void setGender(char gender) {
	this.gender = gender;
}

//get methods
//gets full name by combining first and last name
public String getFullName() {
	return firstName + " " + lastName;
}

//gets age by calculating age based on today's date
public int getAge() {
	String [] dateParts = DOB.split("/");
	String year = dateParts[2];
	int yearInt = Integer.parseInt(year);	
	age = 2018 - yearInt;
	return age;
}
}