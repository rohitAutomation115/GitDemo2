package tcs_digitalproject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login_form {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			Thread.sleep(2000);
			
			driver.findElement(By.id("inputUsername")).sendKeys("Rohit");
			
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");
			
			driver.findElement(By.className("submit")).click();
			
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			
			driver.findElement(By.partialLinkText("Forgot your password?")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rohit");
			
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rohit123@.com");
			
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rohit123@gmail.com");
			
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("7038667976");
			
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			
			driver.findElement(By.className("go-to-login-btn")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("inputUsername")).sendKeys("Rohit");
			
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
			
			driver.findElement(By.name("chkboxTwo")).click();
			
			driver.findElement(By.cssSelector("button[type='submit']")).click(); 
			
			Thread.sleep(5000);
			
			System.out.println(driver.findElement(By.xpath("//div/p")).getText());
			
			Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
			
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

}
