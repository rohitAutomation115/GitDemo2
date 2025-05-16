package tcs_digitalproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class practice_scopeofdriver {

	public static void main(String[] args) throws InterruptedException, IOException {
      System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\91703\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        

      	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a =new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));		
		for(WebElement link:links)
		{
		String	url=link.getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		
		int res=conn.getResponseCode();
		System.out.println(res);
		
		a.assertTrue(res<400, "The link with text "+link.getText()+" is broken with code "+res);
		}
		a.assertAll();
	}
}