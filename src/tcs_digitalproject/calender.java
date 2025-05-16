package tcs_digitalproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		String Year="2021";
		String Month="5";
		String Date="11";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
		
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(Month)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='react-date-picker__wrapper']")).getText());
		
		 List<WebElement> actualList = driver.findElements(By.xpath("//div[@class='react-date-picker__inputGroup']"));
		 
		 for(int i=0;i<actualList.size();i++)
		 {
			System.out.println(actualList.get(i).getAttribute("value"));
		 }
		 
	}

}
