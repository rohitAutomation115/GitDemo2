package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void WebLogincarLoan()
	{
		System.out.println("Get a car loan with web");
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("Get a car loan with mobile");
	}
	
	@BeforeClass
	public void beforeevryclass()
	{
		System.out.println("Before class I will execute");
	}
	
	@Parameters({"URL"})
	@Test
	public void APILogincarLoan(String uname)
	{
		System.out.println("Get a car loan with api");
		System.out.println(uname);
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I will execute first");
	}
	
}
