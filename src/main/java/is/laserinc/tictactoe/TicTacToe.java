package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {

	public int getInputNumberFromUser(Player player) {
		System.out.println(player.currentPlayer() + " Pick a number");

		Scanner scanner = new Scanner(System.in);
		char number = scanner.next().charAt(0);
		System.out.println("char c = scanner: skilar : " + number);
		int numericValue = 7;

		if(Character.isDigit(number)){
			    numericValue = Character.getNumericValue(number);
			 
					if(0 < numericValue || numericValue < 10){
 						  System.out.println("komin í rétt range og returnar numval" + numericValue);	
 						  return numericValue;
 						  
					}
					else{
						System.out.println("Yes number but, Player " + player.currentPlayer() + ", Pick a number between 1 & 9");
						System.out.println("númer utan range og kallar aftur í sig");	
						getInputNumberFromUser(player);

					}

				}
				else{
				System.out.println("No I dont want letters, Player " + player.currentPlayer() + ", Pick a number between 1 & 9");
				System.out.println("var ekki tala og kallar aftur á sig");	
				getInputNumberFromUser(player);
			}
				System.out.println("komin út úr öllu og skilar " + numericValue);	
 				return numericValue;
	}

	public static void main(String[] args) {
		Board game = new Board();
		game.printBoard();
		TicTacToe tic = new TicTacToe();
		Player ple = new Player('x');
		int ble = tic.getInputNumberFromUser(ple);
		System.out.println(" selected: " + ble);

 
	}
}
