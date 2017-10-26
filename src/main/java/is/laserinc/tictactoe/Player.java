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

	public void changeToPlayer(char changeFrom) {
		if(changeFrom == 'x') {
			this.player = 'o';
		}
		else if(changeFrom == 'o'){
			this.player = 'x';
		}
	}
}
