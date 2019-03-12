import java.util.ArrayList;

public class Dao {

	ArrayList<ToDoItem> toDoList;
	
	
	
	public Dao() {
		toDoList = new ArrayList<>();
		
	}
	
	public void add(String description) {
		ToDoItem item = new ToDoItem(description);
    	toDoList.add(item);
	}
	
	public ArrayList<ToDoItem> list() {
		return toDoList;
	}
	
	public void delete(ToDoItem entry) {
		toDoList.remove(entry);
	}
	
	//method to update completed tasks
	public void markDone(ToDoItem entry) {
		entry.markDone();
	}
	
	public ToDoItem get(int id) {
		for (int i = 0; i < toDoList.size(); i++) {
			ToDoItem currEntry = toDoList.get(i);
			int currId = currEntry.getId();
			if (currId == id) {
				return currEntry;
			}
		}
		return null;
	}
	
	public ArrayList<ToDoItem> getCompleted() {
		ArrayList<ToDoItem> completedList = new ArrayList<>();
		for (int i = 0; i <toDoList.size(); i++) {
			ToDoItem currItem = toDoList.get(i);
			boolean status = currItem.isCompleted();
			if (status) {
				completedList.add(currItem);
			} 
		} return completedList;
	}
	
	public ArrayList<ToDoItem> getPending() {
		ArrayList<ToDoItem> pendingList = new ArrayList<>();
		for (int i = 0; i <toDoList.size(); i++) {
			ToDoItem currItem = toDoList.get(i);
			boolean status = currItem.isCompleted();
			if (!status) {
				pendingList.add(currItem);
			} 
		} return pendingList;
	}
	
}
