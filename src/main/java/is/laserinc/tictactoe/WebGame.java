package is.laserinc.tictactoe;
import java.util.*;

import static spark.Spark.*;

public class WebGame {

	

	public static void main(String[] args) {
		//TicTacToe tic = new TicTacToe();
		//tic.playGame();
		get("/", (req, res) -> "TicTacToe");
		//Go To localhost:4567 on a web browser

		/*
		this should find the src/main/resources/public/index.html file
		staticFileLocation("/Public");
		port(4567);
		*/
	}
}