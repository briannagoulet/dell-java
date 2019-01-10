import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	    System.out.println("Choose: rock, paper or scissors: ");
	    
	    Scanner reader = new Scanner(System.in);
	    String playerOne = reader.nextLine();
	    
	  //assigns a value based on what the player chose
	    int playerOneNum = 0;
	    if (playerOne.equals("paper")) {
	    	playerOneNum = 1;
	    } else if (playerOne.equals("scissors")) {
	    	playerOneNum = 2;
	    }
	    
	    //computer value is chosen
	    Random randNumGenerator = new Random();
	    int randNum = randNumGenerator.nextInt(3); // Give me a random number between 0 (inclusive) and 3 (exclusive) -> 0, 1, or 2

	    if (randNum == 0) {
	    	System.out.println("I choose... rock");
	    }
	    if (randNum == 1) {
	      System.out.println("I choose... paper");
	    }
	    if (randNum == 2) {
	      System.out.println("I choose... scissors");
	    }
	    
	    reader.close();
	    
	    //compares player choices to see who wins
	    //if they are the same number
		if (randNum == playerOneNum) {
	    	System.out.println("It's a draw!");
	    }
		//if computer chooses rock
		if (randNum == 0) {
			if (playerOneNum == 1) {
				System.out.println("You win!"); //paper covers rock
			} else if (playerOneNum == 2) {
				System.out.println("I win!"); //rock beats scissors
			} else return;
		}
		
		//if computer chooses paper
		if (randNum == 1) {
			if (playerOneNum == 0) {
				System.out.println("I win!"); //paper covers rock
			} else if (playerOneNum == 2) {
				System.out.println("You win!"); //scissors cuts paper
			} else return;
		}
		
		//if computer chooses scissors
		if (randNum == 2) {
			if (playerOneNum == 0) {
				System.out.println("You win!"); //rock beats scissors
			} else if (playerOneNum == 1) {
				System.out.println("I win!"); //scissors cuts paper
			} else return;
		}

	}

}