package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void checkInsertPlayer(){
    Player player = new Player('x');
    assertEquals('x', player.currentPlayer());
  }

}
