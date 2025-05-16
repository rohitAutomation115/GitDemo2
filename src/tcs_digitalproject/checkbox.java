package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ixigo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
	}

}
