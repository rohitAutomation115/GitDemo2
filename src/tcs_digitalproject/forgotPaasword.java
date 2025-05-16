package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotPaasword {

	public static void main(String[] args) throws InterruptedException {
		String name="Rohit";
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		
		String password=getPassword(driver);
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button.submit ")).click();
		
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.findElement(By.className("forgot-pwd-container")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rohit123@gmai.com");
		
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("Rohit123");
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7038667976");
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String newPass=driver.findElement(By.xpath("//form/p")).getText();
		
		String[] pass=newPass.split("'");
		
		String password=pass[1].split("'")[0];
		
		return password;
		
		
	}

}
