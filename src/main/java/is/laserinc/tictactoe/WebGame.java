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

	public static void main(String[] args) {
		WebGame g = new WebGame();
		//tic.playGame();
		String html = "<div style='float:right; width:200px; font-weight:bold;' id='message_prompt'></div><button onclick='makeMove(1)' id='1'>1</button>  <button onclick='makeMove(2)' id='2'>2</button>  <button onclick='makeMove(3)' id='3'>3</button> <br/><button onclick='makeMove(4)' id='4'>4</button>  <button onclick='makeMove(5)' id='5'>5</button>  <button onclick='makeMove(6)' id='6'>6</button> <br/><button onclick='makeMove(7)' id='7'>7</button>  <button onclick='makeMove(8)' id='8'>8</button>  <button onclick='makeMove(9)' id='9'>9</button> <br/> <button onclick='newGame();' id='new_game'>New game</button> <script src='https://code.jquery.com/jquery-3.2.1.min.js' integrity='sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=' crossorigin='anonymous'></script><script>function makeMove(field) {   $.get('/makeMove/'+field, { 'field': field }, function(data) { if(data.length == 1) { $('#'+field).html(data);  isTie(); } else { if(data.indexOf('x') != -1) { $('#'+field).html('x');  } else if(data.indexOf('o') != -1) { $('#'+field).html('o');  } $('#message_prompt').html(data); }  });  } function newGame() { $.get('/newGame/', function(data) { var counter = 1; $('#message_prompt').html(''); $('button').each(function() { if($(this).attr('id') != 'new_game') { $(this).html(counter); counter++; } });  }); }  function isTie() { var tie = true; $('button').each(function() { if($(this).html() != 'x' && $(this).html() != 'o' && $(this).attr('id') != 'new_game') { tie = false; } }); if(tie) { $('#message_prompt').html('Tie game'); } }</script>";

		get("/", (req, res) -> html);
		//Go To localhost:4567 on a web browser
		//
		post(
	        "/makeMove",
	        (req, res) -> {
	          String number = req.queryParams("number");
	          String result = g.playGame(number);
	          return result;
	        }
	      );

		get(
	        "/makeMove/:numbers",
	        (req, res) -> {
	          String number = req.params(":numbers");
	          String result = g.playGame(number);
	          return result;
	        }
	      );

		get(
	        "/newGame/",
	        (req, res) -> {
	        	g.newBoard();
	          return "";
	        }
	      );
	    
		/*
		this should find the src/main/resources/public/index.html file
		staticFileLocation("/Public");
		port(4567);
		*/
	}

	public String playGame(String number_string) {
		int number =  Integer.parseInt(number_string);
		if(gameBoard.mark(player.currentPlayer(), number)) {

			if(gameBoard.checkWin() == player.currentPlayer()){
				return "Winner is " + player.currentPlayer() + "!";
				//askIfNewGame();
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