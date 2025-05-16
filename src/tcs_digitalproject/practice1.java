package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rohit");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Rohit");
		
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("rohit123@.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("rohit123@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7038667976");
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String password=getPassword(driver);
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rohit");
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
	}

	private static String getPassword(WebDriver driver) {
		
		String passText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passArray=passText.split("'");
		
		String password=passArray[1].split("'")[0];
		return password;
			
	}

}
