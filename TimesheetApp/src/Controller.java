//TIMESHEET APP NOT UR PROJECT DO NOT EDIT

import java.util.List;

public class Controller {

	/* Member variables */

    Timesheet timesheet;
    ConsoleUtils consoleUtils;
    

    /* Constructor */

    public Controller(){
        this.timesheet = new Timesheet();
        this.consoleUtils = new ConsoleUtils();
    }

    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("stop")) {

                processStopAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

                quit = true;

            } else if (action.equals("help")) {

            	consoleUtils.printHelp();

            } else if(action.length() ==0 ){

                // do nothing.

            } else {

                // Your code here

            }
        }

    }

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Timesheet
	 */
    public void processStopAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);

        TimesheetEntry myEntry = timesheet.get(id);
        timesheet.stop(myEntry);
    }

	/*
	 * The user requested that a given TimesheetEntry be deleted
	 * This method conveys that request to the Timesheet
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);

		TimesheetEntry myEntry = timesheet.get(id);
		timesheet.delete(myEntry);
    }

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    
    public void processListAction(String[] actionParts){

        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        } else {
        	List<TimesheetEntry> entries = timesheet.list();
        	consoleUtils.printList(entries); 
        }
        }
        
        /* active only part add on
        if(actionParts[1] == "-a") {
        	List<TimesheetEntry> entries = timesheet.list(true);
        	consoleUtils.printList(entries);
        }
        	List<TimesheetEntry> entries = timesheet.list(false);
        	consoleUtils.printList(entries);
        } 
        */ 
        	

	/*
	 * The user wants to add a new entry to the Timesheet
	 * This method conveys that request to the Timesheet, along with
	 * the specified project name and task description 
	 */
    
    public void processAddAction(){

        String project = consoleUtils.promptString("Project:");
        String description = consoleUtils.promptString("Task:");
        
        if (project.contains(" ")) {
        	consoleUtils.error("Project name must be 1 word");
            return;
        } else {
        	timesheet.add(project, description);
        }
    }
} 
