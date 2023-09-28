package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends Pojo1 {

	public Pojo2() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(linkText = "Fresh Pink Lady Apples Each")
	private WebElement txtapple;


	public WebElement getTxtapple() {
		return txtapple;
	}
	
	
	
	
	
	
	
	
	
	
	
}
