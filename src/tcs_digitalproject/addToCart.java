package tcs_digitalproject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(5000);
		
		addItems(driver,itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		
		int j=0;
		
		List<WebElement> products=driver.findElements(By.xpath("//div/h4"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			
			List itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
				
			}
		}
		
		
	}

}
