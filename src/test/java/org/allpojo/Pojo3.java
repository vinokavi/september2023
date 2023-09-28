package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Pojo2{

	
	public Pojo3() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@class='cart-controls-add-cart']")
	private WebElement addcart;


	public WebElement getAddcart() {
		return addcart;
	}
	
	
	
	
	
}
