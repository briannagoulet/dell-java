import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleUtils {

	private Scanner scanner;
	
	public ConsoleUtils(){
		scanner = new Scanner(System.in);
	}
	
	//Prints the menu of actions to the console

	   public void printHelp(){
	       System.out.println("Valid commands: ");
	       System.out.println("  add                   to add an item");
	       System.out.println("  delete                to delete an item");
	       System.out.println("  mark done             to mark the item as completed");
	       System.out.println("  list pending          to list all pending tasks");
	       System.out.println("  list done             to list all completed tasks");
	       System.out.println("  list all              to list all tasks");
	       System.out.println("  help                  print menu of available commands");
	       System.out.println("  quit                  quit the app");
	       System.out.println();

	   }
	   
	   /*
	   * Prompts the user to enter input
	   * Returns the text entered by the user
	   */
	   public String promptString(String label){
	        System.out.print(label+" ");
	        return scanner.nextLine();
	    }
	   
	   public void printList(ArrayList<ToDoItem> items){
		   int longestTask = 12;

	        for(ToDoItem item : items) {
	            if(item.getDescription().length() > longestTask) {
	            	longestTask = item.getDescription().length();
	            }
	        }

	        String taskHeader = String.format("%"+longestTask+"s", "Task");
	        String taskUnderline = "";
	        for(int i=0;i<longestTask;i++){
	            taskUnderline+="-";
	        }

	        System.out.println(" ID | "+taskHeader   +" | Status          ");
	        System.out.println("----+-"+taskUnderline+"-+----------------+");

	        for(ToDoItem item : items){
	            String task = String.format("%-"+longestTask+"s", item.getDescription());
	            String status = "";
	            if (item.isCompleted()) {
	            	status = "completed";
	            } else {
	            	status = "pending"; 
	            	}
	            String line = String.format(" %2s | %s | %s", item.getId(), task, status);
	            System.out.println(line);
	        }

	        if(items.size() == 1){
	            System.out.println("[1 entry]");
	        } else {
	            System.out.println("["+items.size()+" entries]");
	        }

	        System.out.println();
	    }
	   
	
}
