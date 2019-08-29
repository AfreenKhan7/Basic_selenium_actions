package basic_functions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Handle_frames {
	
	WebDriver driver;
	
  @Test
  public void frames() throws InterruptedException {
	  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	  driver.switchTo().frame(0);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/div[2]/ul/li[6]/a")).click();
	  System.out.println(driver.getTitle());
	  
	  driver.switchTo().defaultContent();			Thread.sleep(1000);
	  driver.switchTo().frame("packageFrame");		Thread.sleep(1000);
	  
	

	  driver.findElement(By.xpath("/html/body/div/ul/li[1]/a")).click();
	  System.out.println(driver.getTitle());
	  
	  
	  driver.switchTo().defaultContent();			Thread.sleep(1000);
	  driver.switchTo().frame("classFrame");		Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/dl[1]/dd/a[1]")).click();
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver","resources\\IEDriverServer.exe");
	  driver= new InternetExplorerDriver();
	driver.manage().window().maximize();
	
	
	
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}

