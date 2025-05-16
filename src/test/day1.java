package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"URL"})
	@Test()
	public void demo(String urlname)
	{
		System.out.println("Hello");
		System.out.println(urlname);
	}
	
	@Test(groups={"Smoke"})
	public void demosecond()
	{
		System.out.println("World");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("I will execute Last");
	}
	
	@BeforeMethod
	public void beforeanymethod()
	{
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void afteranymethod()
	{
		System.out.println("I will execute after every method");
	}
}
