package testNGExample;

import org.testng.annotations.Test;

public class TestngExample4 {
	@Test(invocationCount = 6)
	public void testSignIN() {
		System.out.println("User successfully signed in the application.");
	}
}
