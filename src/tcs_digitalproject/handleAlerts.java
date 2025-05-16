package tcs_digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//fieldset/input[2]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//fieldset/input[3]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//fieldset/input[3]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();

	}

}
