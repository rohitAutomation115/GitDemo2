package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {
	
	@Test(dataProvider="getData")
	public void datausingtest(String uname,String pass)
	{
		System.out.println(uname);
		System.out.println(pass);
		System.out.println("*************");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="FirtsUsername";
		obj[0][1]="FirstPassword";
		
		obj[1][0]="SecondUsername";
		obj[1][1]="SecondPassword";
		
		obj[2][0]="ThirdUsername";
		obj[2][1]="ThirdPassword";
		
		return obj;
		
	}
}
