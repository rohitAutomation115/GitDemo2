package tcs_digitalproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Date="16";
		String Month="September";
		String Year="2027";
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		String month_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		String month=month_year.split(" ")[0];
		String year=month_year.split(" ")[1];
		
		do {
			 driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			 month_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 month=month_year.split(" ")[0];
			 year=month_year.split(" ")[1];
			
		}while(!(month.equals(Month) && year.equals(Year)));
		
		driver.findElement(By.xpath("//a[text()='"+Date+"']")).click();
	}

}
