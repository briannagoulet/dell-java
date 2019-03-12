import java.util.ArrayList;
import java.util.Scanner;

//add error message bullshit and the if statements to 
public class Controller {
	
	//member variables
	ConsoleUtils consoleUtils;
	Dao toDoList;
	Scanner reader = new Scanner(System.in);
	
	//constructor
	public Controller(){
        this.toDoList = new Dao();
        this.consoleUtils = new ConsoleUtils();
    }
	
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

                processDeleteAction();

            } else if (action.equals("list")) {

                processListAction();

            } else if (action.equals("quit")) {

                quit = true;

            }else if (action.equals("mark")) {

                processMarkDoneAction();

            } else if (action.equals("help")) {

            	consoleUtils.printHelp();

            } else if(action.length() == 0 ){

            	consoleUtils.printHelp();
            	} 
        }
      }
	
	//delete a task
	public void processDeleteAction(){

        int id = Integer.parseInt(consoleUtils.promptString("Enter an item ID: "));
		ToDoItem item = toDoList.get(id);
		toDoList.delete(item);
		System.out.println("[item deleted]");
    }
	
	public void processListAction(){
		
		String listType = consoleUtils.promptString("Please select: all, pending, or completed: ");
		System.out.println(listType);
		if (listType.equals("pending")) {
			
			ArrayList<ToDoItem> items = toDoList.getPending();
			consoleUtils.printList(items);
			
		} else if (listType.equals("completed")) {
			
			ArrayList<ToDoItem> items = toDoList.getCompleted();
			consoleUtils.printList(items);
			
		} else if (listType.equals("all")) {
			
        ArrayList<ToDoItem> items = toDoList.list();
        consoleUtils.printList(items); 
		}
		}
    
	
	//add a task
	public void processAddAction(){
		
        String description = consoleUtils.promptString("Enter a task: ");
        toDoList.add(description);
        System.out.println("[item added]");
    }
	
	//mark a task complete
	public void processMarkDoneAction() {
		
		int id = Integer.parseInt(consoleUtils.promptString("Enter an item ID: "));
        ToDoItem item = toDoList.get(id);
        item.markDone();
        System.out.println("[item completed]");
	}
}


