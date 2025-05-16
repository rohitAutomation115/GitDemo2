package tcs_digitalproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class practice_actiondemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement coldriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<coldriver.findElements(By.tagName("a")).size();i++)
		{
		String openurl = Keys.chord(Keys.CONTROL,Keys.ENTER);
		coldriver.findElements(By.tagName("a")).get(i).sendKeys(openurl);
		}

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
