package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void checkInsertPlayer() {
    Player player = new Player('x');

    assertEquals('x', player.currentPlayer());
  }

  @Test
  public void checkChangePlayer() {
    Player player = new Player('x');
    player.changeToPlayer(player.currentPlayer());

    assertEquals('o', player.currentPlayer());
  }
  
}
