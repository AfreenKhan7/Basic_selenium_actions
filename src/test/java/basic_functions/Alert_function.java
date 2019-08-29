package basic_functions;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Alert_function {
	WebDriver  driver;
	
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.ie.driver","resources\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	  }
	
  @Test
  public void Alert_with_textbox() throws InterruptedException {
	  
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	  
	  Alert altBX  = driver.switchTo().alert();
	  String AltMSG = altBX.getText();
	  
	  Thread.sleep(1000);
	  
	  System.out.println("alert message is : " + AltMSG);
	  
	  Thread.sleep(1000);
	  
	  altBX.sendKeys("afreen");
	  
	  Thread.sleep(1000);
	  
	  altBX.accept(); //click on OK button
	  //altBX.dismiss(); // clicks on cancel button
	  
	  
  }
  @Test
  public void Alert_with_OK() throws InterruptedException {
	  
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
	  
	  Alert altBX  = driver.switchTo().alert();
	  String AltMSG = altBX.getText();
	  
	  Thread.sleep(1000);
	  
	  System.out.println("alert message is : " + AltMSG);
	  
	  Thread.sleep(1000);
	  
	  //altBX.sendKeys("afreen");
	  
	  Thread.sleep(1000);
	  
	  altBX.accept(); //click on OK button
	  //altBX.dismiss(); // clicks on cancel button
	  
	  
  }
  
  @Test
  public void Alert_with_OK_and_CANCEL() throws InterruptedException {
	  
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	  
	  Alert altBX  = driver.switchTo().alert();
	  String AltMSG = altBX.getText();
	  
	  Thread.sleep(1000);
	  
	  System.out.println("alert message is : " + AltMSG);
	  
	  Thread.sleep(1000);
	  
	  //altBX.sendKeys("afreen");
	  
	  Thread.sleep(1000);
	  
	  altBX.accept(); //click on OK button
	  //altBX.dismiss(); // clicks on cancel button
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}