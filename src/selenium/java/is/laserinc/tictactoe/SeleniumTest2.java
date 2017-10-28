package is.laserinc.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTest2 extends SeleniumTest {
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("TIC TAC TOE", driver.getTitle());
  }

  @Test
  public void testGameXWin() {
    driver.get(baseUrl);

    WebElement button = driver.findElement(By.id("1"));
    button.click();

    Thread.sleep(2000);

    button = driver.findElement(By.id("4"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("2"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("5"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("3"));
    button.click();
    
    Thread.sleep(2000);
    
    WebElement results = driver.findElement(By.id("message_prompt"));
    assertEquals("Winner is x!", results.getText());
    //assertEquals("TicTacToe", driver.getTitle());
  }

  @Test
  public void testGameOWin() {
    driver.get(baseUrl);

    button = driver.findElement(By.id("5"));
    button.click();
    
    Thread.sleep(2000);

    WebElement button = driver.findElement(By.id("1"));
    button.click();

    Thread.sleep(2000);

    button = driver.findElement(By.id("4"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("2"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("9"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("3"));
    button.click();
    
    Thread.sleep(2000);
    
    WebElement results = driver.findElement(By.id("message_prompt"));
    assertEquals("Winner is o!", results.getText());
    //assertEquals("TicTacToe", driver.getTitle());
  }


  @Test
  public void testGameTie() {
    driver.get(baseUrl);

    button = driver.findElement(By.id("1"));
    button.click();
    
    Thread.sleep(2000);

    WebElement button = driver.findElement(By.id("2"));
    button.click();

    Thread.sleep(2000);

    button = driver.findElement(By.id("3"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("5"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("4"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("6"));
    button.click();
    
    Thread.sleep(2000);
    
    button = driver.findElement(By.id("8"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("7"));
    button.click();
    
    Thread.sleep(2000);

    button = driver.findElement(By.id("9"));
    button.click();
    
    Thread.sleep(2000);
    WebElement results = driver.findElement(By.id("message_prompt"));
    assertEquals("Winner is o!", results.getText());
    //assertEquals("TicTacToe", driver.getTitle());
  }
}
  /*
  @Test
  public void checkClickButton() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("1")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("2")).click();
    Thread.sleep(100);
    driver.findElement(By.id("3")).click();
    Thread.sleep(100);
    driver.findElement(By.id("4")).click();
    Thread.sleep(100);
    driver.findElement(By.id("5")).click();
    Thread.sleep(100);
    driver.findElement(By.id("6")).click();
    Thread.sleep(100);
    driver.findElement(By.id("7")).click();
    Thread.sleep(100);
    
    //WebDriverWait wait = new WebDriverWait(driver, 10);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message_prompt")));
    //String found = driver.findElement(By.id("message_prompt")).getText();
    //String expected = "winner is x!";
    //assertEquals(expected, found);
    */


