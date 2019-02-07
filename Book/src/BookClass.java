
public class BookClass {

	public static void main(String[] args) {
		
		Book book1 = new Book("Cravings", "Chrissy", "Teigen");
		
		System.out.println("Book title: " + book1.title);
		System.out.println("Author: " + book1.getAuthorName());
	}
}
