package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
			
			 WebElement src = driver.findElement(By.xpath("//div[@class='green']"));
			 
			 WebElement trg = driver.findElement(By.id("target"));
			  
			 Actions a=new Actions(driver);
			 
			 a.dragAndDrop(src, trg).build().perform();
			  
			 
	}

}
