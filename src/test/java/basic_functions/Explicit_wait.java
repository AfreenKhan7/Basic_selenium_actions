package basic_functions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Explicit_wait {
	WebDriver driver;
	
  @Test
  public void Wait() {
	  
	  driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("k7afreen96");
	
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(.,'Next')]")).click();
	
	  WebDriverWait wait = new WebDriverWait(driver,60);
	  WebElement passWD = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@type,'password')]")));    //wait until the next button is pressed after entering the email id
	
	  System.out.println(passWD);
	  Assert.assertNotNull(passWD);
	
}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver","resources\\IEDriverServer.exe");
	  driver= new InternetExplorerDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//  driver.close();
  }

}