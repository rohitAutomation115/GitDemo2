package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		Thread.sleep(3000);
		
		WebElement sdropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
				
		Select dropdown=new Select(sdropdown);
		
		//select using visible text
		//dropdown.selectByValue("1");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select using index
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}

}
