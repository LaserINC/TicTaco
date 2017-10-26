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

	public char[][] getBoard() {
			return this.board;
	}

}
