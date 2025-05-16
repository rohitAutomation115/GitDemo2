package tcs_digitalproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\91703\\Downloads\\SQL_part2.pdf");
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

	}

}
