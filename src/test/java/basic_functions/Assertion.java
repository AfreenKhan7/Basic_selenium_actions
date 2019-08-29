package basic_functions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
  @Test
  public void Test1() {
	  System.out.println("Test 1 started");
	  Assert.assertTrue(20>18,"20 is greater than 18");
	  System.out.println("Test 1 completed");
  }
  
  
  @Test
  public void Test2() {
	  System.out.println("Test 2 started");
	  Assert.assertTrue(20<15, "20 is not less than 18");
	  System.out.println("Test 2 completed");
	  
  }
  @Test
  public void Test3() {
	  System.out.println("Test 3 started");
	  Assert.assertFalse("Hello".equals("Hi"), "Hello is not equal to Hi");
	  System.out.println("Test 3 completed");
}
  
}
