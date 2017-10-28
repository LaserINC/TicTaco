package is.laserinc.tictactoe;
import java.util.*;

import static spark.Spark.*;

public class WebGame {

	private Board gameBoard;
	private char playerX = 'x';
	private char playerO = 'o';
	private Player player;
	
	public WebGame() {
		gameBoard = new Board();
		player = new Player('x');
	}

	public void newBoard() {
		gameBoard = new Board();
		player = new Player('x');
	}

	static int readPortOrDefault() {
      ProcessBuilder psb = new ProcessBuilder();
      if (psb.environment().get("PORT") != null) {
        return Integer.parseInt(psb.environment().get("PORT"));
      }
      return 4567;
    }

	public static void main(String[] args) {
		staticFileLocation("/public");
		port(readPortOrDefault());

		WebGame g = new WebGame();

		post("/makeMove",
	        (req, res) -> {
	          String number = req.queryParams("number");
	          String result = g.playGame(number);
	          return result;
	        }
	      );

		get("/makeMove/:numbers",
	        (req, res) -> {
	          String number = req.params(":numbers");
	          String result = g.playGame(number);
	          return result;
	        }
	      );

		get("/newGame/",
	        (req, res) -> {
	        	g.newBoard();
	          return "";
	        }
	      );

	}

	public String playGame(String number_string) {
		int number =  Integer.parseInt(number_string);
		if(gameBoard.mark(player.currentPlayer(), number)) {

			if(gameBoard.checkWin() == player.currentPlayer()){
				return "Winner is " + player.currentPlayer() + "!";
			}

			// Change from current player to other player.
			char pl = player.currentPlayer();
			player.changeToPlayer(player.currentPlayer());
			return ""+pl;
		}
		else {
			return "Number has already been used";
		}

	}
}