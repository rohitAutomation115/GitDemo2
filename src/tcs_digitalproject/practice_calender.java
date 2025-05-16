package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class practice_calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		String date="13";
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("first_date_picker")).click();
		
		String aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(aMonth.equals("July") && aYear.equals("2026")))
		{
			driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
			 aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			 aYear=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		
		driver.findElement(By.id("third_date_picker")).click();
		
		Select	s=new Select(driver.findElement(By.className("ui-datepicker-month")));
		s.selectByIndex(4);
			
		Select y=new Select(driver.findElement(By.className("ui-datepicker-year")));
		
		y.selectByValue("2027");
		
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		
	}

}
