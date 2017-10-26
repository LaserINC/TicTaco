package is.laserinc.tictactoe;
import java.util.*;

public class Board {
	private char board[][];
	private int boardSize = 3;

	// Initialize new board of size 3x3.
	public Board() {
		board = new char[3][3];
		initializeBoard();
	}

	public void initializeBoard() {
		int counter = 1;
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				char number = Integer.toString(counter).charAt(0);
				board[i][j] = number;
				counter++;
			}
		}
	}


	public void printBoard() {
 		System.out.println("\n" + " " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n" + 
 						   "-----------" + "\n" +
 						   " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n" +
 						   "-----------" + "\n" +
 						   " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] );
  	}

	public char[][] getBoard() {
			return this.board;
	}
	// Check if board is full or not.
	public boolean canMove() {
		for (int i = 0; i < boardSize; i++) {
	    	for (int j = 0; j < boardSize; j++) {
	        	if (board[i][j] != 'x' && board[i][j] != 'o') {
	            	return true;
	            }
	        }
	    }
	    return false;
	}

	// Mark place in board, choosen by player. Returns true
	// if marking succedes, else false if the
	// place has already been marked.
	public boolean mark(char player, int x) {
		int counter = 1;
		if(x >= 0 || x <= boardSize) {
			for(int i = 0; i < boardSize; i++) {
				for(int j = 0; j < boardSize; j++) {
					// If place in board is found, it is marked by the player
					// making the move.
					if(counter == x){
						if(board[i][j] != 'x' && board[i][j] != 'o') {
							board[i][j] = player;
							return true;
						}
						else {
							System.out.println("Number has already been used");
							return false;
						}
					}
					counter++;
				}
			}
		}
		return false;
	}

}
