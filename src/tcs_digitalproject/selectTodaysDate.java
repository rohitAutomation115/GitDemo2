package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectTodaysDate {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ixigo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		driver.findElement(By.cssSelector("p[data-testid='departureDate']")).click();
		
		driver.findElement(By.cssSelector("button[class*='react-calendar__tile react-calendar__tile']")).click();

	}

}
