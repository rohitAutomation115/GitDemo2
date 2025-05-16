package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class enableDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its Enable");
			Assert.assertTrue(true);
		}
		else
			
		{
			System.out.println("its Disable");
		}		
	}

}
