
public class Book {
	
	public String title;
	public String authorFirst;
	public String authorLast;
	
	//constructor method
	public Book() {
		
	}
	
	public Book(String myTitle, String firstName, String lastName) {
		title = myTitle;
		authorFirst = firstName;
		authorLast = lastName;
		
	}
	
	//set methods
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFirstName(String authorFirst) {
		this.authorFirst = authorFirst;
	}
	
	public void setLastName(String authorLast) {
		this.authorLast = authorLast;
	}
	
	//get methods
	public String getTitle() {
		return title;
	}
	
	public String getAuthorName() {
		return authorFirst + " " + authorLast;
	}
	
	public void printAuthorName() {
		System.out.println(getAuthorName());
	}
	
}

