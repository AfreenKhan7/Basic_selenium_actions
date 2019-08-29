package basic_functions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Drag_Drop {
	
	WebDriver driver;
	
  @Test
  public void draganddrop() throws InterruptedException {
  
  
  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
  
  
  WebElement dropElement = driver.findElement(By.id("draggable"));
  WebElement dragElement = driver.findElement(By.id("droppable"));
  
  Actions act= new Actions(driver);
  Thread.sleep(2000);
  act.dragAndDrop(dragElement, dropElement).build().perform();
  System.out.println("The element is dragged and dropped");
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.ie.driver","resources\\IEDriverServer.exe");
	  driver= new InternetExplorerDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}