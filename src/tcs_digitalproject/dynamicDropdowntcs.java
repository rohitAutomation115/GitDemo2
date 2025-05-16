package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdowntcs {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00$mainContent$ddl_originStation1")).click();
		
		driver.findElement(By.xpath("//a[@value='KNU']")).click();
		
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		
	}

}
