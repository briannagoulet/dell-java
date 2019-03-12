

public class ToDoItem {

	//define variables
	private int id;
	private String description;
	private Boolean completed;
	
	private static int nextID = 1;
	
	//constructor
	public ToDoItem(String toDoItem) {
		description = toDoItem;
		completed = false;
		id = nextID;
		nextID++;
	}

	//get methods
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Boolean isCompleted() {
		return completed;
	}
	
	//mark completed
	public void markDone() {
		completed = true;
	}
	
}
