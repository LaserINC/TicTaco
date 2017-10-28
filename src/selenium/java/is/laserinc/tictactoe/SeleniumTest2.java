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


