package tcs_digitalproject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class filetr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\91703\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        
		
      	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veg = driver.findElements(By.xpath("//tr/td[1]"));
		
		Thread.sleep(1000);
		
		Stream<WebElement> r = (Stream<WebElement>) veg.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		r.forEach(a->System.out.println(a));

	}

}
