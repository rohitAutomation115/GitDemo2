package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL"})
	@Test
	public void ploan(String urname)
	{
		System.out.println("Rohit personal loan");
		System.out.println(urname);
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("I will execute before suit");
	}
}
