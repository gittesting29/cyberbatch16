package testNGExample;

import org.testng.annotations.Test;

public class TestngExample3 
{
	@Test(priority=1)
	public void testCase1()
	{
		System.out.println("I am TestCase1");
	}
	
	@Test(priority=3)
	public void testCase2()
	{
		System.out.println("I am TestCase2");
	}
	
	@Test(priority=2)
	public void testCase3()
	{
		System.out.println("I am TestCase3");
		try {
		int i=67/0;}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test(priority=4)
	public void testCase4()
	{
		System.out.println("I am TestCase4");
	}
}
