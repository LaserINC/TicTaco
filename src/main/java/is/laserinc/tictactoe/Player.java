package is.laserinc.tictactoe;
import java.util.*;

public class Player {

	private char player;

	public Player(char player) {
			this.player = player;
	}

	public char currentPlayer() {
			return this.player;
	}
}
