package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");

		Thread.sleep(5000);
		
		driver.findElement(By.id("spnTraveller")).click();
		
		Thread.sleep(2000);
		
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.id("add")).click();
		}
		
		driver.findElement(By.id("traveLer")).click();
		
		String total=driver.findElement(By.id("spnDrpNo")).getText();
		
		System.out.println(total);
	}
		
	}


