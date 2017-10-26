package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {
	private Board gameBoard;
	private char playerX = 'x';
	private char playerO = 'o';

	TicTacToe() {
		// Create new initialized instance of board.
		gameBoard = new Board();
	}

	public int getInputNumberFromUser(Player player) {
		System.out.println(player.currentPlayer() + " Pick a number");

		Scanner scanner = new Scanner(System.in);
		char number = scanner.next().charAt(0);
		int numericValue = 0;

		//numericValue = Character.getNumericValue(number);
			if(Character.isDigit(number)) {
		    	numericValue = Character.getNumericValue(number);
					if(numericValue > 0 || numericValue < 10){
						  return numericValue;
					}
					else{
						System.out.println("Pick a number between 1 & 9");
						getInputNumberFromUser(player);
					}
			}

			System.out.println("Pick a number between 1 & 9");
			return getInputNumberFromUser(player);
	}

	// Play game of tic tac toe. The main game function. 
	// iterates through loop as many times as the size of the board(9 times). 
	// In each iteration, prints board, asks for next move, and validates that move.
	public void playGame() {
		int number = 0;
		gameBoard.printBoard();
		Player player = new Player(playerX);

		do {
			// Get input from user. 
			number = getInputNumberFromUser(player);

			// Play "inside game". Mark pos in bord, switch player
			// and check if either player has won.
			playGame(number, player, player.currentPlayer());

			// If board is not full then next player can move.
			if(gameBoard.canMove()) {
				number = getInputNumberFromUser(player);
				playGame(number, player, player.currentPlayer());			
			}

		}while(gameBoard.canMove() && gameBoard.checkWin() != 
			   playerX && gameBoard.checkWin() != playerO);

		// If no one can make a move. All numbers have been picked
		// and the game ended in a tie.
		if(!gameBoard.canMove()){
			System.out.println("It's a tie!");
			//askIfNewGame();
			System.exit(0);
		}
	}

	// Play "inner game" of game.  Mark pos in bord, switch player
	// and check if either player has won.
	public void playGame(int number, Player player, char currPlayer) {
		if(gameBoard.mark(player.currentPlayer(), number)) {
			gameBoard.printBoard();
			gameBoard.checkWin();

			if(gameBoard.checkWin() == player.currentPlayer()){
				System.out.println("Winner is " + currPlayer + "!");
				//askIfNewGame();
				System.exit(0);
			}

			// Change from current player to other player.
			player.changeToPlayer(currPlayer);
		}
		else { 
			System.out.println("Number has already been used"); 
		}

	}


	public static void main(String[] args) {
		TicTacToe tic = new TicTacToe();
		tic.playGame();

	}
}
