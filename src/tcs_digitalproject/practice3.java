package tcs_digitalproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91703\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String t=driver.findElement(By.xpath("//a[@class='blinkingText']")).getText();
		System.out.println(t);
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).click();;
		
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");
		
		 List<WebElement> lists = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		 
		 for(WebElement list:lists)
		 {
			 if(list.getText().equalsIgnoreCase("India"))
			 {
				 list.click();
			 }
		 }
		 
		 Thread.sleep(2000);
		 
		 Select s = new Select(driver.findElement(By.name("dropdown-class-example")));
		 
		 s.selectByValue("option2");
		 
		//Assert.assertEquals(driver.findElement(By.name("dropdown-class-example")).getText(),"option2 ");
		
		 Thread.sleep(2000);
		 
		 System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		 System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		 
		 driver.findElement(By.id("openwindow")).click();
		 
		 Thread.sleep(2000);
		 
		  Set<String> windows = driver.getWindowHandles();
		 
		  Iterator<String> it = windows.iterator();
		  
		  String pId = it.next();
		  String cId = it.next();
		  
		  driver.switchTo().window(cId);
		  
		  
		  String a=driver.findElement(By.xpath("//span[text()='info@qaclickacademy.com']")).getText();
		  System.out.println(a);
		  
		  driver.switchTo().window(pId);
		  
		  driver.findElement(By.id("alertbtn")).click();
		  
		  System.out.println(driver.switchTo().alert().getText());
		  
		  driver.switchTo().alert().accept();
		  
		  driver.findElement(By.id("confirmbtn")).click();
		  
		  System.out.println(driver.switchTo().alert().getText());
		  
		  driver.switchTo().alert().dismiss();
		  
		 System.out.println(driver.findElement(By.xpath("//input[@name='show-hide']")).isDisplayed());
		  
		 driver.findElement(By.id("hide-textbox")).click();
		 
		 System.out.println(driver.findElement(By.xpath("//input[@name='show-hide']")).isDisplayed());

		  driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		  
		  driver.findElement(By.id("first_date_picker")).click();
		  
		  String date="11";
		  
		  String month="May";
		  
		  String year="2027";
		  
		  driver.findElement(By.className("ui-datepicker-year")).click();
		  
	}

}
