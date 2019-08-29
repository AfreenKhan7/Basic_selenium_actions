package basic_functions;

import org.testng.annotations.Test;

public class Assert {
	@Test
	public void Test1() {
		  int exp = 50;
		  int actual =50;
		  Assert.assertEquals(actual, exp,"Error-msg");
	}
	private static void assertEquals(int actual, int exp, String string3) {
		
	}
	
	
	
	@Test
	public void Test2() {
		Assert.assertEquals("hello", "welcome","Error-msg");
	}
	private static void assertEquals(String string, String string2, String string3) {	
	}
	

	@Test
	public void Test3() {
		
	Object test=null;
		Assert.assertNull(test,"object not null");
	}
	private static void assertNull(Object test, String string) {
	}
	
	
	@Test
	public void Test4() {
		Assert.fail("failing the test");
	}
	private static void fail(String string) {
	}
}