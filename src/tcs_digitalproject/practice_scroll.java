package tcs_digitalproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class practice_scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> values = driver.findElements(By.xpath("//fieldset/div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		
		String a = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1];
		
		String amount = a.trim();
		
		Assert.assertEquals(Integer.parseInt(amount),sum);
	} 

}
