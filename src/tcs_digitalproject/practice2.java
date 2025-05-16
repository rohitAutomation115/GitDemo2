package tcs_digitalproject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		String[] itmesNeeded= {"Brocolli","Cucumber"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver, itmesNeeded);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		
		driver.findElement(By.xpath("//div[@class='action-block']/button[@type='button']")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String promo = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		
		System.out.print(promo);
	}

	private static void addItems(WebDriver driver, String[] itmesNeeded) {
			
		int j=0;
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size(); i++)
		{
			String[] format1 = products.get(i).getText().split("-");
			
			String format2 = format1[0].trim();
			
			List itemsNeededList = Arrays.asList(itmesNeeded);
			
			if(itemsNeededList.contains(format2))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itmesNeeded.length)
				{
					break;
				}
				
			}
			
			
		}
	}

}
