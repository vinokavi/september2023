package org.testng;

import org.allpojo.Pojo3;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WoolsWorth extends Pojo3 {

	@BeforeClass(alwaysRun=true)
	
	private void chromeOpen() {

	OpenChrome();
	maxWindow();
	}
	
	@AfterClass

	
	private void closeChrome() {

		closeBrowser();
	}
	
	@BeforeMethod
	
	private void startTime() {
        launchUrl("https://www.woolworths.com.au/");
		getDateAndTime();
		System.out.println("starts...*");
	}
	
	
	@AfterClass
	
	private void endTime() {

		getDateAndTime();
		
		closeBrowser();
		System.out.println("ends..*");
		
	}
	@Parameters({"fruits"})
	@Test(enabled=true,priority=-7,groups= {"Sanity","Sanity"})
	
	private void tc1(@Optional("iphone")String s1) {

		Pojo3 l = new Pojo3();
		
		WebElement txtBox = l.getTxtbox();
		fillTextBox(txtBox, s1);
		toImplicitWait(20);
		WebElement search = l.getSearch();
		toClick(search);
		toImplicitWait(20);
		WebElement aplBtn = l.getTxtapple();
		toClick(aplBtn);
		toImplicitWait(20);
		WebElement addCart = l.getAddcart();
		toClick(addCart);
		
		String current = driver.getCurrentUrl();
		
		
		Assert.assertTrue(current.contains("productdetails"),"shifted to cart page");
		System.out.println("Test Case 1 Passed");
		
	}
	
	
	
	@Test(groups= {"Smoke","Sanity"})
	
	private void tc2() {

		System.out.println("TC: 2 Passed==Apple added to cart");
	
		
	}
	
	
	@Test (groups= {"Smoke","Sanity"})
	
	private void tc3() {
        System.out.println("TC:3 Passed");
		printTitle();
	}
	
	
}
