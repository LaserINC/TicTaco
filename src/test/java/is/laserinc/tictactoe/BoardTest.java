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
    // TESTS FOR FUNCTION: canMove()
     @Test
    public void checkCanMove(){
        Board t = new Board();
        t.initializeBoard();
        assertTrue("PLayer can move",  t.canMove());
    }
    // TESTS FOR FUNCTION: mark(char player, int x)
    @Test
    public void checkMark1() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertTrue("should return 'true'", t.mark('x',3));
    }

    @Test
    public void checkMark2() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertTrue("should return 'true'", t.mark('x',4));
    }

    @Test
    public void checkMark3() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertFalse("should return 'false'", t.mark('x',1));
    }

    @Test
    public void checkMark4() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertFalse("should return 'false'", t.mark('x',2));
    }

    @Test
    public void checkMark5() {
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 2);
        assertFalse("should return 'false'", t.mark('x',1));
    }

    @Test
    public void checkMark6() {
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 2);
        assertFalse("should return 'false'", t.mark('x',2));
    }     
}

	