// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TigerSearch {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","WebDrivers/chromedriver.exe");
    driver = new ChromeDriver(new ChromeOptions());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void useCase1() {
    driver.get("https://tigercenter.rit.edu/tigerCenterApp/landing");
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.cssSelector(".img-text:nth-child(2)")).click();

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    {
      WebElement element = driver.findElement(By.name("termSelector"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.name("termSelector"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.name("termSelector"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.name("termSelector")).click();
    driver.findElement(By.cssSelector(".completer-input")).sendKeys("Swen 352");
    driver.findElement(By.cssSelector(".completer-input")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".classSearchAdvancedSearchText")).click();
    {

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      WebElement dropdown = driver.findElement(By.xpath("//div/div/div[3]/div/select"));
      dropdown.findElement(By.xpath("//option[. = 'RIT Main']")).click();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".styledSelect > .ng-dirty"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".styledSelect > .ng-dirty"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".styledSelect > .ng-dirty"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".styledSelect > .ng-dirty")).click();
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(6) .styledSelectWidthFix")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".col-xs-12:nth-child(6) .styledSelectWidthFix"));
      dropdown.findElement(By.xpath("//option[. = 'Golisano Col Comp&Info Science']")).click();
    }
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(6) .styledSelectWidthFix")).click();
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(8) .styledSelectWidthFix")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".col-xs-12:nth-child(8) .styledSelectWidthFix"));
      dropdown.findElement(By.xpath("//option[. = 'Software Engineering']")).click();
    }
    driver.findElement(By.id("mat-input-0")).sendKeys("Mkaouer");
    driver.findElement(By.id("mat-input-0")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(8) .styledSelectWidthFix")).click();
    driver.findElement(By.cssSelector(".col-xs-12:nth-child(14)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".advancedSearchDoneButton"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".advancedSearchDoneButton")).click();
    driver.findElement(By.cssSelector(".classSearchAttrsWidthFix")).click();
  }
}
