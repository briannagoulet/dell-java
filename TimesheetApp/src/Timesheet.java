import java.util.List;
//import java.time.LocalDateTime;
import java.util.ArrayList;

public class Timesheet {

	private List<TimesheetEntry> database;
	
	public Timesheet() {
		database = new ArrayList<>();
	}
	
	public void add(String project, String task) {
		TimesheetEntry myEntry = new TimesheetEntry(project, task);
    	database.add(myEntry);
	}
	
	public List<TimesheetEntry> list() {
		return database;
	} 
	/*extended for active only feature
	 * public List<TimesheetEntry> list(boolean activeOnly) {
		if (activeOnly) {
	create new list of only active items
		Timesheet activeItems = new Timesheet();
		activeItems = new ArrayList<>();
		need to loop through database and find all active items and add them to new timesheet
			for(int i = 0; i < database.size(); i++) {
				TimesheetEntry currEntry = database.get(i);
				LocalDateTime currEndTime = currEntry.getEndTime();
				if (currEndTime == null) {
					String name = currEntry.getProjectName();
					String task = currEntry.getTask();
					int id = currEntry.getId();
					LocalDateTime startTime = currEntry.getStartTime();
					activeItems.add(name, task);
				}
			} return activeItems;
		} else return database;
	} 
	*/
	
	public TimesheetEntry get(int id) {
		for (int i = 0; i < database.size(); i++) {
			TimesheetEntry currEntry = database.get(i);
			int currId = currEntry.getId();
			if (currId == id) {
				return currEntry;
			}
		}
		return null;
	}
	
	public void delete(TimesheetEntry entry) {
		database.remove(entry);
	}
	
	public void stop(TimesheetEntry entry) {
		entry.updateEndTime();
	}
}
