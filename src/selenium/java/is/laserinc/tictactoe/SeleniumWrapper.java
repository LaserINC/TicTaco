package is.laserinc.tictactoe;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public abstract class SeleniumWrapper {
  static ChromeDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    port = System.getenv("PORT");
    if (port == null) {
        port = "4567";
    }
    baseUrl = "http://localhost:" + port;
    //baseUrl = "https://tictactoe-assignment.herokuapp.com/"; // + port;
  }

  @Before
  public void setUp() {
    driver.get(baseUrl);
    driver.findElement(By.id("new_game")).click();
  }

  @After
  public void inEnd() {
    driver.findElement(By.id("new_game")).click();
  }
 
  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }

}
  