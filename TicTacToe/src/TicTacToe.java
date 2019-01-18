import java.util.Scanner;

public class TicTacToe {
	
	public static char[][] board = new char [3][3];
	public static char currentPlayer = 'x';
	public static int row;
	public static int col;
	public static boolean isValid = false;
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createBoard();
		printBoard();
		makeMove();
		
		while (checkForWin() || isBoardFull() == false) {
			printBoard();
			changePlayer();
			makeMove();
			printBoard();
			checkForWin();
			if (checkForWin() == true) {
				System.out.println(currentPlayer + " is the winner!!");
				break;
			} 
		}
		
		reader.close();
	}
	
	public static void createBoard() {
		//loop through rows
		for (int i = 0; i < 3; i++) {
		// loop through columns
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public static void printBoard() {
		System.out.println("  0   1   2");
	    System.out.println("0 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);  
	    System.out.println("-------------");
	    System.out.println("1 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);  
	    System.out.println("-------------");
	    System.out.println("2 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]); 
	}
	
	//determines if the board is full or if there is a blank space to play in
	public static boolean isBoardFull() {
		boolean isFull = true;
		//loop through rows
		for (int i = 0; i < 3; i++) {
		// loop through columns
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					isFull = false;
				}
			}
		}
		return isFull;
	}
	//changes players
	public static char changePlayer() {
		if (currentPlayer == 'x') {
			currentPlayer = 'o';
		} else {
			currentPlayer = 'x';
		} return currentPlayer;
	}
	
	//takes player input as move and makes move if valid
	public static void makeMove() {
		
		System.out.println("Player " + currentPlayer + ": pick a row");
	    int row = reader.nextInt();
	    reader.nextLine();
	    System.out.println("Player " + currentPlayer + ": pick a column");
	    int col = reader.nextInt();
	    
	    if ((row >= 0) && (row < 3)) {
	    	if ((col >= 0) && (col < 3)) {
	    		if (board[row][col] == '-') {
	    			board[row][col] = currentPlayer;
	    		}
	    	}
	    } else System.out.println("Oops! That move is not valid. Try again");
	}
		 
	
	//Checking for winner
	//set up for all other check win functions
	private static boolean checkRowCol(char c1, char c2, char c3) {
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	}
	
	//checks for all wins
	public static boolean checkForWin() {
		return (checkRows() || checkCols() || checkDiagonals());
	}
	
	//rows
	public static boolean checkRows() {
		for (int i=0; i <3; i++) {
			if (checkRowCol(board[i][0], board [i][1], board [i][2]) == true) {
				return true;
			}
		} return false;
	}
	
	//columns
	public static boolean checkCols() {
		for (int i=0; i <3; i++) {
			if (checkRowCol(board[0][i], board [1][i], board [2][i]) == true) {
				return true;
			}
		} return false;
	}
	
	//diagonals
	public static boolean checkDiagonals() {
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	}

	
}
