package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {

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


	public static void main(String[] args) {
		Board game = new Board();
		game.printBoard();
		TicTacToe tic = new TicTacToe();
		Player player = new Player('x');
		int input = tic.getInputNumberFromUser(player);

		System.out.println("Selected: " + input);


	}
}
