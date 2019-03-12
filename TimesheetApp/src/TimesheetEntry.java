import java.time.LocalDateTime;

public class TimesheetEntry {

	//variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	//static variables
	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		NEXTID++;
	}

	//get methods
	public String getProjectName() {
		return projectName;
	}

	public String getTask() {
		return task;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	public void updateEndTime() {
		if (endTime == null) {
			endTime = LocalDateTime.now();
		}
	}
	
}


