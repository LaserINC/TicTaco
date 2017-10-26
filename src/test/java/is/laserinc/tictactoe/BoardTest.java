package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

	// TESTS FOR FUNCTION: initializeBoard()
    @Test
    public void checkInitializeBoard(){
      Board board = new Board();
      board.initializeBoard();
      char board2[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
      assertArrayEquals(board.getBoard(), board2);
    }

}

	