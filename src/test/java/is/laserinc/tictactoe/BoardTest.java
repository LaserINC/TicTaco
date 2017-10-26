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

    @Test
    public void checkInitializeBoard2(){
      Board board = new Board();
      board.mark('x', 1);
      board.mark('x', 2);
      board.mark('x', 3);
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

    @Test
    public void checkWinnerRow(){
      // create test for this
    	Board t = new Board();
		t.mark('x', 1);
		t.mark('x', 4);
		t.mark('x', 7);
		assertTrue("board should return 'true'", t.checkWin('x'));
    }

    @Test
    public void checkWinnerColumn(){
      // create test for this
    	Board t = new Board();
		t.mark('o', 1);
		t.mark('o', 4);
		t.mark('o', 7);
		assertTrue("board should return 'true'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerColumnPlayer2(){
      // create test for this
    	Board t = new Board();
		t.mark('x', 1);
		t.mark('x', 2);
		t.mark('x', 3);
		assertTrue("board should return 'true'", t.checkWin('x'));
    }
    @Test
    public void checkWinnerColumnPlayer2_2(){
      // create test for this
    	Board t = new Board();
		t.mark('x', 1);
		t.mark('x', 2);
		t.mark('x', 3);
		assertFalse("board should return 'false'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerCross(){
      // create test for this
    	Board t = new Board();
		t.mark('o', 1);
		t.mark('o', 5);
		t.mark('o', 9);
		assertTrue("board should return 'true'", t.checkWin('o'));
    }


    @Test
    public void checkWinnerFalse(){
      // create test for this
    	Board t = new Board();
		assertFalse("board should return 'false'", t.checkWin('o'));
    }

    
    @Test
    public void checkWinnerPlayerO() {
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 5);
        t.mark('o', 9);
        assertEquals(t.checkWin(), 'o');
    }

    @Test
    public void checkWinnerPlayerX() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 5);
        t.mark('x', 9);
        assertEquals(t.checkWin(), 'x');
    }

    @Test
    public void checkIfNoWinner(){
        Board t = new Board();
        t.mark('x', 1);
        t.mark('o', 4);
        t.mark('o', 7); 
        assertEquals('u', t.checkWin());   
    }
}

	