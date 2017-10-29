package is.laserinc.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends SeleniumWrapper {
  
  private String gameString;

  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    
    assertEquals("TIC TAC TOE", driver.getTitle());
  }

  @Test
  public void testGameXWin() throws Exception {
    gameString = "14253";

    for(int i = 0; i < gameString.length(); i++) {
      driver.findElement(By.id(Character.toString(gameString.charAt(i)))).click();
      Thread.sleep(1000);
    }
    
    String results = driver.findElement(By.id("message_prompt")).getText();
    
    assertEquals("Congratulations player x you are the winner!", results);
  }

  @Test
  public void testGameOWin() throws Exception {
    gameString = "514293";

    for(int i = 0; i < gameString.length(); i++) {
      driver.findElement(By.id(Character.toString(gameString.charAt(i)))).click();
      Thread.sleep(1000);
    }

    String results = driver.findElement(By.id("message_prompt")).getText();
    
    assertEquals("Congratulations player o you are the winner!", results);
  }

  @Test
  public void testGameTie() throws Exception{
    gameString = "123546879";

    for(int i = 0; i < gameString.length(); i++) {
      driver.findElement(By.id(Character.toString(gameString.charAt(i)))).click();
      Thread.sleep(1000);
    }

    String results = driver.findElement(By.id("message_prompt")).getText();
    
    assertEquals("Wow, we have a tie game!", results);
  }

  @Test
  public void testNumberHasAlreadyBeenUsed() throws Exception {
    gameString = "14234";

    for(int i = 0; i < gameString.length(); i++) {
      driver.findElement(By.id(Character.toString(gameString.charAt(i)))).click();
      Thread.sleep(1000);
    }

    String results = driver.findElement(By.id("message_prompt")).getText();
    
    assertEquals("This square has already been ticked! Choose another one!", results);
  }
  
}
