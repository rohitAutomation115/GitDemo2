package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class iframes {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("Rohit");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select dropdown=new Select(driver.findElement(By.id("course")));
		
		dropdown.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("Joshi");
	}

}
