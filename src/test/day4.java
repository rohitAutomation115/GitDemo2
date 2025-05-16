package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("Get a Home loan with web");
	}
	
	
	@Test(enabled=false)
	public void MobileLoginHomeLoan()
	{
		System.out.println("Get a Home loan with mobile");
	}
	
	
	@Test(dependsOnMethods="WebLoginHomeLoan")
	public void APILoginHomeLoan()
	{
		System.out.println("Get a Home loan with api");
	}
	
	@Test
	public void MobileSignInHomeLoan()
	{
		System.out.println("Sign in with mobile");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogoutHomeLoan()
	{
		System.out.println("Logout with mobile");
	}
	
}
