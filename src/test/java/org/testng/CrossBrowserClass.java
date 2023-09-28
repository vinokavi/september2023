package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserClass {

	
	WebDriver driver;
	
	@Parameters({"Browser"})
	
	@Test(priority=1)
	
	private void website(String s1) throws InterruptedException {

		if (s1.equals("ChromeBrowser")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if (s1.equals("EdgeBrowser")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}else {
			
			WebDriverManager.firefoxdriver().setup();
			driver =  new FirefoxDriver();
		}
		
		
		
		driver.get("https://www.woolworths.com.au/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.name("headerSearch")).sendKeys("Apple");
		WebElement btn = driver.findElement(By.id("wx-button-header-search-find"));
		btn.click();
		
		long id = Thread.currentThread().getId();
		System.out.println("btn:"+id);
		
	}
	
	
	@Test(priority=2)
	
	private void clickProduct() throws InterruptedException {
Thread.sleep(55000);
		WebElement product = driver.findElement(By.xpath("//a[text()='Fresh Pink Lady Apples Each']")); 
		product.click();
		
		long id = Thread.currentThread().getId();
		System.out.println("btn:"+id);
		
	}
	
	
	@Test(priority=3)
	
	private void addCart() throws InterruptedException {
Thread.sleep(40000);
		WebElement added = driver.findElement(By.xpath("//button[@class='cart-controls-add-button button button--primary-v2 _outOfTrolleyFocus']"));
		added.click();
		
		long id = Thread.currentThread().getId();
		System.out.println("btn:"+id);
	}
	
	
	
}
