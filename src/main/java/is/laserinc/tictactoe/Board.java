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

}
